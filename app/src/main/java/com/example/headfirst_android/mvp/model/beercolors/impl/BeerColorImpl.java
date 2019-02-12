package com.example.headfirst_android.mvp.model.beercolors.impl;

import com.example.headfirst_android.mvp.model.beercolors.IBeerColors;

import java.util.ArrayList;

public class BeerColorImpl implements IBeerColors {
    private ArrayList<String> amberbeers = new ArrayList<>();

    @Override
    public ArrayList<String> getBearArray() {
        return amberbeers;
    }

    @Override
    public String getBeerBrand(int number) {
        return amberbeers.get(number);
    }

    @Override
    public void setBeerBrand(String brand) {
        amberbeers.add(brand);
    }
}
