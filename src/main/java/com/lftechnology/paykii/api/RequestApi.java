package com.lftechnology.paykii.api;

import com.lftechnology.paykii.utils.ApiUtils;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Map;

/**
 * @author SaluKhadka <salukhadka@lftechnology.com>
 */
public class RequestApi {
    private String baseUrl;
    private Headers headers;

    public RequestApi(String baseUrl, Map<String,String> headers){
        this.baseUrl = baseUrl;
        this.headers = ApiUtils.buildHeader(headers);
    }

    public Retrofit getRetrofitObject(){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient
                .Builder()
                .addInterceptor(httpLoggingInterceptor);

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder()
                        .headers(headers);
                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        return new Retrofit
                .Builder()
                .baseUrl(this.baseUrl)
                .client(httpClient.build())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
}
