
package com.karlnosworthy.freeagent.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class FreeAgentCompany {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("subdomain")
    @Expose
    private String subdomain;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("mileage_units")
    @Expose
    private String mileageUnits;
    @SerializedName("company_start_date")
    @Expose
    private String companyStartDate;
    @SerializedName("freeagent_start_date")
    @Expose
    private String freeagentStartDate;
    @SerializedName("first_accounting_year_end")
    @Expose
    private String firstAccountingYearEnd;
    @SerializedName("company_registration_number")
    @Expose
    private String companyRegistrationNumber;
    @SerializedName("sales_tax_registration_status")
    @Expose
    private String salesTaxRegistrationStatus;
    @SerializedName("sales_tax_registration_number")
    @Expose
    private String salesTaxRegistrationNumber;

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
     *     The subdomain
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * 
     * @param subdomain
     *     The subdomain
     */
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
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
     *     The mileageUnits
     */
    public String getMileageUnits() {
        return mileageUnits;
    }

    /**
     * 
     * @param mileageUnits
     *     The mileage_units
     */
    public void setMileageUnits(String mileageUnits) {
        this.mileageUnits = mileageUnits;
    }

    /**
     * 
     * @return
     *     The companyStartDate
     */
    public String getCompanyStartDate() {
        return companyStartDate;
    }

    /**
     * 
     * @param companyStartDate
     *     The company_start_date
     */
    public void setCompanyStartDate(String companyStartDate) {
        this.companyStartDate = companyStartDate;
    }

    /**
     * 
     * @return
     *     The freeagentStartDate
     */
    public String getFreeagentStartDate() {
        return freeagentStartDate;
    }

    /**
     * 
     * @param freeagentStartDate
     *     The freeagent_start_date
     */
    public void setFreeagentStartDate(String freeagentStartDate) {
        this.freeagentStartDate = freeagentStartDate;
    }

    /**
     * 
     * @return
     *     The firstAccountingYearEnd
     */
    public String getFirstAccountingYearEnd() {
        return firstAccountingYearEnd;
    }

    /**
     * 
     * @param firstAccountingYearEnd
     *     The first_accounting_year_end
     */
    public void setFirstAccountingYearEnd(String firstAccountingYearEnd) {
        this.firstAccountingYearEnd = firstAccountingYearEnd;
    }

    /**
     * 
     * @return
     *     The companyRegistrationNumber
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * 
     * @param companyRegistrationNumber
     *     The company_registration_number
     */
    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    /**
     * 
     * @return
     *     The salesTaxRegistrationStatus
     */
    public String getSalesTaxRegistrationStatus() {
        return salesTaxRegistrationStatus;
    }

    /**
     * 
     * @param salesTaxRegistrationStatus
     *     The sales_tax_registration_status
     */
    public void setSalesTaxRegistrationStatus(String salesTaxRegistrationStatus) {
        this.salesTaxRegistrationStatus = salesTaxRegistrationStatus;
    }

    /**
     * 
     * @return
     *     The salesTaxRegistrationNumber
     */
    public String getSalesTaxRegistrationNumber() {
        return salesTaxRegistrationNumber;
    }

    /**
     * 
     * @param salesTaxRegistrationNumber
     *     The sales_tax_registration_number
     */
    public void setSalesTaxRegistrationNumber(String salesTaxRegistrationNumber) {
        this.salesTaxRegistrationNumber = salesTaxRegistrationNumber;
    }
}
