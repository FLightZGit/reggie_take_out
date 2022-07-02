package com.astronaut.reggie.service.impl;

import com.astronaut.reggie.entity.OrderDetail;
import com.astronaut.reggie.mapper.OrderDetailMapper;
import com.astronaut.reggie.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>implements OrderDetailService {
}
