package com.lftechnology.paykii.service;

import com.lftechnology.paykii.dto.response.ProcessPaymentResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

public interface ProcessPaymentApiService {
    @FormUrlEncoded
    @POST("processpayment/{token}")
    Call<ProcessPaymentResponse> processPayment(@Path("token") String token, @FieldMap Map<String, Object> request);
}
