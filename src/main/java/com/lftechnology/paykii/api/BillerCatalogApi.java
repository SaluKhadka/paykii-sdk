package com.lftechnology.paykii.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.paykii.dto.request.BillerCatalogRequest;
import com.lftechnology.paykii.dto.response.BillerCatalogResponse;
import com.lftechnology.paykii.service.BillerApiService;
import com.lftechnology.paykii.service.ExecuteApiService;
import com.lftechnology.paykii.service.impl.ExecuteApiServiceImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;
import java.util.Map;

/**
 * returns the list of {@link BillerCatalogResponse}
 * describes each one regarding their country of origin {@link BillerCatalogRequest}
 * @author SaluKhadka <salukhadka@lftechnology.com>
 */

public class BillerCatalogApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApiCall = new ExecuteApiServiceImpl();

    public BillerCatalogApi(String baseUrl, Map<String,String> headers){
        this.requestApi = new RequestApi(baseUrl, headers);
    }

    public List<BillerCatalogResponse> getBillerCatalog(String token, BillerCatalogRequest request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BillerApiService service = retrofit.create(BillerApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<List<BillerCatalogResponse>> call = service.getBillerCatalog(token,map);
        return executeApiCall.executeApiCall(call);
    }

}