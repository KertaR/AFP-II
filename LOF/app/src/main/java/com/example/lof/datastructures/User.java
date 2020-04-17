package com.example.lof.datastructures;

import java.util.ArrayList;

public class User{


    public User(String username, String password, String email, String profilepicturepath, ArrayList<Character> characters) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.profilepicturepath = profilepicturepath;
        this.characters = characters;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getProfilepicturepath() {
        return profilepicturepath;
    }

    public void setProfilepicturepath(String profilepicturepath) {
        this.profilepicturepath = profilepicturepath;
    }

    private String profilepicturepath;

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    private ArrayList<Character> characters = new ArrayList<>();

}
