package com.example.headfirst_android.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.headfirst_android.R;
import com.example.headfirst_android.mvp.presenter.MainActivityBeersPresenter;
import com.example.headfirst_android.mvp.presenter.MainActivityPresenter;
import com.example.headfirst_android.mvp.view.MainActivityView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    private TextView beerTextView;
    private Spinner beerSpinner;
    private Button beerButton;
    ArrayAdapter<String> lightbeer;
    ArrayAdapter<String> amberbeer;
    ArrayAdapter<String> brovnbeer;

    @InjectPresenter
    MainActivityPresenter mainActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void initUI (){
        beerTextView = findViewById(R.id.beer_textview);
        beerSpinner = findViewById(R.id.beer_spiner);
        beerButton = findViewById(R.id.beer_button);

        beerButton.setOnClickListener(v -> mainActivityPresenter.setBeerText());
    }

    @Override
    public void beerTextViewSetText() {
        beerTextView.setText(String.valueOf(beerSpinner.getSelectedItem()));
    }
}
