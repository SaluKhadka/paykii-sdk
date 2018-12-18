package com.lftechnology.paykii.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.paykii.dto.ExchangeRateDto;
import com.lftechnology.paykii.dto.request.SKUCatalogRequest;
import com.lftechnology.paykii.dto.response.SKUCatalogResponse;
import com.lftechnology.paykii.service.ExchangeRateApiService;
import com.lftechnology.paykii.service.ExecuteApiService;
import com.lftechnology.paykii.service.SKUApiService;
import com.lftechnology.paykii.service.impl.ExecuteApiServiceImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;
import java.util.Map;

/**
 * returns list of {@link SKUCatalogResponse}
 * defines the capabilities and limitations of each biller {@link BillerCatalogApi},
 * @author SaluKhadka <salukhadka@lftechnology.com>
 */
public class SKUCatalogApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApiCall = new ExecuteApiServiceImpl();


    public SKUCatalogApi(String baseUrl, Map<String,String> headers){
        this.requestApi = new RequestApi(baseUrl, headers);
    }

    public List<SKUCatalogResponse> getSKUList(String token, SKUCatalogRequest request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        SKUApiService service = retrofit.create(SKUApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<List<SKUCatalogResponse>> call = service.getSKUCatalog(token,map);
        return executeApiCall.executeApiCall(call);
    }
}