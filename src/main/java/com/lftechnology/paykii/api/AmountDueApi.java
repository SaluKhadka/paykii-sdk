package com.lftechnology.paykii.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.request.AmountDueRequest;
import com.lftechnology.paykii.dto.response.AmountDueResponse;
import com.lftechnology.paykii.exception.PaykiiException;
import com.lftechnology.paykii.service.AmountDueApiService;
import com.lftechnology.paykii.service.ExecuteApiService;
import com.lftechnology.paykii.service.impl.ExecuteApiServiceImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.Map;

/**
 *  AmountDue API allows to query the biller and find out how much is owed by the customer.
 *  It only works for SKU {@link SKUCatalogApi} that allow balance inquiries.
 *  @author SaluKhadka <salukhadka@lftechnology.com>
 */


public class AmountDueApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApiCall = new ExecuteApiServiceImpl();

    public AmountDueApi(String baseUrl, Map<String,String> headers){
        this.requestApi = new RequestApi(baseUrl, headers);
    }

    public AmountDueResponse getAmountDueDetails(String token, AmountDueRequest request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        AmountDueApiService service = retrofit.create(AmountDueApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<AmountDueResponse> call = service.getAmountDueDetail(token,map);
        AmountDueResponse response = executeApiCall.executeApiCall(call);
        if (!ApiConstants.SUCCESS_RESPONSE_CODE.equals(response.getCode()))
            throw new PaykiiException(response.getCode(), response.getMessage());
        return response;
    }

}