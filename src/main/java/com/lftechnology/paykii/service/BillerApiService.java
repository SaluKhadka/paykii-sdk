package com.lftechnology.paykii.service;

import com.lftechnology.paykii.dto.response.BillerCatalogResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;
import java.util.Map;

public interface BillerApiService {

    @FormUrlEncoded
    @POST("billercatalog/{token}")
    Call<List<BillerCatalogResponse>> getBillerCatalog(@Path("token") String token, @FieldMap Map<String, Object> request);
}
