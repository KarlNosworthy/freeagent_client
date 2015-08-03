package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karlnosworthy.freeagent.model.FreeAgentProject;
import com.karlnosworthy.freeagent.model.FreeAgentUser;

import java.util.List;

public class FreeAgentUsersWrapper {

    @Expose
    @SerializedName("users")
    private List<FreeAgentUser> userList;

    public List<FreeAgentUser> getUserList() {
        return userList;
    }

    public void setUserList(List<FreeAgentUser> userList) {
        this.userList = userList;
    }
}
