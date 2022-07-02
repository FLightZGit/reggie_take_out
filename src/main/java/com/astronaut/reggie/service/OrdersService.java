package com.astronaut.reggie.service;

import com.astronaut.reggie.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

public interface OrdersService extends IService<Orders> {
    public void submit(Orders orders);
}
