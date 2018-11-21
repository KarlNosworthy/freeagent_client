package com.karlnosworthy.freeagent.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by karl on 15/07/2016.
 */
public class FreeAgentExpense {

    @Expose private String url;
    @Expose private String category;
    @Expose @SerializedName("dated_on") private String datedOn;
    @Expose private String currency;
    @Expose @SerializedName("gross_value") private String grossValue;
    @Expose @SerializedName("native_gross_value") private String nativeGrossValue;
    @Expose @SerializedName("sales_tax_rate") private String salesTaxRate;
    @Expose @SerializedName("sales_tax_value") private String salesTaxValue;
    @Expose @SerializedName("native_sales_tax_value") private String nativeSalesTaxValue;
    @Expose private String description;
    @Expose @SerializedName("manual_sales_tax_amount") private String manualSalesTaxAmount;
    @Expose @SerializedName("updated_at") private String updateAt;
    @Expose @SerializedName("created_at") private String createdAt;

    // implement attachements later
/*


"url":"https://api.freeagent.com/v2/expenses/1",
    "user":"https://api.freeagent.com/v2/users/1",
    "category":"https://api.freeagent.com/v2/categories/285",
    "dated_on":"2011-08-24",
    "currency":"USD",
    "gross_value":"-20.0",
    "native_gross_value":"-12.0",
    "sales_tax_rate":"1.0",
    "sales_tax_value": "-0.2",
    "native_sales_tax_value": "-0.12",
    "description":"Some description",
    "manual_sales_tax_amount":"0.12",
    "updated_at":"2011-08-24T08:10:40Z",
    "created_at":"2011-08-24T08:10:40Z",
    "attachment":
      {
        "url":"https://api.freeagent.com/v2/attachments/3",
        "content_src":"https://s3.amazonaws.com/freeagent-dev/attachments/1/original.png?AWSAccessKeyId=1K3MW21E6T8KWBY84B02&Expires=1314281186&Signature=GFAKDo%2Bi%2FsUMTYEgg6ZWGysB4k4%3D",
        "content_type":"image/png",
        "file_name":"barcode.png",
        "file_size":7673
      }
  }
*/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDatedOn() {
        return datedOn;
    }

    public void setDatedOn(String datedOn) {
        this.datedOn = datedOn;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getGrossValue() {
        return grossValue;
    }

    public void setGrossValue(String grossValue) {
        this.grossValue = grossValue;
    }

    public String getNativeGrossValue() {
        return nativeGrossValue;
    }

    public void setNativeGrossValue(String nativeGrossValue) {
        this.nativeGrossValue = nativeGrossValue;
    }

    public String getSalesTaxRate() {
        return salesTaxRate;
    }

    public void setSalesTaxRate(String salesTaxRate) {
        this.salesTaxRate = salesTaxRate;
    }

    public String getSalesTaxValue() {
        return salesTaxValue;
    }

    public void setSalesTaxValue(String salesTaxValue) {
        this.salesTaxValue = salesTaxValue;
    }

    public String getNativeSalesTaxValue() {
        return nativeSalesTaxValue;
    }

    public void setNativeSalesTaxValue(String nativeSalesTaxValue) {
        this.nativeSalesTaxValue = nativeSalesTaxValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManualSalesTaxAmount() {
        return manualSalesTaxAmount;
    }

    public void setManualSalesTaxAmount(String manualSalesTaxAmount) {
        this.manualSalesTaxAmount = manualSalesTaxAmount;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
