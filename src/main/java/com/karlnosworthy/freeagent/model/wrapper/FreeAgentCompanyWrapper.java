package com.karlnosworthy.freeagent.model.wrapper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karlnosworthy.freeagent.model.FreeAgentCompany;


public class FreeAgentCompanyWrapper {

    @Expose
    @SerializedName("company")
    private FreeAgentCompany company;


    public FreeAgentCompany getCompany() {
        return company;
    }

    public void setCompany(FreeAgentCompany company) {
        this.company = company;
    }

}
