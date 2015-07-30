package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karlnosworthy.freeagent.model.FreeAgentContact;

import java.util.List;

public class FreeAgentContactsWrapper {

    @Expose
    @SerializedName("contacts")
    private List<FreeAgentContact> contactList;


    public List<FreeAgentContact> getContactList() {
        return contactList;
    }

    public void setContactList(List<FreeAgentContact> contactList) {
        this.contactList = contactList;
    }
}
