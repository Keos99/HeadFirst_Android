package com.example.headfirst_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView beerTextView;
    private Spinner beerSpinner;
    private Button beerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        run();
    }

    public void initUI (){
        beerTextView = findViewById(R.id.beer_textview);
        beerSpinner = findViewById(R.id.beer_spiner);
        beerButton = findViewById(R.id.beer_button);
    }

    public void run(){
        beerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beerTextView.setText(String.valueOf(beerSpinner.getSelectedItem()));
            }
        });
    }
}
