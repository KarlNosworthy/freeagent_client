package com.karlnosworthy.freeagent.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FreeAgentProjectWrapper {

    @Expose
    @SerializedName("project")
    private FreeAgentProject project;

    public FreeAgentProject getProject() {
        return project;
    }

    public void setProject(FreeAgentProject project) {
        this.project = project;
    }
}
