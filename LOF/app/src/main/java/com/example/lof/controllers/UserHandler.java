package com.example.lof.controllers;

//import com.android.volley.Request;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.room.Room;

import com.example.lof.database.AppDatabase;
import com.example.lof.datastructures.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserHandler {
    private static String DB_NAME = "sakoshi";

    public static AppDatabase getDatabase() {
        return database;
    }

    public static String getSessionid() {
        return sessionid;
    }

    public static AppDatabase database;
    private static String sessionid;

    private static void setSession(String sessionid2){
        sessionid = sessionid2;
    }
    /*
        Ha bejelentkezik a felhasználó, akkor a 'sessionid'-t állítsuk be
        a "setSession" metódus segítségével a bejelentkezett felhasználó nevével.

        Amennyiben tartalmaz a 'sessionid' valamit, az azt jeleni hogy be van lépve.
        Amennyiben nincs semmi, akkor nincs belépve, egy ellenőrzéssel meglehet mondani hogy az adott felhasználó
        bevan lépve, és a nevével lekérdezéseket tudunk végrehajtani.

        Amennyiben a felhasználó kijelentkezik, a sessionid-t ki kell törölni.


     */
    public static void setUserHandler(Context context) {
        database = Room.databaseBuilder(context, AppDatabase.class, DB_NAME).fallbackToDestructiveMigration().allowMainThreadQueries().build();
    }
    public static void Register(Context context,String username, String password, String passwordconf){
        List<User> users = database.userDao().getAll();
        boolean hasUser = false;
        if(username.length() < 4) Toast.makeText(context,"A felhasználó névnek legalább 4 betűből kell állnia!", Toast.LENGTH_SHORT).show();
        else{
            if(password.length() < 4) Toast.makeText(context,"A jelszónak legalább 4 betűből kell állnia!", Toast.LENGTH_SHORT).show();
            else {
                Pattern p = Pattern.compile("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]");
                Matcher m = p.matcher(password);
                boolean b = m.find();
                if(b){
                    Toast.makeText(context,"A jelszó nem tartalmazhat speciális karaktereket!",Toast.LENGTH_SHORT).show();
                }
                else{
                    if (password.equals(passwordconf)) {
                        for (User user : users) {
                            if (user.getUsername().equals(username)) {
                                hasUser = true;
                                Toast.makeText(context, "Ezzel a névvel már regisztráltak!", Toast.LENGTH_SHORT).show();
                                break;
                            }
                        }

                        if (!hasUser) {
                            insert(username, password);
                            Toast.makeText(context, "Sikeres Regiszráció!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(context, "A két jelszó nem egyezik meg.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
    }
    public static boolean Login(String username,String password){
        User[] users = database.userDao().getUser(username);
        if(users.length == 1) {
            sessionid = username;
            return users[0].getPassword().equals(password);
        }
        return false;
    }

    private static void insert(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setGold(5000);
        user.setEmail(null);
        user.setProfilepicturepath(null);
        user.setExperience(0);
        database.userDao().insertUser(user);
    }
}
