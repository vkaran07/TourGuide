package com.example.karan.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);
        ArrayList<guide> items = new ArrayList<guide>();
        items.add(new guide(R.drawable.rossgarden,getString(R.string.RoseGarden), "1"));
        items.add(new guide(R.drawable.bougainvillea,getString(R.string.BougainvilleaPark), "2"));
        items.add(new guide(R.drawable.shantikunj,getString(R.string.ShantikunjPark), "3"));
        items.add(new guide(R.drawable.rajendrapark,getString(R.string.RajendraPark), "4"));
        items.add(new guide(R.drawable.topiary,getString(R.string.TopiaryPark), "5"));
        guideAdapter parks = new guideAdapter(this, items);
        ListView listview = (ListView) findViewById(R.id.activity_parks);
        listview.setAdapter(parks);

    }
}
