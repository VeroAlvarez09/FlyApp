package com.app.flyapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.FlingAnimation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Flights> elements;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void  init(){
        elements = new ArrayList<>();
        elements.add(new Flights("MDE","BOG","CO","8001","300"));
        elements.add(new Flights("MZL","MDE","CO","8002","200"));
        elements.add(new Flights("PEI","BOG","CO","8003","150"));
        elements.add(new Flights("MDE","BCN","CO","8004","250"));


        FlightAdapter listAdapter = new FlightAdapter(elements,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setAdapter(listAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}