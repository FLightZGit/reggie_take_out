package com.astronaut.reggie.service.impl;

import com.astronaut.reggie.entity.User;
import com.astronaut.reggie.mapper.UserMapper;
import com.astronaut.reggie.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
