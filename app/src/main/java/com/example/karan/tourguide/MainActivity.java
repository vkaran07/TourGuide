package com.example.karan.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView parks = (TextView) findViewById(R.id.park);
        parks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parksIntent);
            }
        });
        final TextView hotels = (TextView) findViewById(R.id.hotel);
        hotels.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent hotelIntent = new Intent(MainActivity.this, Hotels.class);
                startActivity(hotelIntent);
            }
        });
        final TextView attraction = (TextView) findViewById(R.id.attraction);
        attraction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent AttractionIntent = new Intent(MainActivity.this, Attractions.class);
                startActivity(AttractionIntent);
            }
        });
        final TextView malls = (TextView) findViewById(R.id.mall);
        malls.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mallsIntent = new Intent(MainActivity.this, Malls.class);
                startActivity(mallsIntent);
            }
        });

    }
}