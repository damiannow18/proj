package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;
@Autowired
    public UserService(@Qualifier("firstDao") UserDao userDao) {
        this.userDao = userDao;
    }
    public int addUserService(User user)
    {
        return userDao.addUser(user);
    }

    public int deleteUserService(String login)
    {
        return userDao.deleteUser(login);
    }

    public int changePasswordService(String login, String newPassword)
    {
        return userDao.changePassword(login, newPassword);
    }

    public List<User> getAllUsers(){
    return userDao.showAllUsers();
    }
}
