package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karlnosworthy.freeagent.model.FreeAgentUser;

import java.util.List;

public class FreeAgentUserWrapper {

    @Expose
    @SerializedName("user")
    private FreeAgentUser user;


    public FreeAgentUserWrapper() {
        super();
    }

    public FreeAgentUserWrapper(FreeAgentUser user) {
        super();
        this.user = user;
    }

    public FreeAgentUser getUser() {
        return user;
    }

    public void setUser(FreeAgentUser user) {
        this.user = user;
    }
}
