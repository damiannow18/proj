package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
int addUser(User user);
int deleteUser(User user);
int changePassword(User user);
List<User> showAllUsers();

}
