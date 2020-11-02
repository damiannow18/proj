package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
int addUser(User user);
int deleteUser(String login);
int changePassword(String login, String newPassword);
User selectUserByLogin(String login);
List<User> showAllUsers();

}
