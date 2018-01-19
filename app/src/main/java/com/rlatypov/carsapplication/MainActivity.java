package com.rlatypov.carsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rlatypov.carsapplication.api.CarApi;
import com.rlatypov.carsapplication.api.RetrofitClient;

import java.io.Serializable;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarApi carApi = RetrofitClient.getCarApi();
        //todo
        Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
        intent.putExtra("cars", (Serializable) carApi.getCars());
        startActivity(intent);
    }
}
