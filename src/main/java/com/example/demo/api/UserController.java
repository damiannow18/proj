package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUserService(user);
    }

    @GetMapping
    public List<User> showUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping(path="{login}")
    public void deleteUser(@PathVariable("login") String login){userService.deleteUserService(login);}

    @PutMapping(path="{login}")
    public void changePassword(@PathVariable("login") String login,@RequestBody String newPassword){
        userService.changePasswordService(login, newPassword);
    }
}
