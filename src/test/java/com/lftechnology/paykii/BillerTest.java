package com.lftechnology.paykii;

import com.lftechnology.paykii.api.BillerCatalogApi;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.request.BillerCatalogRequest;
import com.lftechnology.paykii.dto.response.BillerCatalogResponse;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BillerTest {

    private String baseUrl = "https://tr.paykii.com/v2.1/prod/";

    private String token = "eyJpZCI6ODgsImVtYWlsIjoibHVpcy50cmV2aW5vQHdlYnBvaW50Lm14IiwiZmlyc3RfbmFtZSI6Ikx1aXMgVHJldmlubyIsImxhc3RfbmFtZSI6IlRyZXZpbm8iLCJlbnRpdHlpZCI6IjE0MDgiLCJwb2ludG9mc2FsZWlkIjoiMSIsImxvY2F0aW9uaWQiOiIxIiwiY2FzaGllcmlkIjoiU0lNUFBMTyIsImVudGl0eXRyYW5zYWN0aW9uaWQiOiIxMDAwIn0=_OGQxZGJhNWI3MWJlM2E1ODAxMmEyYmIxNjk3MGYzMGE1NzdmYTk0Yw===";


    @Test
    public void testBillerCatalog() {
        //Given
        BillerCatalogApi tokenApi = new BillerCatalogApi(this.baseUrl, getHeaders());

        //When
        List<BillerCatalogResponse> token = tokenApi.getBillerCatalog(this.token, getRequest());
        System.out.println(token.toString());
        //Then
        Assert.assertNotNull(token);
    }

    private BillerCatalogRequest getRequest(){
        BillerCatalogRequest request = new BillerCatalogRequest();
        request.setLocationId("1");
        request.setPointOfSaleId("1");
        request.setCountryCode("VNM");
        return request;
    }

    public Map<String, String> getHeaders(){
        Map<String, String> headers = new HashMap<>();
        headers.put(ApiConstants.CONTENT_TYPE, ApiConstants.CONTENT_VALUE);
        headers.put(ApiConstants.X_API_KEY, ApiConstants.X_API_VALUE);
        return headers;
    }


}
