package com.example.categorical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Markets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markets);

        RelativeLayout carfour  = (RelativeLayout) findViewById(R.id.carfour);
        RelativeLayout hyperone  = (RelativeLayout) findViewById(R.id.hyperone);
        RelativeLayout spinneys  = (RelativeLayout) findViewById(R.id.spinneys);

        ImageView back = (ImageView) findViewById(R.id.tobackk);


        carfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Markets.this, "Carrefour products", Toast.LENGTH_SHORT).show();
                //
                //
                //
                //  Here is the products page of Carrefour
                //
                //
                //


            }
        });

        hyperone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Markets.this, "Hyper One products", Toast.LENGTH_SHORT).show();
                //
                //
                //
                //  Here is the products page of Hyper One
                //
                //
                //


            }
        });


        spinneys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Markets.this, "Spinneys products", Toast.LENGTH_SHORT).show();
                //
                //
                //
                //  Here is the products page of Spinneys
                //
                //
                //


            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Markets.this , MainActivity.class) ;
                startActivity(intent);

            }
        });

    }
}