
package com.karlnosworthy.freeagent.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class FreeAgentProject {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contact")
    @Expose
    private String contact;
    @SerializedName("budget")
    @Expose
    private Integer budget;
    @SerializedName("is_ir35")
    @Expose
    private Boolean isIr35;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("budget_units")
    @Expose
    private String budgetUnits;
    @SerializedName("normal_billing_rate")
    @Expose
    private String normalBillingRate;
    @SerializedName("hours_per_day")
    @Expose
    private String hoursPerDay;
    @SerializedName("uses_project_invoice_sequence")
    @Expose
    private Boolean usesProjectInvoiceSequence;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("billing_period")
    @Expose
    private String billingPeriod;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 
     * @return
     *     The budget
     */
    public Integer getBudget() {
        return budget;
    }

    /**
     * 
     * @param budget
     *     The budget
     */
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    /**
     * 
     * @return
     *     The isIr35
     */
    public Boolean getIsIr35() {
        return isIr35;
    }

    /**
     * 
     * @param isIr35
     *     The is_ir35
     */
    public void setIsIr35(Boolean isIr35) {
        this.isIr35 = isIr35;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The budgetUnits
     */
    public String getBudgetUnits() {
        return budgetUnits;
    }

    /**
     * 
     * @param budgetUnits
     *     The budget_units
     */
    public void setBudgetUnits(String budgetUnits) {
        this.budgetUnits = budgetUnits;
    }

    /**
     * 
     * @return
     *     The normalBillingRate
     */
    public String getNormalBillingRate() {
        return normalBillingRate;
    }

    /**
     * 
     * @param normalBillingRate
     *     The normal_billing_rate
     */
    public void setNormalBillingRate(String normalBillingRate) {
        this.normalBillingRate = normalBillingRate;
    }

    /**
     * 
     * @return
     *     The hoursPerDay
     */
    public String getHoursPerDay() {
        return hoursPerDay;
    }

    /**
     * 
     * @param hoursPerDay
     *     The hours_per_day
     */
    public void setHoursPerDay(String hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    /**
     * 
     * @return
     *     The usesProjectInvoiceSequence
     */
    public Boolean getUsesProjectInvoiceSequence() {
        return usesProjectInvoiceSequence;
    }

    /**
     * 
     * @param usesProjectInvoiceSequence
     *     The uses_project_invoice_sequence
     */
    public void setUsesProjectInvoiceSequence(Boolean usesProjectInvoiceSequence) {
        this.usesProjectInvoiceSequence = usesProjectInvoiceSequence;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The billingPeriod
     */
    public String getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * 
     * @param billingPeriod
     *     The billing_period
     */
    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
