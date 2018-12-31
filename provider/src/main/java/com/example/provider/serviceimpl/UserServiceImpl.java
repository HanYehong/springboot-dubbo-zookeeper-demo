package com.example.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.entity.User;
import com.example.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("没想到吧");
        user.setPassword("123456");
        return user;
    }
}
