package com.lftechnology.paykii.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lftechnology.paykii.deserializer.BigDecimalDeserializer;
import com.lftechnology.paykii.deserializer.LocalDateDeserializer;
import com.lftechnology.paykii.serializer.BigDecimalSerializer;
import com.lftechnology.paykii.serializer.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessPaymentRequest extends CommonRequest{

    @JsonProperty(value = "CashierID", required = true)
    private String cashierId;

    @JsonProperty(value = "EntityTransactionID", required = true)
    private String entityTransactionId;

    @JsonProperty(value = "EntityCustomerID")
    private String entityCustomerId;

    @JsonProperty(value = "BillerID", required = true)
    private String billerId;

    @JsonProperty(value = "Input1", required = true)
    private String input;

    @JsonProperty(value = "SKU", required = true)
    private String skuId;

    @JsonProperty(value = "Amount", required = true)
    @JsonSerialize(using = BigDecimalSerializer.class)
    @JsonDeserialize(using = BigDecimalDeserializer.class)
    private BigDecimal amount;

    @JsonProperty(value = "SenderName")
    private String senderName;

    @JsonProperty(value = "SenderDateOfBirth")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate senderDateOfBirth;

    @JsonProperty(value = "SenderLocation")
    private String senderLocation;

    @JsonProperty(value = "SenderEmail")
    private String senderEmail;

    @JsonProperty(value = "SenderMobileNumber")
    private String senderMobileNumber;

    @JsonProperty(value = "BeneficiaryName")
    private String beneficiaryName;

    @JsonProperty(value = "BeneficiaryMobileNumber")
    private String beneficiaryMobileNumber;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public LocalDate getSenderDateOfBirth() {
        return senderDateOfBirth;
    }

    public void setSenderDateOfBirth(LocalDate senderDateOfBirth) {
        this.senderDateOfBirth = senderDateOfBirth;
    }

    public String getSenderLocation() {
        return senderLocation;
    }

    public void setSenderLocation(String senderLocation) {
        this.senderLocation = senderLocation;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderMobileNumber() {
        return senderMobileNumber;
    }

    public void setSenderMobileNumber(String senderMobileNumber) {
        this.senderMobileNumber = senderMobileNumber;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryMobileNumber() {
        return beneficiaryMobileNumber;
    }

    public void setBeneficiaryMobileNumber(String beneficiaryMobileNumber) {
        this.beneficiaryMobileNumber = beneficiaryMobileNumber;
    }
}
