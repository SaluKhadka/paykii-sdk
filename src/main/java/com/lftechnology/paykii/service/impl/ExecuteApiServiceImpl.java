package com.lftechnology.paykii.service.impl;

import com.lftechnology.paykii.exception.ApiException;
import com.lftechnology.paykii.service.ExecuteApiService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class ExecuteApiServiceImpl implements ExecuteApiService{

    @Override
    public  <T> T executeApiCall(Call<T> call) {

        try {
            Response<T> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(String.valueOf(response.body()));
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException(e.getMessage());
        }
    }
}
