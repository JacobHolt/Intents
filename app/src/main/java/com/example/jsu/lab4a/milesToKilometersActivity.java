package com.example.jsu.lab4a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class milesToKilometersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_kilometers);
    }

    public void convertTemperatureClicked(View v) {
        String m = ((EditText) findViewById(R.id.inputM)).getText().toString();
        String k = ((EditText) findViewById(R.id.inputK)).getText().toString();
        if (  m.isEmpty() ) {
            if (  !k.isEmpty() ) {
                double kilometer = Double.parseDouble(k);
                double miles = (kilometer * 0.62137);
                ((EditText) findViewById(R.id.inputM)).setText( Double.toString(miles) );
            }
        }
        else if (k.isEmpty()){
            double miles = Double.parseDouble(m);
            double kilometer = (miles / 0.62137);
            ((EditText) findViewById(R.id.inputK)).setText( Double.toString(kilometer) );
        }
        else if( k.isEmpty() && m.isEmpty()) {

        }
        else {
            double miles = Double.parseDouble(m);
            double kilometer = (miles / 0.62137);
            ((EditText) findViewById(R.id.inputK)).setText( Double.toString(kilometer) );
        }
    }

    public void homeClicked(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
