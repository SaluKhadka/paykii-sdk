package com.lftechnology.paykii.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AmountDueResponse extends Response{

    @JsonProperty(value = "PayKiiTransactionID")
    private String transactionId;

    @JsonProperty(value = "EntityTransactionID")
    private String entityTransactionId;

    @JsonProperty(value = "BillAmountDue")
    private BigDecimal billAmountDue;

    @JsonProperty(value = "BillDueDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate billDueDate;

    @JsonProperty(value = "BillsDue")
    private Integer billsDue;

    @JsonProperty(value = "TotalAmountDue")
    private BigDecimal totalAmountDue;

    @JsonProperty(value = "CustomerName")
    private String customerName;

    @JsonProperty(value = "Output1")
    private String output1;

    @JsonProperty(value = "Output2")
    private String output2;

    @JsonProperty(value = "SettlementCurrency")
    private String settlementCurrency;

    @JsonProperty(value = "BaseCurrency")
    private String baseCurrency;

    @JsonProperty(value = "IndicativeFXRate")
    private BigDecimal indicativeFXRate;

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

    public BigDecimal getBillAmountDue() {
        return billAmountDue;
    }

    public void setBillAmountDue(BigDecimal billAmountDue) {
        this.billAmountDue = billAmountDue;
    }

    public LocalDate getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(LocalDate billDueDate) {
        this.billDueDate = billDueDate;
    }

    public Integer getBillsDue() {
        return billsDue;
    }

    public void setBillsDue(Integer billsDue) {
        this.billsDue = billsDue;
    }

    public BigDecimal getTotalAmountDue() {
        return totalAmountDue;
    }

    public void setTotalAmountDue(BigDecimal totalAmountDue) {
        this.totalAmountDue = totalAmountDue;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOutput1() {
        return output1;
    }

    public void setOutput1(String output1) {
        this.output1 = output1;
    }

    public String getOutput2() {
        return output2;
    }

    public void setOutput2(String output2) {
        this.output2 = output2;
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

    public BigDecimal getIndicativeFXRate() {
        return indicativeFXRate;
    }

    public void setIndicativeFXRate(BigDecimal indicativeFXRate) {
        this.indicativeFXRate = indicativeFXRate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AmountDueResponse{");
        sb.append("transactionId='").append(transactionId).append('\'');
        sb.append(", entityTransactionId='").append(entityTransactionId).append('\'');
        sb.append(", billAmountDue=").append(billAmountDue);
        sb.append(", billDueDate=").append(billDueDate);
        sb.append(", billsDue=").append(billsDue);
        sb.append(", totalAmountDue=").append(totalAmountDue);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", output1='").append(output1).append('\'');
        sb.append(", output2='").append(output2).append('\'');
        sb.append(", settlementCurrency='").append(settlementCurrency).append('\'');
        sb.append(", baseCurrency='").append(baseCurrency).append('\'');
        sb.append(", indicativeFXRate=").append(indicativeFXRate);
        sb.append('}');
        return sb.toString();
    }
}
