package com.lftechnology.paykii.service;

import com.lftechnology.paykii.dto.ExchangeRateDto;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;
import java.util.Map;

public interface ExchangeRateApiService {

    @FormUrlEncoded
    @POST("dailyfxrate/{token}")
    Call<List<ExchangeRateDto>> getExchangeRateList(@Path("token") String token, @FieldMap Map<String, Object> fxRequest);

    @FormUrlEncoded
    @POST("dailyfxrate/{token}")
    Call<ExchangeRateDto> getDailyExchangeRate(@Path("token") String token, @FieldMap Map<String, Object> fxRequest);
}

