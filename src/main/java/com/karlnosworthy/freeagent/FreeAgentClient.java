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
import com.karlnosworthy.freeagent.model.Contact;
import com.karlnosworthy.freeagent.model.ContactWrapper;
import com.karlnosworthy.freeagent.model.ContactsWrapper;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * A simple, retrofit based client to allow CRUD access to a FreeAgent account. Utilises OAuth2 to provide
 * suitable authentication before an instance can be supplied for use.
 *
 * @author Karl Nosworthy
 */
public class FreeAgentClient {

    public static final String SANDBOX_URL = "https://api.sandbox.freeagent.com";
    public static final String LIVE_URL = "https://api.freeagent.com/v2";

    private static final File DATA_STORE_DIR = new File(System.getProperty("user.home"), ".store/oauth2_sample");

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();
    private static FileDataStoreFactory DATA_STORE_FACTORY;
    private Credential credential;
    private static FreeAgent freeAgentInstance;



    /**
     * Authorises, initialises and returns a new FreeAgentClient instance.
     *
     * @param identifier The identifier to use for OAuth authentication and FreeAgent recognition.
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
                new GenericUrl("https://api.freeagent.com/v2/token_endpoint"),
                new ClientParametersAuthentication(identifier, secret),
                identifier,
                "https://api.freeagent.com/v2/approve_app")
                .setDataStoreFactory(DATA_STORE_FACTORY).build();

        // authorize
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setHost("127.0.0.1")
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
     * Returns a list of all the known contacts contained within FreeAgent
     * for the authorised account.
     *
     * @return A list of Contact instances.
     */
    public List<Contact> getContacts() {
        ContactsWrapper contactsWrapper = freeAgentInstance.listContacts();
        if (contactsWrapper != null) {
            return contactsWrapper.getContactList();
        }
        return null;
    }

    /**
     * Returns a list of all the known contacts contained within FreeAgent
     * for the authorised account.
     *
     * @param viewType The view type {@link com.karlnosworthy.freeagent.FreeAgentClient.ContactViewType} filter to apply to the contacts
     * @return A list of Contact instances.
     */
    public List<Contact> getContacts(ContactViewType viewType) {
        ContactsWrapper contactsWrapper = freeAgentInstance.getContacts(viewType.identifier);
        if (contactsWrapper != null) {
            return contactsWrapper.getContactList();
        }
        return null;
    }

    /**
     * Returns a list of all the known contacts contained within FreeAgent
     * for the authorised account.
     *
     * @param viewType The view type {@link com.karlnosworthy.freeagent.FreeAgentClient.ContactViewType} filter to apply to the contacts.
     * @param sortOrderType The sort order {@link com.karlnosworthy.freeagent.FreeAgentClient.ContactSortOrderType} to apply to the contacts.
     * @return A list of Contact instances.
     */
    public List<Contact> getContacts(ContactViewType viewType, ContactSortOrderType sortOrderType) {
        ContactsWrapper contactsWrapper = freeAgentInstance.getContacts(viewType.identifier, sortOrderType.identifier);
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
    public Contact getContact(Integer contactId) {
        if (contactId != null && contactId > 0) {
            ContactWrapper contactWrapper = freeAgentInstance.getContact(contactId);
            if (contactWrapper != null) {
                return contactWrapper.getContact();
            }
        }
        return null;
    }


    private FreeAgentClient(Credential oauthCredential, String apiURL) {
        super();
        this.credential = oauthCredential;

        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(apiURL);

        builder.setRequestInterceptor(new RequestInterceptor() {

            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("Authorization", "Bearer " + credential.getAccessToken());
            }
        });

        RestAdapter restAdapter = builder.build();

        freeAgentInstance = restAdapter.create(FreeAgent.class);
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
