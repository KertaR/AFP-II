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
    private String password;
    private String email;
    private String profilepicturepath;

    //Properties
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
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

}
