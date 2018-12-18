package com.lftechnology.paykii.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.paykii.dto.request.IOCatalogRequest;
import com.lftechnology.paykii.dto.response.IOCatalogResponse;
import com.lftechnology.paykii.service.ExecuteApiService;
import com.lftechnology.paykii.service.IOApiService;
import com.lftechnology.paykii.service.impl.ExecuteApiServiceImpl;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;
import java.util.Map;

/**
 * returns list of {@link IOCatalogResponse}
 * defines the inputs and outputs associated with each SKU
 * @author SaluKhadka <salukhadka@lftechnology.com>
 */
public class IOCatalogApi {

    private RequestApi requestApi;

    private ObjectMapper objectMapper = new ObjectMapper();

    private ExecuteApiService executeApiCall = new ExecuteApiServiceImpl();

    public IOCatalogApi(String baseUrl, Map<String,String> headers){
        this.requestApi = new RequestApi(baseUrl, headers);
    }

    public List<IOCatalogResponse> getIOCalalog(String token, IOCatalogRequest request) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        IOApiService service = retrofit.create(IOApiService.class);
        Map<String, Object> map = objectMapper.convertValue(request, Map.class);
        Call<List<IOCatalogResponse>> call = service.getIOCatalog(token,map);
        return executeApiCall.executeApiCall(call);
    }
}
