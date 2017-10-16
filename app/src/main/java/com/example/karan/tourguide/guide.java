package com.example.karan.tourguide;

/**
 * Created by karan on 3/17/2017.
 */
public class guide {
    private int mimg;
    private String mtitle;
    private String mdescription;

    public guide(int img, String title, String description) {
        mimg = img;
        mtitle = title;
        mdescription = description;


    }

    public int getImage() {
        return mimg;
    }

    public String getTitle() {
        return mtitle;
    }

    public String getDescription() {
        return mdescription;
    }

}
