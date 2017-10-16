package com.example.karan.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by karan on 3/28/2017.
 */
public class guideAdapter extends ArrayAdapter<guide> {
    public guideAdapter(Activity context, ArrayList<guide> items) {
        super(context, 0, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout, parent, false);

        }
        guide currentguide = getItem(position);
        ImageView img = (ImageView) ListItemView.findViewById(R.id.Img);
        img.setImageResource(currentguide.getImage());
        TextView textView = (TextView) ListItemView.findViewById(R.id.Title);
        textView.setText(currentguide.getTitle());
        TextView descri = (TextView) ListItemView.findViewById(R.id.description);
        descri.setText(currentguide.getDescription());
        return ListItemView;

    }

}


