package com.rlatypov.carsapplication.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rlatypov on 1/19/2018.
 */

public class RetrofitClient {
    private static final String ROOT_URL = "http://handyaudit.ru/";

    private static Retrofit getInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static CarApi getCarApi() {
        return getInstance().create(CarApi.class);
    }
}
