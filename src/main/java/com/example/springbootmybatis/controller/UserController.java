package com.example.springbootmybatis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "getUserById")
    public String getUserById(String id) {
        User user = userService.getById(id);
        return user.toString();
    }

    @ResponseBody
    @RequestMapping(value = "getUserBySex")
    public String getUserBySex(int sex) {
        return userService.getUserBySex(sex);
    }



}
