package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DBHelper myDB = new DBHelper(this) ;

        TextView email = (TextView) findViewById(R.id.email)  ;
        TextView password = (TextView) findViewById(R.id.password)  ;

        MaterialButton login_btn = (MaterialButton) findViewById(R.id.loginbt);





        TextView forgot_pass = (TextView) findViewById(R.id.fgotpass);

        TextView signup = (TextView) findViewById(R.id.gosignup) ;

        MaterialButton guest = (MaterialButton) findViewById(R.id.guest);



        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String useremail = email.getText().toString() ;
                String userpassword = password.getText().toString();

                if (useremail.equals("") || userpassword.equals(""))
                {
                    Toast.makeText(MainActivity.this, "You must enter the email and password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean result_login = myDB.checkemailpassword (useremail , userpassword) ;
                    if (result_login == true) {

                        Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                        //
                        //
                        //
                        // Enter the next page to LOGIN
                        //
                        //
                        //

                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Wrong email or password !", Toast.LENGTH_SHORT).show();
                    }
                }



            }            });



        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Forgotpass.class) ;
                startActivity(intent);

            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Signup.class) ;
                startActivity(intent);

            }
        });


        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                //
                //
                // Enter the guest page
                //
                //
                //


                Toast.makeText(MainActivity.this, "welcome as a guest", Toast.LENGTH_SHORT).show();

            }            });


    }

}