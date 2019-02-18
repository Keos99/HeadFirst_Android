package com.example.headfirst_android.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.headfirst_android.mvp.view.MainActivityView;

@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView> {

    private String[] amber;
    private String[] light;
    private String[] brown;
    private String[] dark;
    private String[] beer;

    public void setBeerText(String text){
        getViewState().beerTextViewSetText(beerText(text));
    }

    public void initArrays (String[] anber,String[] light,String[] brown,String[] dark,
                            String[] beer){
        this.amber = anber;
        this.light = light;
        this.brown = brown;
        this.dark = dark;
        this.beer = beer;
    }

    public String beerText(String beercolor){
        if (beer[0].equals(beercolor)){
            return beerTextBuilder(light);
        }else if (beer[1].equals(beercolor)){
            return beerTextBuilder(amber);
        }else if (beer[2].equals(beercolor)){
            return beerTextBuilder(brown);
        }else if (beer[3].equals(beercolor)){
            return beerTextBuilder(dark);
        }
        return "Error";
    }

    public String beerTextBuilder (String[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]).append("\n");
        }
        return stringBuilder.toString();
    }
}
