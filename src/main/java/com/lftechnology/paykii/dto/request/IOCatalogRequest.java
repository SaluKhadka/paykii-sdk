package com.lftechnology.paykii.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IOCatalogRequest extends CommonRequest {

    @JsonProperty(value = "BillerID")
    private String billerId;

    @JsonProperty(value = "SKU")
    private String skuId;

    public String getBillerId() {
        return billerId;
    }

    public void setBillerId(String billerId) {
        this.billerId = billerId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
