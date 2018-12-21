package com.lftechnology.paykii.service;

import com.lftechnology.paykii.dto.response.ProcessPaymentResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

public interface PaymentStatusApiService {

    @POST("verifypaymentstatus/{token}")
    Call<ProcessPaymentResponse> getPaymentStatus(@Path("token") String token, @Body Map<String, Object> request);

}
