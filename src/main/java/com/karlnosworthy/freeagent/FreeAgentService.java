package com.karlnosworthy.freeagent;

import com.karlnosworthy.freeagent.model.FreeAgentUser;
import com.karlnosworthy.freeagent.model.wrapper.*;
import retrofit2.Call;

import retrofit2.Response;
import retrofit2.http.*;

public interface FreeAgentService {

    //
    // ==== Company ====
    //
    @GET("company")
    Call<FreeAgentCompanyWrapper> getCompany();

    //
    // ==== Contacts ====
    //
    @GET("contacts/")
    Call<FreeAgentContactWrapper> getContacts();

    @GET("contacts/")
    Call<FreeAgentContactWrapper> getContacts(@Query("view") String viewFilter);

    @GET("contacts/")
    Call<FreeAgentContactWrapper> getContacts(@Query("view") String viewFilter, @Query("sort") String sortOrder);

    @GET("contacts/{id}")
    Call<FreeAgentContactWrapper> getContact(@Path("id") String contactId);

    @POST("contacts")
    Call<FreeAgentContactWrapper> createContact(@Body FreeAgentContactWrapper contact);

    @PUT("contacts/{id}")
    Response updateContact(@Body FreeAgentContactWrapper contact, @Path("id") String contactId);

    @DELETE("contacts/{id}")
    Response deleteContact(@Path("id") String contactId);

    //
    // ==== Invoices ====
    //
    @GET("invoices")
    Call<FreeAgentInvoiceWrapper> getInvoices(@Query("nested_invoice_items") boolean nestInvoiceItems);

    // add call here to list for past n months

    @GET("invoices")
    Call<FreeAgentInvoiceWrapper> getInvoices(@Query("view") String viewType, @Query("per_page") int itemsPerPage);


    @GET("invoices/{id}")
    Call<FreeAgentInvoiceWrapper> getInvoice(@Path("id") String invoiceId);

    @POST("invoices")
    Call<FreeAgentInvoiceWrapper> createInvoice(@Body FreeAgentInvoiceWrapper invoice);

    @PUT("invoices/{id}")
    Response updateInvoice(@Body FreeAgentInvoiceWrapper invoice, @Path("id") String invoiceId);

    @DELETE("invoices/{id}")
    Response deleteInvoice(@Path("id") String invoiceId);

    //
    // ==== Projects ====
    //
    @GET("projects/")
    Call<FreeAgentProjectWrapper> getProjects();

    @GET("projects/")
    Call<FreeAgentProjectWrapper> getProjects(@Query("view") String viewFilter);

    @GET("projects")
    Call<FreeAgentProjectWrapper> getProjectsForContact(@Query("contact") String contactURL);

    @GET("projects/{id}")
    Call<FreeAgentProjectWrapper> getProject(@Path("id") String projectId);

    @POST("projects")
    Call<FreeAgentProjectWrapper> createProject(@Body FreeAgentProjectWrapper project);

    @PUT("projects/{id}")
    Response updateProject(@Body FreeAgentProjectWrapper project, @Path("id") String projectId);

    @DELETE("projects/{id}")
    Response deleteProject(@Path("id") String projectId);

    //
    // ==== Users ====
    //
    @GET("users/")
    Call<FreeAgentUserWrapper> getUsers();

    @GET("users/{id}")
    Call<FreeAgentUserWrapper> getUser(@Path("id") String userId);

    @GET("users/me")
    Call<FreeAgentUserWrapper> getCurrentUser();

    @POST("users")
    Call<FreeAgentUserWrapper> createUser(@Body FreeAgentUserWrapper user);

    @PUT("users/{id}")
    Response<FreeAgentUser> updateUser(@Body FreeAgentUserWrapper user, @Path("id") String userId);

    @DELETE("users/{id}")
    Response deleteUser(@Path("id") String userId);


    //
    // ==== Expenses ====
    //
    @GET("expenses")
    Call<FreeAgentExpenseWrapper> getExpenses();

    @GET("expenses")
    Call<FreeAgentExpenseWrapper> getExpensesBetween(@Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("per_page") int itemsPerPage);
}



