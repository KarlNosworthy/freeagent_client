package com.karlnosworthy.freeagent;

import com.karlnosworthy.freeagent.model.wrapper.FreeAgentContactWrapper;
import com.karlnosworthy.freeagent.model.wrapper.FreeAgentContactsWrapper;
import com.karlnosworthy.freeagent.model.wrapper.FreeAgentProjectWrapper;
import com.karlnosworthy.freeagent.model.wrapper.FreeAgentProjectsWrapper;
import retrofit.client.Response;
import retrofit.http.*;

public interface FreeAgentService {

    //
    // ==== Contacts ====
    //
    @GET("/contacts/")
    FreeAgentContactsWrapper getContacts();

    @GET("/contacts/")
    FreeAgentContactsWrapper getContacts(@Query("view") String viewFilter);

    @GET("/contacts/")
    FreeAgentContactsWrapper getContacts(@Query("view") String viewFilter, @Query("sort") String sortOrder);

    @GET("/contacts/{id}")
    FreeAgentContactWrapper getContact(@Path("id") String contactId);

    @POST("/contacts")
    FreeAgentContactWrapper createContact(@Body FreeAgentContactWrapper contact);

    @PUT("/contacts/{id}")
    Response updateContact(@Body FreeAgentContactWrapper contact, @Path("id") String contactId);

    @DELETE("/contacts/{id}")
    Response deleteContact(@Path("id") String contactId);

    //
    // ==== Projects ====
    //
    @GET("/projects/")
    FreeAgentProjectsWrapper getProjects();

    @GET("/projects")
    FreeAgentProjectsWrapper getProjects(@Query("contact") String contactURL);

    @GET("/projects/{id}")
    FreeAgentProjectWrapper getProject(@Path("id") String projectId);
}



