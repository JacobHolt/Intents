package com.example.jsu.lab4a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.*;
import java.util.Arrays;

public class tipCalculatorActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator_activty);
    }

    public void calculateButtonClicked(View v) {
        TextView totalAmountPerPerson = (TextView) findViewById(R.id.totalAmountPerPerson);
        TextView billAmountinput = (TextView) findViewById(R.id.billAmount);
        String billAmount = billAmountinput.getText().toString();
        double billAmountNumber = Double.parseDouble(billAmount);
        TextView percentageInput = (TextView) findViewById(R.id.tipPercentage);
        String percentageString = percentageInput.getText().toString();
        double percentageInt = Double.parseDouble(percentageString);
        TextView numOfPeopleInput = (TextView) findViewById(R.id.numOfPeople);
        String numOfPeopleString = numOfPeopleInput.getText().toString();
        double numOfPeopleInt = Double.parseDouble(numOfPeopleString);

        double percent = percentageInt / 100;
        percent = (percent * billAmountNumber) / numOfPeopleInt;
        double perPerson = billAmountNumber / numOfPeopleInt;
        perPerson += percent;
        perPerson = Math.floor(perPerson*100) / 100d;

        totalAmountPerPerson.setText("Total amount per person: $" + perPerson);
    }

    public void homeClicked(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
