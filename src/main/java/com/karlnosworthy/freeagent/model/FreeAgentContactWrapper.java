package com.karlnosworthy.freeagent.model;

import com.google.gson.annotations.Expose;

public class FreeAgentContactWrapper {

    @Expose
    private FreeAgentContact contact;


    public FreeAgentContact getContact() {
        return contact;
    }

    public void setContact(FreeAgentContact contact) {
        this.contact = contact;
    }
}
