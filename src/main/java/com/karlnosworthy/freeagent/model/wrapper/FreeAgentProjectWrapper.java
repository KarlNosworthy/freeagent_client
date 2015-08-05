package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentContact;
import com.karlnosworthy.freeagent.model.FreeAgentProject;

import java.util.List;

public class FreeAgentProjectWrapper {

    @Expose
    private FreeAgentProject project;

    @Expose
    private List<FreeAgentProject> projects;


    public FreeAgentProjectWrapper() {
        super();
    }

    public FreeAgentProjectWrapper(FreeAgentProject project) {
        super();
        this.project = project;
    }

    public FreeAgentProjectWrapper(List<FreeAgentProject> projects) {
        super();
        this.projects = projects;
    }

    public boolean hasProject() {
        return project != null;
    }

    public FreeAgentProject getProject() {
        return project;
    }

    public void setProject(FreeAgentProject project) {
        this.project = project;
    }

    public boolean hasProjects() {
        return projects != null;
    }

    public List<FreeAgentProject> getProjects() {
        return projects;
    }

    public void setProjects(List<FreeAgentProject> projects) {
        this.projects = projects;
    }
}
