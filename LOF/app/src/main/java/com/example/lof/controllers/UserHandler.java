package com.example.lof.controllers;

//import com.android.volley.Request;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

import com.example.lof.database.AppDatabase;
import com.example.lof.datastructures.User;

import java.util.List;

public class UserHandler {
    private String DB_NAME = "sakoshi";

    public static AppDatabase getDatabase() {
        return database;
    }

    public static String getSessionid() {
        return sessionid;
    }

    private static AppDatabase database;
    private static String sessionid;

    private void setSession(String sessionid){
        this.sessionid = sessionid;
    }
    /*
        Ha bejelentkezik a felhasználó, akkor a 'sessionid'-t állítsuk be
        a "setSession" metódus segítségével a bejelentkezett felhasználó nevével.

        Amennyiben tartalmaz a 'sessionid' valamit, az azt jeleni hogy be van lépve.
        Amennyiben nincs semmi, akkor nincs belépve, egy ellenőrzéssel meglehet mondani hogy az adott felhasználó
        bevan lépve, és a nevével lekérdezéseket tudunk végrehajtani.

        Amennyiben a felhasználó kijelentkezik, a sessionid-t ki kell törölni.


     */
    public UserHandler(Context context) {
        database = Room.databaseBuilder(context, AppDatabase.class, DB_NAME).fallbackToDestructiveMigration().allowMainThreadQueries().build();
    }
    public void Register(String username, String password, String passwordconf){
        List<User> users = database.userDao().getAll();
        boolean hasUser = false;
        if(password.equals(passwordconf))
        {
            for (User user: users)
            {
                if (user.getUsername().equals(username)) {
                    hasUser = true;
                    break;
                }
            }

            if(!hasUser)
            {
                insert(username,password);
            }
        }
    }
    public static boolean Login(String username,String password){
        User[] users = database.userDao().getUser(username);
        if(users.length == 1) {
            return users[0].getPassword().equals(password);
        }
        return false;
    }

    private void insert(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(null);
        user.setProfilepicturepath(null);

        database.userDao().insertUser(user);
    }
}
