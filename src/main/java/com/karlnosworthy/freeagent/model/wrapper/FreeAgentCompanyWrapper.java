package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.karlnosworthy.freeagent.model.FreeAgentCompany;


public class FreeAgentCompanyWrapper {

    @Expose
    private FreeAgentCompany company;

    public FreeAgentCompany getCompany() {
        return company;
    }

    public void setCompany(FreeAgentCompany company) {
        this.company = company;
    }
}
