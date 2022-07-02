package com.astronaut.reggie.service.impl;

import com.astronaut.reggie.entity.DishFlavor;
import com.astronaut.reggie.mapper.DishFlavorMapper;
import com.astronaut.reggie.service.DishFlavorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
