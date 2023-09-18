package com.example.loginpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Login.db" , null , 1 );
    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("create Table users(email Text primary key , fname Text , lname Text , phone Text , password Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int oldVersion, int newVersion ) {

        myDB.execSQL("drop Table if exists users");
    }

    // insert data in table
    public Boolean insertdata (String email ,  String fname , String lname , String phone , String password) {
        SQLiteDatabase myDB = this.getWritableDatabase() ;
        ContentValues contentValues = new ContentValues() ;
        contentValues.put("email" , email);
        contentValues.put("fname" , fname);
        contentValues.put("lname" , lname);
        contentValues.put("phone" , phone);
        contentValues.put("password" , password);


        long result  = myDB.insert("users" , null , contentValues) ;

        if (result == -1) {
            return false;
        }
        else {
            return true;
        }
    }


    // check email is exist or No

    public Boolean checkemail (String email)
    {
        SQLiteDatabase myDb = this.getWritableDatabase() ;
        Cursor cursor = myDb.rawQuery("select * from users where email = ? " , new String[]{email}) ;

        if (cursor.getCount() > 0 ) {
            return true ;
        }
        else {
            return false ;
        }
    }

    // check phone  is exist or No

    public Boolean checkphone (String phone)
    {
        SQLiteDatabase myDb = this.getWritableDatabase() ;
        Cursor cursor = myDb.rawQuery("select * from users where phone = ? " , new String[]{phone}) ;

        if (cursor.getCount() > 0 ) {
            return true ;
        }
        else {
            return false ;
        }
    }


    // check email and password for Login

    public Boolean checkemailpassword (String email , String password) {
        SQLiteDatabase myDb = this.getWritableDatabase();
        Cursor cursor = myDb.rawQuery("select * from users where email = ? and password = ? ", new String[]{email, password});
        if (cursor.getCount() > 0) {
            return true;

        } else {
            return false;
        }

    }


    // check email and phone for Forgot Password

    public Boolean checkemailphone (String email , String phone) {
        SQLiteDatabase myDb = this.getWritableDatabase();
        Cursor cursor = myDb.rawQuery("select * from users where email = ? and phone = ? ", new String[]{email, phone});
        if (cursor.getCount() > 0) {
            return true;

        } else {
            return false;
        }

    }


    // Update Password For Forgot Password

    public void updatepassword (String email , String password)
    {

        SQLiteDatabase myDb = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues() ;
        contentValues.put("password" , password);
        myDb.update("users" , contentValues , "email = ?" , new String[]{email}) ;
    }



}
