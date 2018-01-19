package com.rlatypov.carsapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import java.util.List;

/**
 * Created by rlatypov on 1/19/2018.
 */

public class GalleryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //todo
        List cars = (List) getIntent().getSerializableExtra("cars");
    }
}
