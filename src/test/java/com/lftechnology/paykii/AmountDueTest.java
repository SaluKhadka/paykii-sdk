package com.lftechnology.paykii;

import com.lftechnology.paykii.api.AmountDueApi;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.request.AmountDueRequest;
import com.lftechnology.paykii.dto.response.AmountDueResponse;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AmountDueTest {
    private String baseUrl = "https://tr.paykii.com/v2.1/prod/";

    private String token = "eyJpZCI6ODgsImVtYWlsIjoibHVpcy50cmV2aW5vQHdlYnBvaW50Lm14IiwiZmlyc3RfbmFtZSI6Ikx1aXMgVHJldmlubyIsImxhc3RfbmFtZSI6IlRyZXZpbm8iLCJlbnRpdHlpZCI6IjE0MDgiLCJwb2ludG9mc2FsZWlkIjoiMSIsImxvY2F0aW9uaWQiOiIxIiwiY2FzaGllcmlkIjoiU0lNUFBMTyIsImVudGl0eXRyYW5zYWN0aW9uaWQiOiIxMDAwIn0=_OGQxZGJhNWI3MWJlM2E1ODAxMmEyYmIxNjk3MGYzMGE1NzdmYTk0Yw===";


    @Test
    public void testAmountDue() {
        //Given
        AmountDueApi api = new AmountDueApi(this.baseUrl, getHeaders());

        //When
        AmountDueResponse token = api.getAmountDueDetails(this.token, getRequest());
        System.out.println(token.toString());
        //Then
        Assert.assertNotNull(token);
    }

    /**
     * {
     "LocationID": 1,
     "PointOfSaleID": 1,
     "CashierID" : "SIMPPLO",
     "EntityTransactionID" : "1000",
     "BillerID" : "170000000000001",
     "Inputs" : "abc1234",
     "SKU": "00000000000000000001"
     }
     *
     */

    private AmountDueRequest getRequest(){
        AmountDueRequest request = new AmountDueRequest();
        request.setLocationId("1");
        request.setPointOfSaleId("1");
        request.setCashierId("SIMPPLO");
        request.setEntityTransactionId("1000");
        request.setInput("abc1234");
        request.setSkuId("00000000000000000001");
        request.setBillerId("170000000000001");
        return request;
    }

    public Map<String, String> getHeaders(){
        Map<String, String> headers = new HashMap<>();
        headers.put(ApiConstants.CONTENT_TYPE, ApiConstants.CONTENT_VALUE);
        headers.put(ApiConstants.X_API_KEY, ApiConstants.X_API_VALUE);
        return headers;
    }
}
