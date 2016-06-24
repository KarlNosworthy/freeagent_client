package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentTask;

import java.util.List;

/**
 * Created by karl on 18/05/2016.
 */
public class FreeAgentTaskWrapper {

    @Expose
    private FreeAgentTask task;

    @Expose
    private List<FreeAgentTask> tasks;


    public FreeAgentTaskWrapper() {
        super();
    }

    public FreeAgentTaskWrapper(FreeAgentTask task) {
        super();
        this.task = task;
    }

    public FreeAgentTaskWrapper(List<FreeAgentTask> tasks) {
        super();
        this.tasks = tasks;
    }

    public boolean hasProject() {
        return task != null;
    }

    public FreeAgentTask getTask() {
        return task;
    }

    public void setProject(FreeAgentTask task) {
        this.task = task;
    }

    public boolean hasProjects() {
        return tasks != null;
    }

    public List<FreeAgentTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<FreeAgentTask> tasks) {
        this.tasks = tasks;
    }


}
