package com.karlnosworthy.freeagent.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FreeAgentInvoice {

    @Expose
    private String url;

    @Expose
    private String contact;

    @Expose
    @SerializedName("dated_on")
    private String datedOn;

    @Expose
    @SerializedName("due_on")
    private String dueOn;

    @Expose
    private String reference;

    @Expose
    private String currency;

    @Expose
    @SerializedName("exchange_rate")
    private String exchangeRate;

    @Expose
    @SerializedName("net_value")
    private String netValue;

    @Expose
    @SerializedName("total_value")
    private String totalValue;

    @Expose
    @SerializedName("paid_value")
    private String paidValue;

    @Expose
    @SerializedName("due_value")
    private String dueValue;

    @Expose
    private String status;

    @Expose
    private String comments;

    @Expose
    @SerializedName("omit_header")
    private boolean omitHeader;

    @Expose
    @SerializedName("payment_terms_in_days")
    private Integer paymentTermsInDays;

    @Expose
    @SerializedName("ec_status")
    private String ecStatus;

    @Expose
    @SerializedName("created_at")
    private String createdAt;

    @Expose
    @SerializedName("updated_at")
    private String updatedAt;

    @Expose
    @SerializedName("invoice_items")
    private List<FreeAgentInvoiceItem> invoiceItems;



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDatedOn() {
        return datedOn;
    }

    public void setDatedOn(String datedOn) {
        this.datedOn = datedOn;
    }

    public String getDueOn() {
        return dueOn;
    }

    public void setDueOn(String dueOn) {
        this.dueOn = dueOn;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getNetValue() {
        return netValue;
    }

    public void setNetValue(String netValue) {
        this.netValue = netValue;
    }

    public String getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

    public String getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(String paidValue) {
        this.paidValue = paidValue;
    }

    public String getDueValue() {
        return dueValue;
    }

    public void setDueValue(String dueValue) {
        this.dueValue = dueValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isOmitHeader() {
        return omitHeader;
    }

    public void setOmitHeader(boolean omitHeader) {
        this.omitHeader = omitHeader;
    }

    public Integer getPaymentTermsInDays() {
        return paymentTermsInDays;
    }

    public void setPaymentTermsInDays(Integer paymentTermsInDays) {
        this.paymentTermsInDays = paymentTermsInDays;
    }

    public String getEcStatus() {
        return ecStatus;
    }

    public void setEcStatus(String ecStatus) {
        this.ecStatus = ecStatus;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<FreeAgentInvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<FreeAgentInvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
