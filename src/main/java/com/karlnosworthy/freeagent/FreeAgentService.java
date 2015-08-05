package com.karlnosworthy.freeagent;

import com.karlnosworthy.freeagent.model.FreeAgentCompany;
import com.karlnosworthy.freeagent.model.FreeAgentUser;
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
    FreeAgentContactWrapper getContacts();

    @GET("/contacts/")
    FreeAgentContactWrapper getContacts(@Query("view") String viewFilter);

    @GET("/contacts/")
    FreeAgentContactWrapper getContacts(@Query("view") String viewFilter, @Query("sort") String sortOrder);

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
    FreeAgentProjectWrapper getProjects();

    @GET("/projects/")
    FreeAgentProjectWrapper getProjects(@Query("view") String viewFilter);

    @GET("/projects")
    FreeAgentProjectWrapper getProjectsForContact(@Query("contact") String contactURL);

    @GET("/projects/{id}")
    FreeAgentProjectWrapper getProject(@Path("id") String projectId);

    @POST("/projects")
    FreeAgentProjectWrapper createProject(@Body FreeAgentProjectWrapper project);

    @PUT("/projects/{id}")
    Response updateProject(@Body FreeAgentProjectWrapper project, @Path("id") String projectId);

    @DELETE("/projects/{id}")
    Response deleteProject(@Path("id") String projectId);

    //
    // ==== Users ====
    //
    @GET("/users/")
    FreeAgentUserWrapper getUsers();

    @GET("/users/{id}")
    FreeAgentUserWrapper getUser(@Path("id") String userId);

    @GET("/users/me")
    FreeAgentUserWrapper getCurrentUser();

    @POST("/users")
    FreeAgentUserWrapper createUser(@Body FreeAgentUserWrapper user);

    @PUT("/users/{id}")
    Response updateUser(@Body FreeAgentUserWrapper user, @Path("id") String userId);

    @DELETE("/users/{id}")
    Response deleteUser(@Path("id") String userId);
}



