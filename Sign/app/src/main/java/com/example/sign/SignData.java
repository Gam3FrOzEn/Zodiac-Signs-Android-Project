package com.example.sign;

import android.widget.ImageView;

public class SignData {
    String signName;
    String signImageName;
    ImageView imageView;

    public SignData(String signName, String signImageName, ImageView imageView){
        this.signName = signName;
        this.signImageName = signImageName;
        this.imageView = imageView;
    }
}
