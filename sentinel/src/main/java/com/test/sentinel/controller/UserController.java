package com.test.sentinel.controller;

import com.test.sentinel.entity.User;
import com.test.sentinel.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public User getUser(@RequestParam(value = "name", required = false) String name) {
       return userService.getUser(name);
    }

}
