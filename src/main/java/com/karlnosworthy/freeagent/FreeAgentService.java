package com.karlnosworthy.freeagent;

import com.karlnosworthy.freeagent.model.FreeAgentContact;
import com.karlnosworthy.freeagent.model.FreeAgentContactWrapper;
import com.karlnosworthy.freeagent.model.FreeAgentContactsWrapper;
import retrofit.client.Response;
import retrofit.http.*;

public interface FreeAgentService {

    //
    // ==== Contacts ===
    //
    @GET("/contacts/")
    FreeAgentContactsWrapper listContacts();

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
}



