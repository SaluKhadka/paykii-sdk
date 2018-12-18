package com.lftechnology.paykii.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.paykii.constant.ApiConstants;
import com.lftechnology.paykii.dto.request.PaymentStatusRequest;
import com.lftechnology.paykii.dto.response.ProcessPaymentResponse;
import com.lftechnology.paykii.exception.PaykiiException;
import com.lftechnology.paykii.service.ExecuteApiService;
import com.lftechnology.paykii.service.PaymentStatusApiService;
import com.lftechnology.paykii.service.impl.ExecuteApiServiceImpl;
import retrofit2.Call;
import retrofit2.Retrofit;
import java.util.Map;

/**
 * verify the status of a payment obtained on the original payment request {@link ProcessPaymentApi}
 * @author SaluKhadka <salukhadka@lftechnology.com>
 */
public class PaymentStatusApi {
    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApiCall = new ExecuteApiServiceImpl();

    public PaymentStatusApi(String baseUrl, Map<String,String> headers){
        this.requestApi = new RequestApi(baseUrl, headers);
    }

    public ProcessPaymentResponse getPaymentStatus(String token, PaymentStatusRequest request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        PaymentStatusApiService service = retrofit.create(PaymentStatusApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<ProcessPaymentResponse> call = service.getPaymentStatus(token,map);
        ProcessPaymentResponse response = executeApiCall.executeApiCall(call);
        if (!ApiConstants.SUCCESS_RESPONSE_CODE.equals(response.getCode()))
            throw new PaykiiException(response.getCode(), response.getMessage());
        return response;
    }
}
