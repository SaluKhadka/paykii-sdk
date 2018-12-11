package com.lftechnology.paykii.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lftechnology.paykii.deserializer.LocalDateDeserializer;
import com.lftechnology.paykii.dto.response.Response;
import com.lftechnology.paykii.serializer.LocalDateSerializer;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExchangeRateDto extends Response{

    @JsonProperty(value = "BaseCurrency", required = true)
    private String baseCurrency;

    @JsonProperty(value = "SettlementCurrency")
    private String settlementCurrency;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonProperty(value = "FXDate")
    private LocalDate fxDate;

    @JsonProperty("FXRate")
    private String fxRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public LocalDate getFxDate() {
        return fxDate;
    }

    public void setFxDate(LocalDate fxDate) {
        this.fxDate = fxDate;
    }

    public String getFxRate() {
        return fxRate;
    }

    public void setFxRate(String fxRate) {
        this.fxRate = fxRate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DailyFxRequest{");
        sb.append("responseCode='").append(getCode()).append('\'');
        sb.append("responseMessage='").append(getMessage()).append('\'');
        sb.append("responseDate='").append(getResponseDateTime()).append('\'');
        sb.append("baseCurrency='").append(baseCurrency).append('\'');
        sb.append(", settlementCurrency='").append(settlementCurrency).append('\'');
        sb.append(", fxDate='").append(fxDate).append('\'');
        sb.append(", fxRate='").append(fxRate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
