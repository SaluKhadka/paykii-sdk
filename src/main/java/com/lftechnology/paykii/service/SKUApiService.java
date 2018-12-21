package com.lftechnology.paykii.service;

import com.lftechnology.paykii.dto.response.SKUCatalogResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;
import java.util.Map;

public interface SKUApiService {

    @POST("skucatalog/{token}")
    Call<List<SKUCatalogResponse>> getSKUCatalog(@Path("token") String token, @Body Map<String, Object> request);

}
