package com.karlnosworthy.freeagent.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by karl on 18/05/2016.
 */
public class FreeAgentTask {

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("is_billable")
    private boolean isBillable;

    @Expose
    @SerializedName("billing_rate")
    private String billingRate;

    @Expose
    @SerializedName("billing_period")
    private String billingPeriod;

    @Expose
    @SerializedName("status")
    private String status;
}
