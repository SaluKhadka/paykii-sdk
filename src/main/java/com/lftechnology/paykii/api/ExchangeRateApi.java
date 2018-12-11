package com.lftechnology.paykii.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.ExchangeRateDto;
import com.lftechnology.paykii.exception.PaykiiException;
import com.lftechnology.paykii.service.ExchangeRateApiService;
import com.lftechnology.paykii.service.ExecuteApiService;
import com.lftechnology.paykii.service.impl.ExecuteApiServiceImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;
import java.util.Map;


public class ExchangeRateApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApiCall = new ExecuteApiServiceImpl();


    public ExchangeRateApi(String baseUrl, Map<String,String> headers){
        this.requestApi = new RequestApi(baseUrl, headers);
    }

    public List<ExchangeRateDto> getExchangeRateList(String token, ExchangeRateDto request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ExchangeRateApiService service = retrofit.create(ExchangeRateApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<List<ExchangeRateDto>> call = (service.getExchangeRateList(token,map));
        return executeApiCall.executeApiCall(call);
    }

    public ExchangeRateDto getDailyFXRate(String token, ExchangeRateDto request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ExchangeRateApiService service = retrofit.create(ExchangeRateApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<ExchangeRateDto> call = (service.getDailyExchangeRate(token,map));
        ExchangeRateDto response = executeApiCall.executeApiCall(call);
        if (!ApiConstants.SUCCESS_RESPONSE_CODE.equals(response.getCode()))
            throw new PaykiiException(response.getCode(), response.getMessage());
        return response;
    }
}