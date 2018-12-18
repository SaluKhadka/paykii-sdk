package com.lftechnology.paykii;

import com.lftechnology.paykii.api.IOCatalogApi;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.request.IOCatalogRequest;
import com.lftechnology.paykii.dto.response.IOCatalogResponse;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOTest {

    private String baseUrl = "https://tr.paykii.com/v2.1/prod/";

    private String token = "eyJpZCI6ODgsImVtYWlsIjoibHVpcy50cmV2aW5vQHdlYnBvaW50Lm14IiwiZmlyc3RfbmFtZSI6Ikx1aXMgVHJldmlubyIsImxhc3RfbmFtZSI6IlRyZXZpbm8iLCJlbnRpdHlpZCI6IjE0MDgiLCJwb2ludG9mc2FsZWlkIjoiMSIsImxvY2F0aW9uaWQiOiIxIiwiY2FzaGllcmlkIjoiU0lNUFBMTyIsImVudGl0eXRyYW5zYWN0aW9uaWQiOiIxMDAwIn0=_OGQxZGJhNWI3MWJlM2E1ODAxMmEyYmIxNjk3MGYzMGE1NzdmYTk0Yw===";


    private IOCatalogRequest getCommonRequest(){
        IOCatalogRequest common = new IOCatalogRequest();
        common.setLocationId("1");
        common.setPointOfSaleId("1");
        return common;
    }

    private IOCatalogRequest getRequest(){
        IOCatalogRequest common = new IOCatalogRequest();
        common.setLocationId("1");
        common.setPointOfSaleId("1");
        common.setBillerId("484000000000094");
        return common;
    }

    @Test
    public void getIOTest(){
        IOCatalogApi api = new IOCatalogApi(this.baseUrl, getHeaders());
        IOCatalogRequest request = (IOCatalogRequest) getCommonRequest();
        List<IOCatalogResponse> list = api.getIOCalalog(this.token, getCommonRequest());
        System.out.println(list.toString());
        Assert.assertNotNull(list);
    }

    public Map<String, String> getHeaders(){
        Map<String, String> headers = new HashMap<>();
        headers.put(ApiConstants.CONTENT_TYPE, ApiConstants.CONTENT_VALUE);
        headers.put(ApiConstants.X_API_KEY, ApiConstants.X_API_VALUE);
        return headers;
    }


}
