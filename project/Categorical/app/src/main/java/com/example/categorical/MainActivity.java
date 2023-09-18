package com.example.categorical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout resturants  = (RelativeLayout) findViewById(R.id.resturants);
        RelativeLayout markets  = (RelativeLayout) findViewById(R.id.markets);
        RelativeLayout desserts  = (RelativeLayout) findViewById(R.id.desserts);



        resturants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Resturants.class) ;
                startActivity(intent);

            }
        });

        markets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Markets.class) ;
                startActivity(intent);

            }
        });


        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Dessert.class) ;
                startActivity(intent);

            }
        });




    }
}