
package com.karlnosworthy.freeagent.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FreeAgentContact {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("organisation_name")
    @Expose
    private String organisationName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("billing_email")
    @Expose
    private String billingEmail;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("address1")
    @Expose
    private String address1;
    @SerializedName("address2")
    @Expose
    private String address2;
    @SerializedName("address3")
    @Expose
    private String address3;
    @SerializedName("town")
    @Expose
    private String town;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("postcode")
    @Expose
    private String postcode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("contact_name_on_invoices")
    @Expose
    private Boolean contactNameOnInvoices;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("account_balance")
    @Expose
    private String accountBalance;
    @SerializedName("uses_contact_invoice_sequence")
    @Expose
    private Boolean usesContactInvoiceSequence;
    @SerializedName("charge_sales_tax")
    @Expose
    private String chargeSalesTax;
    @SerializedName("sales_tax_registration_number")
    @Expose
    private String salesTaxRegistrationNumber;
    @SerializedName("active_projects_count")
    @Expose
    private Integer activeProjectsCount;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;


    public FreeAgentContact() {
        super();
    }

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
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The organisationName
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * 
     * @param organisationName
     *     The organisation_name
     */
    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The billingEmail
     */
    public String getBillingEmail() {
        return billingEmail;
    }

    /**
     * 
     * @param billingEmail
     *     The billing_email
     */
    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    /**
     * 
     * @return
     *     The phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber
     *     The phone_number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     * @return
     *     The mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 
     * @return
     *     The address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * @param address1
     *     The address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 
     * @return
     *     The address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 
     * @param address2
     *     The address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * 
     * @return
     *     The address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 
     * @param address3
     *     The address3
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * 
     * @return
     *     The town
     */
    public String getTown() {
        return town;
    }

    /**
     * 
     * @param town
     *     The town
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * 
     * @return
     *     The region
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 
     * @param postcode
     *     The postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The contactNameOnInvoices
     */
    public Boolean getContactNameOnInvoices() {
        return contactNameOnInvoices;
    }

    /**
     * 
     * @param contactNameOnInvoices
     *     The contact_name_on_invoices
     */
    public void setContactNameOnInvoices(Boolean contactNameOnInvoices) {
        this.contactNameOnInvoices = contactNameOnInvoices;
    }

    /**
     * 
     * @return
     *     The locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The accountBalance
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * 
     * @param accountBalance
     *     The account_balance
     */
    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * 
     * @return
     *     The usesContactInvoiceSequence
     */
    public Boolean getUsesContactInvoiceSequence() {
        return usesContactInvoiceSequence;
    }

    /**
     * 
     * @param usesContactInvoiceSequence
     *     The uses_contact_invoice_sequence
     */
    public void setUsesContactInvoiceSequence(Boolean usesContactInvoiceSequence) {
        this.usesContactInvoiceSequence = usesContactInvoiceSequence;
    }

    /**
     * 
     * @return
     *     The chargeSalesTax
     */
    public String getChargeSalesTax() {
        return chargeSalesTax;
    }

    /**
     * 
     * @param chargeSalesTax
     *     The charge_sales_tax
     */
    public void setChargeSalesTax(String chargeSalesTax) {
        this.chargeSalesTax = chargeSalesTax;
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

    /**
     * 
     * @return
     *     The activeProjectsCount
     */
    public Integer getActiveProjectsCount() {
        return activeProjectsCount;
    }

    /**
     * 
     * @param activeProjectsCount
     *     The active_projects_count
     */
    public void setActiveProjectsCount(Integer activeProjectsCount) {
        this.activeProjectsCount = activeProjectsCount;
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