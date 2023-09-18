package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

         PizzaData[] pizzaData = new PizzaData[]{
                 new PizzaData("بيتزا مارجريتا","60",R.drawable.margrita),
                 new PizzaData("بيتزا عشاق الجبنة","50",R.drawable.cheese),
                 new PizzaData("بيتزا سوبر سوبريم","70",R.drawable.supreme),
                 new PizzaData("بيتزا خضراوات","50",R.drawable.vegetables),
                 new PizzaData("بيتزا لحوم","60",R.drawable.meet),
                 new PizzaData("بيتزا بيبرونى","70",R.drawable.peproni),
                 new PizzaData("بيتزا جمبرى","80",R.drawable.pizza),

         };
         PizzaAdapter pizzaAdapter = new PizzaAdapter(pizzaData, this);
         recyclerView.setAdapter(pizzaAdapter);
    }
}