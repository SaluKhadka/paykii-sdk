package com.lftechnology.paykii;

import com.lftechnology.paykii.api.SKUCatalogApi;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.request.CommonRequest;
import com.lftechnology.paykii.dto.request.SKUCatalogRequest;
import com.lftechnology.paykii.dto.response.SKUCatalogResponse;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SKUTest {

    private String baseUrl = "https://tr.paykii.com/v2.1/prod/";

    private String token = "eyJpZCI6ODgsImVtYWlsIjoibHVpcy50cmV2aW5vQHdlYnBvaW50Lm14IiwiZmlyc3RfbmFtZSI6Ikx1aXMgVHJldmlubyIsImxhc3RfbmFtZSI6IlRyZXZpbm8iLCJlbnRpdHlpZCI6IjE0MDgiLCJwb2ludG9mc2FsZWlkIjoiMSIsImxvY2F0aW9uaWQiOiIxIiwiY2FzaGllcmlkIjoiU0lNUFBMTyIsImVudGl0eXRyYW5zYWN0aW9uaWQiOiIxMDAwIn0=_OGQxZGJhNWI3MWJlM2E1ODAxMmEyYmIxNjk3MGYzMGE1NzdmYTk0Yw===";


    private CommonRequest getCommonRequest(){
        CommonRequest common = new SKUCatalogRequest();
        common.setLocationId("1");
        common.setPointOfSaleId("1");
        return common;
    }

    private SKUCatalogRequest getRequest(){
        SKUCatalogRequest common = new SKUCatalogRequest();
        common.setLocationId("1");
        common.setPointOfSaleId("1");
        common.setBillerId("484000000000094");
        return common;
    }

    @Test
    public void getSKUList(){
        SKUCatalogApi api = new SKUCatalogApi(this.baseUrl, getHeaders());
        SKUCatalogRequest request = (SKUCatalogRequest) getCommonRequest();
        List<SKUCatalogResponse> list = api.getSKUList(this.token, request);
        System.out.println(list.toString());
        Assert.assertNotNull(list);
    }


    @Test
    public void getSKUListByBillerId(){
        SKUCatalogApi api = new SKUCatalogApi(this.baseUrl, getHeaders());
        List<SKUCatalogResponse> list = api.getSKUList(this.token, getRequest());
        System.out.println(list.toString());

        Assert.assertNotNull(list);

    }

    public Map<String, String> getHeaders(){
        Map<String, String> headers = new HashMap<>();
        headers.put(ApiConstants.CONTENT_TYPE, ApiConstants.CONTENT_VALUE);
        headers.put(ApiConstants.X_API_KEY, ApiConstants.X_API_VALUE);
        return headers;
    }

    @Test
    public void testValidlengthDeserializer() throws IOException {
        List<Integer> deserializedNumber = deserializeNumber();
        System.out.println(deserializedNumber.toString());
    }

    private List<Integer> deserializeNumber() {
        List<String> list = Arrays.asList("11|8|26".split("\\|"));
        return list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
