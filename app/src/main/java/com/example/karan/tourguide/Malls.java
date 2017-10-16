package com.example.karan.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
        ArrayList<guide> items = new ArrayList<guide>();
        items.add(new guide(R.drawable.centramall,getString(R.string.CentraMall), "1"));
        items.add(new guide(R.drawable.elante,getString(R.string.ElanteMall), "2"));
        items.add(new guide(R.drawable.tdi_mall, getString(R.string.TDIMall), "3"));
        items.add(new guide(R.drawable.city_emporium_shopping_mall_chandigarh, getString(R.string.TDIMall), "4"));
        items.add(new guide(R.drawable.sector_17_chandigarh, getString(R.string.Sector17), "5"));
        guideAdapter mall = new guideAdapter(this, items);
        ListView listview = (ListView) findViewById(R.id.activity_malls);
        listview.setAdapter(mall);

    }
}
