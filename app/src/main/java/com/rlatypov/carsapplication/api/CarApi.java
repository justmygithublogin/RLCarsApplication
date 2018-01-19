package com.rlatypov.carsapplication.api;


import com.rlatypov.carsapplication.models.Cars;

import java.util.List;

import retrofit2.http.GET;

/**
 * Created by rlatypov on 1/19/2018.
 */

public interface CarApi {

    @GET("cars.json")
    List<Cars> getCars();
}
