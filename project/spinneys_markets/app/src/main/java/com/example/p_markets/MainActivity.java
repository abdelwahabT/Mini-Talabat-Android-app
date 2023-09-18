package com.example.p_markets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout all;
    Switch sw0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView back = (ImageView) findViewById(R.id.tobaackk);

        all=findViewById(R.id.all);
        sw0=findViewById(R.id.switch1);
        sw0.setText(R.string.mode0);
        sw0.setTextColor(Color.GRAY);
        sw0.setChecked(false);
        sw0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw0.isChecked()){
                all.setBackgroundColor(Color.BLACK);
                sw0.setText(R.string.mode1);
                sw0.setTextColor(Color.MAGENTA);}
                else {
                    sw0.setText(R.string.mode0);
                    sw0.setTextColor(Color.BLACK);
                    all.setBackgroundColor(Color.rgb(117,255,220));
                }
            }
        });

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