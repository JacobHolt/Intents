package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import 	android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculateButtonClicked(View v) {
        Intent i = new Intent(this, tipCalculatorActivty.class);
        startActivity(i);
    }
    public void milesButtonClicked(View v) {
        Intent i = new Intent(this, milesToKilometersActivity.class);
        startActivity(i);
    }
    public void tempButtonClicked(View v) {
        Intent i = new Intent(this, fahrenheitToCelsiusActivity.class);
        startActivity(i);
    }
}
