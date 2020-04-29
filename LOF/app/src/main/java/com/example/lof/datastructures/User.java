package com.example.lof.datastructures;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@Entity(tableName = "users")
public class User{

    public User() { }

    //Fields
    @PrimaryKey
    @NotNull
    private String username;
    @NotNull
    private String password;
    private String email;
    private String profilepicturepath;

    private int gold;

    //Properties
    @NotNull
    public String getUsername() {
        return username;
    }
    public void setUsername(@NotNull String username) {
        this.username = username;
    }
    @NotNull
    public String getPassword() {
        return password;
    }
    public void setPassword(@NotNull String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProfilepicturepath() {
        return profilepicturepath;
    }
    public void setProfilepicturepath(String profilepicturepath) {
        this.profilepicturepath = profilepicturepath;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }

}
