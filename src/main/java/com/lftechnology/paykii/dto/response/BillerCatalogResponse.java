package com.lftechnology.paykii.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lftechnology.paykii.dto.response.Response;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillerCatalogResponse extends Response {

    @JsonProperty("CatalogVersion")
    private String catalogVersion;

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("CountryName")
    private String countryName;

    @JsonProperty("BillerID")
    private String billerId;

    @JsonProperty("BillerName")
    private String billerName;

    @JsonProperty("BillerType")
    private String billerType;

    @JsonProperty("BillerDescription")
    private String billerDescription;

    public String getCatalogVersion() {
        return catalogVersion;
    }

    public void setCatalogVersion(String catalogVersion) {
        this.catalogVersion = catalogVersion;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    public String getBillerType() {
        return billerType;
    }

    public void setBillerType(String billerType) {
        this.billerType = billerType;
    }

    public String getBillerDescription() {
        return billerDescription;
    }

    public void setBillerDescription(String billerDescription) {
        this.billerDescription = billerDescription;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BillerCatalogResponse{");
        sb.append("responseCode='").append(getCode()).append('\'');
        sb.append(", responseMessage='").append(getMessage()).append('\'');
        sb.append(", responseDateTime='").append(getResponseDateTime()).append('\'');
        sb.append(", catalogVersion='").append(catalogVersion).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", billerId='").append(billerId).append('\'');
        sb.append(", billerName='").append(billerName).append('\'');
        sb.append(", billerType='").append(billerType).append('\'');
        sb.append(", billerDescription='").append(billerDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
