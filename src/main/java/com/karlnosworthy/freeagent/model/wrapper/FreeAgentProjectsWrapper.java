package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karlnosworthy.freeagent.model.FreeAgentProject;

import java.util.List;

public class FreeAgentProjectsWrapper {

    @Expose
    @SerializedName("projects")
    private List<FreeAgentProject> projectList;

    public List<FreeAgentProject> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<FreeAgentProject> projectList) {
        this.projectList = projectList;
    }
}
