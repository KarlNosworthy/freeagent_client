package com.karlnosworthy.freeagent.model;

import com.google.gson.annotations.Expose;

public class ContactWrapper {

    @Expose
    private Contact contact;


    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
