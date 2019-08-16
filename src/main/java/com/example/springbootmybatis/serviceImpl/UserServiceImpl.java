package com.example.springbootmybatis.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    public String getUserBySex(int sex) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sex", sex);
        List<User> list = this.baseMapper.selectList(queryWrapper);

        String name = "";
        for (User user : list) {
            name += user.getName() + "!";
        }
        return name;
    }

}
