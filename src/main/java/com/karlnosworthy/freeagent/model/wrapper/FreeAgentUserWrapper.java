package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentUser;

import java.util.List;

public class FreeAgentUserWrapper {

    @Expose
    private FreeAgentUser user;

    @Expose
    private List<FreeAgentUser> users;


    public FreeAgentUserWrapper() {
        super();
    }

    public FreeAgentUserWrapper(FreeAgentUser user) {
        super();
        this.user = user;
    }

    public FreeAgentUserWrapper(List<FreeAgentUser> projects) {
        super();
        this.user = user;
    }

    public boolean hasUser() {
        return user != null;
    }

    public FreeAgentUser getUser() {
        return user;
    }

    public void setUser(FreeAgentUser user) {
        this.user = user;
    }

    public boolean hasUsers() {
        return users != null;
    }

    public List<FreeAgentUser> getUsers() {
        return users;
    }

    public void setUsers(List<FreeAgentUser> users) {
        this.users = users;
    }
}
