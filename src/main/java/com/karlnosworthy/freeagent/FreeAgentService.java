package com.karlnosworthy.freeagent;

import com.karlnosworthy.freeagent.model.FreeAgentCompany;
import com.karlnosworthy.freeagent.model.wrapper.*;
import retrofit.client.Response;
import retrofit.http.*;

public interface FreeAgentService {

    //
    // ==== Company ====
    //
    @GET("/company")
    FreeAgentCompanyWrapper getCompany();

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

    @GET("/projects/")
    FreeAgentProjectsWrapper getProjects(@Query("view") String viewFilter);

    @GET("/projects")
    FreeAgentProjectsWrapper getProjectsForContact(@Query("contact") String contactURL);

    @GET("/projects/{id}")
    FreeAgentProjectWrapper getProject(@Path("id") String projectId);

    @POST("/projects")
    FreeAgentProjectWrapper createProject(@Body FreeAgentProjectWrapper project);

    @PUT("/projects/{id}")
    Response updateProject(@Body FreeAgentProjectWrapper project, @Path("id") String projectId);

    @DELETE("/projects/{id}")
    Response deleteProject(@Path("id") String projectId);
}



