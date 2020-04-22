package com.example.lof.views;

import com.example.lof.controllers.UserHandler;
import com.example.lof.database.AppDatabase;

public class ProfileView {
    private AppDatabase databases = UserHandler.getDatabase();
    private String session = UserHandler.getSessionid();
    public String Gold(){
        int query = databases.userDao().getGold(session);
        String gold = Integer.toString(query);
        return gold;
    }
    public String Username(){
        return databases.userDao().getUsername(session);
    }
}
