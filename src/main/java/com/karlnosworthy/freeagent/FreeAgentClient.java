package com.karlnosworthy.freeagent;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.karlnosworthy.freeagent.model.*;
import com.karlnosworthy.freeagent.model.wrapper.*;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.Response;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * A simple, retrofit based client to allow CRUD access to a FreeAgentService account. Utilises OAuth2 to provide
 * suitable authentication before an instance can be supplied for use.
 *
 * @author Karl Nosworthy
 */
public class FreeAgentClient {

    public static final String SANDBOX_URL = "https://api.sandbox.freeagent.com";
    public static final String LIVE_URL = "https://api.freeagent.com/v2";

    private static final String LOCALHOST = "127.0.0.1"; // NOPMD

    private static final File DATA_STORE_DIR = new File(System.getProperty("user.home"), ".store/oauth2_sample");

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();
    private static FileDataStoreFactory DATA_STORE_FACTORY;
    private static FreeAgentService freeAgentServiceInstance;
    private Credential credential;



    /**
     * Authorises, initialises and returns a new FreeAgentClient instance.
     *
     * @param identifier The identifier to use for OAuth authentication and FreeAgentService recognition.
     * @param secret The secret to use for OAuth authentication.
     * @param apiURL The URL of the API to target {@link #LIVE_URL}, {@link #SANDBOX_URL} etc.
     * @return An authenticated instance which is ready to use or null
     * @throws IOException Thrown a problem is encountered during the OAuth process.
     */
    public static FreeAgentClient authorise(String identifier, String secret, String apiURL) throws IOException {

        if (DATA_STORE_FACTORY == null) {
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        }

        AuthorizationCodeFlow flow = new AuthorizationCodeFlow.Builder(BearerToken
                .authorizationHeaderAccessMethod(),
                HTTP_TRANSPORT,
                JSON_FACTORY,
                new GenericUrl(apiURL + "/token_endpoint"),
                new ClientParametersAuthentication(identifier, secret),
                identifier,
                apiURL + "/approve_app")
                .setDataStoreFactory(DATA_STORE_FACTORY).build();

        // authorize
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setHost(LOCALHOST)
                                                                        .setPort(8080)
                                                                        .build();

        final Credential credential = new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");

        if (credential != null) {
            return new FreeAgentClient(credential, apiURL);
        } else {
            return null;
        }
    }

    /**
     * Returns the basic information about the company contained within FreeAgent
     * for the authorised account.
     *
     * @return A populated FreeAgentCompany instance or null.
     */
    public FreeAgentCompany getCompany() {
        FreeAgentCompanyWrapper companyWrapper = freeAgentServiceInstance.getCompany();

        if (companyWrapper != null) {
            return companyWrapper.getCompany();
        }
        return null;
    }

    /**
     * Returns a list of all the known contacts contained within FreeAgent
     * for the authorised account.
     *
     * @return A list of Contact instances.
     */
    public List<FreeAgentContact> getContacts() {
        FreeAgentContactsWrapper contactsWrapper = freeAgentServiceInstance.getContacts();
        if (contactsWrapper != null) {
            return contactsWrapper.getContactList();
        }
        return null;
    }

    /**
     * Returns a list of all the known contacts contained within FreeAgentService
     * for the authorised account.
     *
     * @param viewType The view type {@link com.karlnosworthy.freeagent.FreeAgentClient.ContactViewType} filter to apply to the contacts
     * @return A list of Contact instances.
     */
    public List<FreeAgentContact> getContacts(ContactViewType viewType) {
        FreeAgentContactsWrapper contactsWrapper = freeAgentServiceInstance.getContacts(viewType.identifier);
        if (contactsWrapper != null) {
            return contactsWrapper.getContactList();
        }
        return null;
    }

    /**
     * Returns a list of all the known contacts contained within FreeAgentService
     * for the authorised account.
     *
     * @param viewType The view type {@link com.karlnosworthy.freeagent.FreeAgentClient.ContactViewType} filter to apply to the contacts.
     * @param sortOrderType The sort order {@link com.karlnosworthy.freeagent.FreeAgentClient.ContactSortOrderType} to apply to the contacts.
     * @return A list of Contact instances.
     */
    public List<FreeAgentContact> getContacts(ContactViewType viewType, ContactSortOrderType sortOrderType) {
        FreeAgentContactsWrapper contactsWrapper = freeAgentServiceInstance.getContacts(viewType.identifier, sortOrderType.identifier);
        if (contactsWrapper != null) {
            return contactsWrapper.getContactList();
        }
        return null;
    }

    /**
     * Retrieves the contact that matches the specified id.
     *
     * @param contactId The id to match.
     * @return A Contact instance or null if the id supplied was invalid or could not be matched.
     */
    public FreeAgentContact getContact(String contactId) {
        if (contactId != null && !contactId.isEmpty()) {
            FreeAgentContactWrapper contactWrapper = freeAgentServiceInstance.getContact(contactId);
            if (contactWrapper != null) {
                return contactWrapper.getContact();
            }
        }
        return null;
    }

    /**
     * Attempts to create a new contact entry in the associated FreeAgent account.
     *
     * Will return null if the contact instance provided is null or cannot be saved into the account.
     *
     * @param contact The populated contact instance.
     * @return The updated contact instance or null.
     */
    public FreeAgentContact createContact(FreeAgentContact contact) {
        if (contact != null) {
            FreeAgentContactWrapper contactWrapper = freeAgentServiceInstance.createContact(new FreeAgentContactWrapper(contact));
            if (contactWrapper != null) {
                return contactWrapper.getContact();
            }
        }
        return null;
    }

    /**
     * Attempts to update the specified contact entry in the associated FreeAgent account.
     *
     * @param contact The populated contact instance.
     * @return True if the contact has been updated successfully, otherwise false.
     */
    public boolean updateContact(FreeAgentContact contact) {
        if (contact != null) {
            String contactId = extractIdentifier(contact.getUrl());

            if (contactId != null && !contactId.isEmpty()) {
                Response response = freeAgentServiceInstance.updateContact(new FreeAgentContactWrapper(contact), contactId);
                if (response.getStatus() == 200) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * Attempts to delete the specified contact entry in the associated FreeAgent account.
     *
     * @param contact The populated contact instance.
     * @return True if the contact has been deleted successfully, otherwise false.
     */
    public boolean deleteContact(FreeAgentContact contact) {
        if (contact != null) {
            String contactId = extractIdentifier(contact.getUrl());

            if (contactId != null && !contactId.isEmpty()) {
                Response response = freeAgentServiceInstance.deleteContact(contactId);

                if (response.getStatus() == 200) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * Retrieves the Contact associated with the specified project.
     *
     * @param project The populated project instance to retrieve the contact for.
     * @return A populated FreeAgentContact instance or null if the contact could not be found.
     */
    public FreeAgentContact getContactForProject(FreeAgentProject project) {
        if (project != null) {
            String contactId = extractIdentifier(project.getContact());

            if (contactId != null && !contactId.isEmpty()) {
                FreeAgentContactWrapper contactWrapper = freeAgentServiceInstance.getContact(contactId);

                if (contactWrapper != null) {
                    return contactWrapper.getContact();
                }
            }
        }
        return null;
    }

    /**
     * Returns a list of all the known projects contained within FreeAgent
     * for the authorised account.
     *
     * @return A list of Project instances.
     */
    public List<FreeAgentProject> getProjects() {
        FreeAgentProjectsWrapper projectsWrapper = freeAgentServiceInstance.getProjects();

        if (projectsWrapper != null) {
            return projectsWrapper.getProjectList();
        }
        return null;
    }

    /**
     * Returns a list of projects that are associated with the specified contact.
     *
     * @param contact The contact instance to look up projects for.
     * @return A list of the appropriate projects or null.
     */
    public List<FreeAgentProject> getProjects(FreeAgentContact contact) {
        if (contact != null && contact.getUrl() != null && !contact.getUrl().isEmpty()) {

            FreeAgentProjectsWrapper projectsWrapper = freeAgentServiceInstance.getProjects(contact.getUrl());
            if (projectsWrapper != null) {
                return projectsWrapper.getProjectList();
            }
        }
        return null;
    }

    /**
     * Retrieves the project that matches the specified id.
     *
     * @param projectId The id to match.
     * @return A Project instance or null if the id supplied was invalid or could not be matched.
     */
    public FreeAgentProject getProject(String projectId) {
        if (projectId != null && !projectId.isEmpty()) {
            FreeAgentProjectWrapper projectWrapper = freeAgentServiceInstance.getProject(projectId);

            if (projectWrapper != null) {
                return projectWrapper.getProject();
            }
        }
        return null;
    }

    private FreeAgentClient(Credential oauthCredential, String apiURL) {
        super();
        this.credential = oauthCredential;

        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(apiURL);

        builder.setLogLevel(RestAdapter.LogLevel.FULL);
        builder.setRequestInterceptor(new RequestInterceptor() {

            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("Authorization", "Bearer " + credential.getAccessToken());
            }
        });

        RestAdapter restAdapter = builder.build();

        freeAgentServiceInstance = restAdapter.create(FreeAgentService.class);
    }

    public String extractIdentifier(String url) {
        if (url != null && !url.isEmpty()) {
            return url.substring(1 + url.lastIndexOf("/"));
        }
        return "";
    }

    public enum ContactViewType {
        All("all"),
        Active("active"),
        Clients("clients"),
        Suppliers("suppliers"),
        ActiveProjects("active_projects"),
        CompletedProjects("completed_projects"),
        OpenClients("open_clients"),
        OpenSuppliers("open_suppliers"),
        Hidden("hidden");

        private String identifier;

        ContactViewType(String identifier) {
            this.identifier = identifier;
        }
    }

    public enum ContactSortOrderType {

        Name(""),
        CreatedAtAscending("created_at"),
        CreatedAtDescending("-created_at"),
        UpdatedAtAscending("updated_at"),
        UpdatedAtDescending("-updated_at");

        private String identifier;

        ContactSortOrderType(String identifier) {
            this.identifier = identifier;
        }
    }
}
