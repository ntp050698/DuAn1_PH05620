package com.abc.phongnguyen.duan_cafemanage.model;


public class Coffee {

    private String mTeaName;
    private int mImageResourceId;

    public Coffee(String teaName, int imageResourceId) {
        mTeaName = teaName;
        mImageResourceId = imageResourceId;
    }

    public String getTeaName() {
        return mTeaName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
