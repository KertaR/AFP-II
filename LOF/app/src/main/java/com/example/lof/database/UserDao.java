package com.example.lof.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lof.datastructures.User;

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
    @Query("SELECT * FROM users WHERE username = :username")
    public User[] getUser(String username);
}
