package com.lftechnology.paykii.service;

import com.lftechnology.paykii.dto.response.AmountDueResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

public interface AmountDueApiService {

    @POST("amountdue/{token}")
    Call<AmountDueResponse> getAmountDueDetail(@Path("token") String token, @Body Map<String, Object> request);

}
