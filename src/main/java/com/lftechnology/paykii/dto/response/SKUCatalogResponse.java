package com.lftechnology.paykii.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SKUCatalogResponse extends Response{

    @JsonProperty(value = "CatalogVersion")
    String catalogVersion;

    @JsonProperty(value = "BillerID")
    String billerId;

    @JsonProperty(value = "SKU")
    String skuId;

    @JsonProperty(value = "Currency")
    String currency;

    @JsonProperty(value = "Type")
    String type;

    @JsonProperty(value = "Description")
    String description;

    @JsonProperty(value = "InquiryAvailable")
    Boolean isInquiryAvailable;

    @JsonProperty(value = "PartialPaymentAllowed")
    Boolean isPartialPaymentAllowed;

    @JsonProperty(value = "ExcessPaymentAllowed")
    Boolean isExcessPaymentAllowed;

    @JsonProperty(value = "PastDuePaymentAllowed")
    Boolean isPastDuePaymentAllowed;

    @JsonProperty(value = "Amount")
    BigDecimal amount;

    @JsonProperty(value = "MinAmount")
    BigDecimal minAmount;

    @JsonProperty(value = "MaxAmount")
    BigDecimal maxAmount;

    @JsonProperty(value = "DaysToPost")
    Integer daysToPost;

    @JsonProperty(value = "BusinessDays")
    Boolean businessDays;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SKUCatalogResponse{");
        sb.append("catalogVersion='").append(catalogVersion).append('\'');
        sb.append(", billerId='").append(billerId).append('\'');
        sb.append(", skuId='").append(skuId).append('\'');
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", isInquiryAvailable=").append(isInquiryAvailable);
        sb.append(", isPartialPaymentAllowed=").append(isPartialPaymentAllowed);
        sb.append(", isExcessPaymentAllowed=").append(isExcessPaymentAllowed);
        sb.append(", isPastDuePaymentAllowed=").append(isPastDuePaymentAllowed);
        sb.append(", amount=").append(amount);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", daysToPost=").append(daysToPost);
        sb.append(", businessDays=").append(businessDays);
        sb.append('}');
        return sb.toString();
    }
}
