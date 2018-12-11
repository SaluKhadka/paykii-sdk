package com.lftechnology.paykii.service;

import retrofit2.Call;

public interface ExecuteApiService {

    public <T> T executeApiCall(Call<T> call);
}


