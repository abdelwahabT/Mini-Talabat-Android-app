package com.example.p_markets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView back = (ImageView) findViewById(R.id.tobaackk);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                //
                //
                // Page OF Markets
                //
                //
                //

            }
        });

    }
}