package com.app.flyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class viewFligths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_fligths);

        Intent intent = getIntent();

        String departureStation = intent.getStringExtra("departureStation");;
        String arrivalStation = intent.getStringExtra("arrivalStation");;
        String flightCarrier = intent.getStringExtra("flightCarrier");;
        String flightNumber = intent.getStringExtra("flightNumber");;
        String price = intent.getStringExtra("price");;

        TextView departureStationTextView = findViewById(R.id.departureStationTextView);
        TextView arrivalStationTextView = findViewById(R.id.arrivalStationTextView);
        TextView flightCarrierTextView = findViewById(R.id.flightCarrierTextView);
        TextView flightNumberTextView = findViewById(R.id.flightNumberTextView);
        TextView priceTextView = findViewById(R.id.priceTextView);

        departureStationTextView.setText(departureStation);
        arrivalStationTextView.setText(arrivalStation);
        flightCarrierTextView.setText(flightCarrier);
        flightNumberTextView.setText(flightNumber);
        priceTextView.setText(price);

    }
}