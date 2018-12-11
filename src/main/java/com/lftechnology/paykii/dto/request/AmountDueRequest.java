package com.lftechnology.paykii.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmountDueRequest extends CommonRequest{

    @JsonProperty(value = "CashierID", required = true)
    private String cashierId;

    @JsonProperty(value = "EntityTransactionID", required = true)
    private String entityTransactionId;

    @JsonProperty(value = "EntityCustomerID")
    private String entityCustomerId;

    @JsonProperty(value = "BillerID", required = true)
    private String billerId;

    @JsonProperty(value = "Inputs", required = true)
    private String input;

    @JsonProperty(value = "SKU", required = true)
    private String skuId;

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getEntityTransactionId() {
        return entityTransactionId;
    }

    public void setEntityTransactionId(String entityTransactionId) {
        this.entityTransactionId = entityTransactionId;
    }

    public String getEntityCustomerId() {
        return entityCustomerId;
    }

    public void setEntityCustomerId(String entityCustomerId) {
        this.entityCustomerId = entityCustomerId;
    }

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
