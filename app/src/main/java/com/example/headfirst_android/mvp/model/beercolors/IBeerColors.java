package com.example.headfirst_android.mvp.model.beercolors;

import java.util.ArrayList;

public interface IBeerColors {
    ArrayList<String> getBearArray();
    String getBeerBrand(int number);
    void setBeerBrand(String brand);
}
