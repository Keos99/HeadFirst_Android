package com.example.headfirst_android.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.headfirst_android.mvp.model.beercolors.IBeerColors;
import com.example.headfirst_android.mvp.model.beercolors.impl.BeerColorImpl;
import com.example.headfirst_android.mvp.view.MainActivityView;

@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView> {



    private IBeerColors ambercolor = new BeerColorImpl();
    private IBeerColors browncolor = new BeerColorImpl();
    private IBeerColors darkcolor = new BeerColorImpl();
    private IBeerColors lightcolor = new BeerColorImpl();

    public void setBeerText(){
        getViewState().beerTextViewSetText();
    }


}
