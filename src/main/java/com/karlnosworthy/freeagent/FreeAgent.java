package com.karlnosworthy.freeagent;

import com.karlnosworthy.freeagent.model.FreeAgentContact;
import com.karlnosworthy.freeagent.model.FreeAgentContactWrapper;
import com.karlnosworthy.freeagent.model.FreeAgentContactsWrapper;
import retrofit.http.*;

public interface FreeAgent {

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
    FreeAgentContactWrapper getContact(@Path("id") Integer contactId);

    @POST("/contacts")
    FreeAgentContactWrapper createContact(@Body FreeAgentContact contact);

    @PUT("/contacts/:{id}")
    void updateContact(@Body FreeAgentContact contact, @Path("id") Integer contactId);

    @DELETE("/contacts/:id")
    void deleteContact(@Path("id") Integer contactId);
}



