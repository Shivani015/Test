package com.example.joker.androidtest;

import android.media.Image;

//TODO 6 Create setters and getters

public class Movie {

   private String name, detail;
   private int image;


    public Movie(String name, String detail) {

        this.name =name;
        this.detail =detail;
        this.image =image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() { return  detail;}

    public  void  setDetail(String detail) {this.detail=detail;}

    public int getimage() {
        return image; }

    public void setimage(int image) {
        this.image = image;
    }





}
