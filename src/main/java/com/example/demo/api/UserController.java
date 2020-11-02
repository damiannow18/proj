package com.example.demo.api;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/user")
@RestController
public class UserController {
    private UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
   @PostMapping
    public void addUser(@RequestBody User user)
   {
       userService.addUserService(user);
   }
   @GetMapping
    public void showUsers()
   {
       userService.getAllUsers();
   }


}
