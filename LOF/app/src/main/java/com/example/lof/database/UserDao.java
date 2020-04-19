package com.example.lof.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.lof.datastructures.User;

@Dao
public interface UserDao {
    @Insert
    public void insertUser(User user);
    @Update
    public void updateUsers(User user);
    @Delete
    public void deleteUsers(User user);
}
