package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        DBHelper myDB = new DBHelper(this) ;

        TextView email = (TextView) findViewById(R.id.eemail) ;
        TextView fname = (TextView) findViewById(R.id.finame) ;
        TextView lname = (TextView) findViewById(R.id.laname) ;
        TextView phone = (TextView) findViewById(R.id.nophone) ;
        TextView pass = (TextView) findViewById(R.id.passw) ;
        TextView repass = (TextView) findViewById(R.id.repassw) ;

        MaterialButton gologin = (MaterialButton) findViewById(R.id.gologin);
        MaterialButton reg = (MaterialButton) findViewById(R.id.confirm);


        gologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Signup.this , MainActivity.class) ;
                startActivity(intent);
            }            });





        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user_email  = email.getText().toString();
                String user_fname  = fname.getText().toString();
                String user_lname  = lname.getText().toString();
                String user_phone  = phone.getText().toString();
                String user_pass   = pass.getText().toString();
                String user_repass = repass.getText().toString();

                if (user_email.equals("") || user_fname.equals("") || user_lname.equals("") || user_phone.equals("") || user_pass.equals("") || user_repass.equals(""))
                {
                    Toast.makeText(Signup.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (user_pass.equals(user_repass))
                    {
                        Boolean check_email = myDB.checkemail(user_email) ;
                        Boolean check_phone = myDB.checkphone(user_phone) ;
                        if (check_email == false && check_phone == false)
                        {

                           Boolean check_reg =  myDB.insertdata(user_email , user_fname , user_lname , user_phone , user_pass) ;

                           if (check_reg == true)
                           {
                               Toast.makeText(Signup.this, "Registration successful", Toast.LENGTH_SHORT).show();
                               Intent intent = new Intent(Signup.this , MainActivity.class) ;
                               startActivity(intent);

                           }
                           else
                           {
                               Toast.makeText(Signup.this, "Registration Fail", Toast.LENGTH_SHORT).show();

                           }

                        }
                        else
                        {
                            if (check_email == true ) {
                                Toast.makeText(Signup.this, "This email is already registered", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Toast.makeText(Signup.this, "This Number phone is already registered", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                    else
                    {
                        Toast.makeText(Signup.this, "The password must match", Toast.LENGTH_SHORT).show();

                    }

                }

            }            });


    }
}