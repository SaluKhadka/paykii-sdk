package com.lftechnology.paykii.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.request.ProcessPaymentRequest;
import com.lftechnology.paykii.dto.response.ProcessPaymentResponse;
import com.lftechnology.paykii.exception.PaykiiException;
import com.lftechnology.paykii.service.ExecuteApiService;
import com.lftechnology.paykii.service.ProcessPaymentApiService;
import com.lftechnology.paykii.service.impl.ExecuteApiServiceImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.Map;

/**
 * @author SaluKhadka <salukhadka@lftechnology.com>
 */

public class ProcessPaymentApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApiCall = new ExecuteApiServiceImpl();

    public ProcessPaymentApi(String baseUrl, Map<String,String> headers){
        this.requestApi = new RequestApi(baseUrl, headers);
    }

    public ProcessPaymentResponse processPayment(String token, ProcessPaymentRequest request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        ProcessPaymentApiService service = retrofit.create(ProcessPaymentApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<ProcessPaymentResponse> call = service.processPayment(token,map);
        ProcessPaymentResponse response = executeApiCall.executeApiCall(call);
        if (!ApiConstants.SUCCESS_RESPONSE_CODE.equals(response.getCode()))
            throw new PaykiiException(response.getCode(), response.getMessage());
        return response;
    }
}
