package com.example.jsu.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import 	android.content.Intent;

import org.w3c.dom.Text;

import java.util.*;
import java.util.Arrays;

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
