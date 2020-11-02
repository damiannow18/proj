package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("firstDao")
public class UserDataAccessService implements UserDao {
    private List<User> userList = new ArrayList<>();

    @Override
    public int addUser(User user) {
        userList.add(new User(user.getLogin(), user.getPassword()));
        return 1;
    }

    @Override
    public int deleteUser(String login) {
        User user = selectUserByLogin(login);
        userList.remove(user);
        return 1;
    }

    @Override
    public int changePassword(String login, String newPassword) {
        User user = selectUserByLogin(login);
        if(user!=null)
        user.setPassword(newPassword);
        return 1;
    }

    @Override
    public User selectUserByLogin(String login) {
        for (int x = 0; x < userList.size(); x++) {
            User user = userList.get(x);
            if (user.getLogin().equals(login))
                return user;
            }
                return null;
        }

        @Override
        public List<User> showAllUsers () {
            return userList;
        }
    }
