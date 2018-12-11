package com.lftechnology.paykii.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentStatusRequest extends CommonRequest{

    @JsonProperty(value = "CashierID", required = true)
    private String cashierId;

    @JsonProperty(value = "EntityTransactionID", required = true)
    private String entityTransactionId;

    @JsonProperty(value = "EntityTransactionIDVerify")
    private String paymentTransactionId;

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

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }
}
