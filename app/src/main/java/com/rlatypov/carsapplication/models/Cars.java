package com.rlatypov.carsapplication.models;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rlatypov on 1/19/2018.
 */

public class Cars implements Serializable {
    public Cars(List<Car> data) {
        this.data = data;
    }

    @Expose
    private List<Car> data;

    public List<Car> getCars() {
        return data;
    }

    public void setCars(List<Car> cars) {
        this.data = cars;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "data=" + data +
                '}';
    }
}
