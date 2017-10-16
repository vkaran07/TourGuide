package com.example.karan.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        ArrayList<guide> items = new ArrayList<>();
        items.add(new guide(R.drawable.rockgarden, "Rock Garden", "1"));
        items.add(new guide(R.drawable.suknalake, "SukhnaLake", "2"));
        items.add(new guide(R.drawable.openhandmonument, "Open Hand Monument", "3"));
        items.add(new guide(R.drawable.mansadevi, "Mansadevi", "4"));
        guideAdapter attraction = new guideAdapter(this, items);
        ListView listview = (ListView) findViewById(R.id.activity_attractions);
        listview.setAdapter(attraction);
    }
}
