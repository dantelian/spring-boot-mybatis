package com.example.springbootmybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootmybatis.entity.User;

public interface IUserService extends IService<User> {

    String getUserBySex(int sex);

}
