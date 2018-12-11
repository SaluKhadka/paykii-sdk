package com.lftechnology.paykii.utils;

import com.lftechnology.paykii.constant.ApiConstants;
import okhttp3.Headers;
import java.util.Map;

public class ApiUtils {

    private ApiUtils(){}

    public static Headers getDefaultHeader(){
        Headers.Builder builder = new Headers.Builder();
        builder.add(ApiConstants.CONTENT_TYPE, ApiConstants.CONTENT_VALUE);
        builder.add(ApiConstants.X_API_KEY, ApiConstants.X_API_VALUE);
        return builder.build();
    }

    public static Headers buildHeader(Map<String,String> headers ){
       Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return builder.build();
    }
}
