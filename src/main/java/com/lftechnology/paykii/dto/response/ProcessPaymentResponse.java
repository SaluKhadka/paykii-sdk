package com.lftechnology.paykii.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProcessPaymentResponse extends Response {

    @JsonProperty(value = "ConfirmationNumber")
    private String confirmationNumber;

    @JsonProperty(value = "TicketCaption")
    private String ticketCaption;

    @JsonProperty(value = "PayKiiTransactionID")
    private String transactionId;

    @JsonProperty(value = "EntityTransactionID")
    private String entityTransactionId;

    @JsonProperty(value = "SettlementCurrency")
    private String settlementCurrency;

    @JsonProperty(value = "BaseCurrency")
    private String baseCurrency;

    @JsonProperty(value = "FXRate")
    private String fxRate;

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getTicketCaption() {
        return ticketCaption;
    }

    public void setTicketCaption(String ticketCaption) {
        this.ticketCaption = ticketCaption;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getEntityTransactionId() {
        return entityTransactionId;
    }

    public void setEntityTransactionId(String entityTransactionId) {
        this.entityTransactionId = entityTransactionId;
    }

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getFxRate() {
        return fxRate;
    }

    public void setFxRate(String fxRate) {
        this.fxRate = fxRate;
    }
}
