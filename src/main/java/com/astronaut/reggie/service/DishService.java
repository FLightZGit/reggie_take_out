package com.astronaut.reggie.service;

import com.astronaut.reggie.dto.DishDto;
import com.astronaut.reggie.entity.Dish;
import com.astronaut.reggie.mapper.DishMapper;
import com.baomidou.mybatisplus.extension.service.IService;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);
}
