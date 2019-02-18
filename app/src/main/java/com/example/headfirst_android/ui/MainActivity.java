package com.example.headfirst_android.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.headfirst_android.R;
import com.example.headfirst_android.mvp.presenter.MainActivityPresenter;
import com.example.headfirst_android.mvp.view.MainActivityView;

public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    private TextView beerTextView;
    private Spinner beerSpinner;
    private Button beerButton;

    private String[] amber;
    private String[] light;
    private String[] brown;
    private String[] dark;
    private String[] beer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initArrays();
        initUI();
        mainActivityPresenter.initArrays(amber,light,brown,dark,beer);
    }

    @InjectPresenter
    MainActivityPresenter mainActivityPresenter;

    public void initUI (){
        beerTextView = findViewById(R.id.beer_textview);
        beerSpinner = findViewById(R.id.beer_spiner);
        beerButton = findViewById(R.id.beer_button);

        beerButton.setOnClickListener(v -> mainActivityPresenter.setBeerText(String
                .valueOf(beerSpinner.getSelectedItem())));
    }

    public void initArrays(){
        amber = getResources().getStringArray(R.array.amber);
        light = getResources().getStringArray(R.array.light);
        brown = getResources().getStringArray(R.array.brown);
        dark = getResources().getStringArray(R.array.dark);
        beer = getResources().getStringArray(R.array.beer);
    }

    @Override
    public void beerTextViewSetText(String text) {
        beerTextView.setText(text);
    }
}
