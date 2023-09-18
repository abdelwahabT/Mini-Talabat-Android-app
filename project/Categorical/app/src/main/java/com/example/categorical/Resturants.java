package com.example.categorical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Resturants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);

        RelativeLayout kfc  = (RelativeLayout) findViewById(R.id.kfc);
        RelativeLayout pizzahut  = (RelativeLayout) findViewById(R.id.pizzahut);
        RelativeLayout asmak  = (RelativeLayout) findViewById(R.id.asmak);

        ImageView back = (ImageView) findViewById(R.id.toback);





        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Resturants.this, "meals of kfc", Toast.LENGTH_SHORT).show();
                //
                //
                //
                //  Here is the meals page of kfc
                //
                //
                //


            }
        });

        pizzahut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Resturants.this, "meals of pizza hut", Toast.LENGTH_SHORT).show();
                //
                //
                //
                //  Here is the meals page of pizza hut
                //
                //
                //

            }
        });


        asmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Resturants.this, "meals of Asmak", Toast.LENGTH_SHORT).show();
                //
                //
                //
                //  Here is the meals page of Asmak
                //
                //
                //

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Resturants.this , MainActivity.class) ;
                startActivity(intent);

            }
        });


    }
}