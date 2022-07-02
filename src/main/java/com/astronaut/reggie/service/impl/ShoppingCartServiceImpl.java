package com.astronaut.reggie.service.impl;

import com.astronaut.reggie.entity.ShoppingCart;
import com.astronaut.reggie.mapper.ShoppingCartMapper;
import com.astronaut.reggie.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>implements ShoppingCartService {
}
