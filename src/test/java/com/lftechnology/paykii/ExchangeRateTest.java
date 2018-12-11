package com.lftechnology.paykii;

import com.lftechnology.paykii.api.ExchangeRateApi;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.ExchangeRateDto;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExchangeRateTest {

    private String baseUrl = "https://tr.paykii.com/v2.1/prod/";

    private String token = "eyJpZCI6ODgsImVtYWlsIjoibHVpcy50cmV2aW5vQHdlYnBvaW50Lm14IiwiZmlyc3RfbmFtZSI6Ikx1aXMgVHJldmlubyIsImxhc3RfbmFtZSI6IlRyZXZpbm8iLCJlbnRpdHlpZCI6IjE0MDgiLCJwb2ludG9mc2FsZWlkIjoiMSIsImxvY2F0aW9uaWQiOiIxIiwiY2FzaGllcmlkIjoiU0lNUFBMTyIsImVudGl0eXRyYW5zYWN0aW9uaWQiOiIxMDAwIn0=_OGQxZGJhNWI3MWJlM2E1ODAxMmEyYmIxNjk3MGYzMGE1NzdmYTk0Yw===";


    @Test
    public void getExchangeRateList(){
        //Given
        ExchangeRateApi tokenApi = new ExchangeRateApi(this.baseUrl, getHeaders());

        //When
        List<ExchangeRateDto> api = tokenApi.getExchangeRateList(this.token, getRequestForList());
        System.out.println(api.toString());
        //Then
        Assert.assertNotNull(api);
    }

    @Test
    public void getDailyExchangeRate(){
        //Given
        ExchangeRateApi tokenApi = new ExchangeRateApi(this.baseUrl, getHeaders());

        //When
        ExchangeRateDto api = tokenApi.getDailyFXRate(this.token, getRequest());
        System.out.println(api.toString());
        //Then
        Assert.assertNotNull(api);
    }

    private ExchangeRateDto getRequest(){
        ExchangeRateDto request = new ExchangeRateDto();
        request.setBaseCurrency("USD");
        request.setSettlementCurrency("VND");
        request.setFxDate(LocalDate.now());
        return request;
    }

    private ExchangeRateDto getRequestForList(){
        ExchangeRateDto request = new ExchangeRateDto();
        request.setBaseCurrency("USD");
        return request;
    }

    public Map<String, String> getHeaders(){
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(ApiConstants.CONTENT_TYPE, ApiConstants.CONTENT_VALUE);
        headers.put(ApiConstants.X_API_KEY, ApiConstants.X_API_VALUE);
        return headers;
    }

}