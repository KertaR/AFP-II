package com.example.lof.controllers;

//import com.android.volley.Request;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

import com.example.lof.database.AppDatabase;
import com.example.lof.datastructures.User;

public class UserHandler {
    private String DB_NAME = "sakoshi";
    private static AppDatabase database;
    public UserHandler(Context context) {
        database = Room.databaseBuilder(context, AppDatabase.class, DB_NAME).build();
    }
    public void Register(String username, String password){
        insert(username,password);
    }
    public void Login(){

    }
    public void getData(){

    }

    public void insert(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(null);
        user.setProfilepicturepath(null);

        insertUser(user);
    }
    private static void insertUser(final User user) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                database.userDao().insertUser(user);
                return null;
            }
        }.execute();
    }
}
