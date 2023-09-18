package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Forgotpass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass);


        DBHelper myDB = new DBHelper(this) ;


        TextView email_user = (TextView) findViewById(R.id.useremail)  ;
        TextView num_phone = (TextView) findViewById(R.id.phone)  ;
        TextView new_pass = (TextView) findViewById(R.id.newpass)  ;
        TextView confirm_pass = (TextView) findViewById(R.id.renewpass)  ;


        MaterialButton loginpage = (MaterialButton) findViewById(R.id.gologinpage);

        MaterialButton confirm = (MaterialButton) findViewById(R.id.confirmpass);



        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Forgotpass.this , MainActivity.class) ;
                startActivity(intent);
            }            });






        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email  = email_user.getText().toString() ;
                String phone = num_phone.getText().toString() ;
                String newpass = new_pass.getText().toString() ;
                String re_newpass = confirm_pass.getText().toString() ;

                if (email.equals("") || phone.equals("")|| newpass.equals("") || re_newpass.equals(""))
                {
                    Toast.makeText(Forgotpass.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Boolean result_emailphone = myDB.checkemailphone (email , phone) ;
                    if (result_emailphone == true)
                    {
                        if (newpass.equals(re_newpass))
                        {
                            myDB.updatepassword(email , newpass);
                            Toast.makeText(Forgotpass.this, "Password has been updated", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(Forgotpass.this , MainActivity.class) ;
                            startActivity(intent);

                        }
                        else
                        {
                            Toast.makeText(Forgotpass.this, "The password must match", Toast.LENGTH_SHORT).show();
                        }



                    }
                    else
                    {
                        Toast.makeText(Forgotpass.this, "Wrong email or Number Phone !", Toast.LENGTH_SHORT).show();
                    }

                }






            }            });




    }
}