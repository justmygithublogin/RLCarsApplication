package com.rlatypov.carsapplication.models;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by rlatypov on 1/19/2018.
 */

public class Car implements Serializable {

    public Car(String manufacturer, String model, Integer price, String wiki, String img) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.wiki = wiki;
        this.img = img;
    }

    @Expose
    private String manufacturer;
    @Expose
    private String model;
    @Expose
    private Integer price;
    @Expose
    private String wiki;
    @Expose
    private String img;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wiki='" + wiki + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
