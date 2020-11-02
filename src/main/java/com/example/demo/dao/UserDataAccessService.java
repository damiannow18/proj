package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("firstDao")
public class UserDataAccessService implements UserDao {
    private List<User> userList;
    @Override
    public int addUser(User user) {
        userList.add(new User(user.getLogin(), user.getPassword()));
        return 1;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }

    @Override
    public int changePassword(User user) {
        return 0;
    }

    @Override
    public List<User> showAllUsers() {
        return userList;
    }
}
