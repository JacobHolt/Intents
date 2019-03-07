package com.example.jsu.lab4a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class fahrenheitToCelsiusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius);
    }

    public void convertTemperatureClicked(View v) {
        String f = ((EditText) findViewById(R.id.inputF)).getText().toString();
        String c = ((EditText) findViewById(R.id.inputC)).getText().toString();
        if (  f.isEmpty() ) {
            if (  !c.isEmpty() ) {
                 double celsius = Double.parseDouble(c);
                 double fahrenheit = ((celsius * 9 / 5) + 32);
                 ((EditText) findViewById(R.id.inputF)).setText( Double.toString(fahrenheit) );
            }
        }
        else if( c.isEmpty()){
                 double fahrenheit = Double.parseDouble(f);
                 double celsius = ((fahrenheit - 32) * 5 / 9);
                 ((EditText) findViewById(R.id.inputC)).setText( Double.toString(celsius) );
            }
        else if( c.isEmpty() && f.isEmpty()) {

        }
        else {
            double fahrenheit = Double.parseDouble(f);
            double celsius = ((fahrenheit - 32) * 5 / 9);
            ((EditText) findViewById(R.id.inputC)).setText( Double.toString(celsius) );
        }
    }

    public void homeClicked(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
