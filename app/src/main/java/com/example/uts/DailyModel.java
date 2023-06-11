package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DailyModel {

    int img;
    String txt;

    public DailyModel(int img, String txt) {
        this.img = img;
        this.txt = txt;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
