package com.dicoding.submission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DataDiri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Data Diri");
    }
}
