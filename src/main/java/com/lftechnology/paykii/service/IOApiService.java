package com.lftechnology.paykii.service;

import com.lftechnology.paykii.dto.response.IOCatalogResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;
import java.util.Map;

public interface IOApiService {

    @POST("iocatalog/{token}")
    Call<List<IOCatalogResponse>> getIOCatalog(@Path("token") String token, @FieldMap Map<String, Object> request);
}
