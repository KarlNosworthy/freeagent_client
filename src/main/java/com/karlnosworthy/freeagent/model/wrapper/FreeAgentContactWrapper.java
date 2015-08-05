package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentContact;

import java.util.List;

public class FreeAgentContactWrapper {

    @Expose
    private FreeAgentContact contact;

    @Expose
    private List<FreeAgentContact> contacts;


    public FreeAgentContactWrapper() {
        super();
    }

    public FreeAgentContactWrapper(FreeAgentContact contact) {
        super();
        this.contact = contact;
    }

    public FreeAgentContactWrapper(List<FreeAgentContact> contacts) {
        super();
        this.contacts = contacts;
    }

    public boolean hasContact() {
        return contact != null;
    }

    public FreeAgentContact getContact() {
        return contact;
    }

    public void setContact(FreeAgentContact contact) {
        this.contact = contact;
    }

    public boolean hasContacts() {
        return contacts != null;
    }

    public List<FreeAgentContact> getContacts() {
        return contacts;
    }

    public void setContacts(List<FreeAgentContact> contacts) {
        this.contacts = contacts;
    }
}
