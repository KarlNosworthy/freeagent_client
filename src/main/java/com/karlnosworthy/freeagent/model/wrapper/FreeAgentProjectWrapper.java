package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karlnosworthy.freeagent.model.FreeAgentProject;

import java.util.List;

public class FreeAgentProjectWrapper {

    @Expose
    @SerializedName("project")
    private FreeAgentProject project;


    public FreeAgentProjectWrapper() {
        super();
    }

    public FreeAgentProjectWrapper(FreeAgentProject project) {
        super();
        this.project = project;
    }

    public FreeAgentProject getProject() {
        return project;
    }

    public void setProject(FreeAgentProject project) {
        this.project = project;
    }
}
