package com.example.lof.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG= "DatabaseHelper";
    private static final String DATABASE_NAME= "users.db";
    private static final String COL1= "username";
    private static final String COL2= "password";
    private static final String COL3= "email";
    private static final String COL4= "gold";

    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String valami = "CREATE TABLE " + "users" + "(" + COL1 + " VARCHAR PRIMARY KEY, " +
                                                             COL2 + " VARCHAR NOT NULL, " +
                                                             COL3 + " VARCHAR, " +
                                                             COL4 + " INTEGER)";
        db.execSQL(valami);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");

    }
    public String addRecord(String username, String password, String email, int gold){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL1,username);
        cv.put(COL2,password);
        cv.put(COL3,email);
        cv.put(COL4,gold);
        long res = db.insert("users",null,cv);
        if(res==-1){
            return "Hiba!";
        }
        else{
            return "Sikeres!";
        }
    }
}
