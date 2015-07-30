package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentContact;

public class FreeAgentContactWrapper {

    @Expose
    private FreeAgentContact contact;


    public FreeAgentContactWrapper() {
        super();
    }

    public FreeAgentContactWrapper(FreeAgentContact contact) {
        super();
        this.contact = contact;
    }

    public FreeAgentContact getContact() {
        return contact;
    }

    public void setContact(FreeAgentContact contact) {
        this.contact = contact;
    }
}
