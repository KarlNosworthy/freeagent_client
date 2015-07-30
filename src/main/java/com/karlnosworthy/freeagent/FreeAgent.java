package com.karlnosworthy.freeagent;

import com.karlnosworthy.freeagent.model.Contact;
import com.karlnosworthy.freeagent.model.ContactWrapper;
import com.karlnosworthy.freeagent.model.ContactsWrapper;
import retrofit.http.*;

public interface FreeAgent {

    //
    // ==== ContactsWrapper ===
    //
    @GET("/contacts/")
    ContactsWrapper listContacts();

    @GET("/contacts/")
    ContactsWrapper getContacts(@Query("view") String viewFilter);

    @GET("/contacts/")
    ContactsWrapper getContacts(@Query("view") String viewFilter, @Query("sort") String sortOrder);

    @GET("/contacts/{id}")
    ContactWrapper getContact(@Path("id") Integer contactId);

    @POST("/contacts")
    ContactWrapper createContact(@Body Contact contact);

    @PUT("/contacts/:{id}")
    void updateContact(@Body Contact contact, @Path("id") Integer contactId);

    @DELETE("/contacts/:id")
    void deleteContact(@Path("id") Integer contactId);
}



