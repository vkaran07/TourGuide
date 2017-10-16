package com.example.karan.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hotels);
        ArrayList<guide> items = new ArrayList<guide>();
        items.add(new guide(R.drawable.jwmarriotthotel,getString(R.string.jwmarriotthotel),"1"));
        items.add(new guide(R.drawable.hyattregency,getString(R.string.HyattRegency),"2"));
        items.add(new guide(R.drawable.tajchandigarh,getString(R.string.TajHotel),"3"));
        items.add(new guide(R.drawable.goldentulip,getString(R.string.GoldenTulipHotel),"4"));
        items.add(new guide(R.drawable.thelalit,getString(R.string.TheLalit),"5"));
        ListView listview =(ListView)findViewById(R.id.activity_hotels);
        listview.setAdapter(new guideAdapter(this,items));
    }
}
