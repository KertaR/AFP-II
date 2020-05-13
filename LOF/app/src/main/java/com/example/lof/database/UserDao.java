package com.example.lof.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lof.datastructures.User;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface UserDao {
    @Insert
    public void insertUser(User user);
    @Update
    public void updateUsers(User user);
    @Delete
    public void deleteUsers(User user);
    @Query("SELECT * FROM users")
    List<User> getAll();
    @Query("SELECT username FROM users WHERE username = :username")
    public String getUsername(String username);
    @Query("SELECT password FROM users WHERE username = :username")
    public String getPassword(String username);
    @Query("SELECT gold FROM users WHERE username = :username")
    public int getGold(String username);
    @Query("SELECT experience FROM users WHERE username = :username")
    public int getExperience(String username);
    @Query("UPDATE users SET experience = :experience WHERE username = :username")
    public void setExperience(int experience, String username);
    @Query("UPDATE users SET gold = :gold  WHERE username = :username")
    public void setGold(int gold, String username);
    @Query("SELECT * FROM users WHERE username = :username")
    public User[] getUser(String username);
}
