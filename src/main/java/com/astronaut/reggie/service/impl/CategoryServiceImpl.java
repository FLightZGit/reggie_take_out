package com.astronaut.reggie.service.impl;

import com.astronaut.reggie.common.CustomException;
import com.astronaut.reggie.entity.Category;
import com.astronaut.reggie.entity.Dish;
import com.astronaut.reggie.entity.Setmeal;
import com.astronaut.reggie.mapper.CategoryMapper;
import com.astronaut.reggie.service.CategoryService;
import com.astronaut.reggie.service.DishService;
import com.astronaut.reggie.service.SetmealService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setMealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper =new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper);
        if (count1>0){
            throw new CustomException("Dish has this category cant be deleted");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper =new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = dishService.count(dishLambdaQueryWrapper);
        if (count2>0){
            throw new CustomException("SetMeal has this category cant be deleted");
        }

        super.removeById(id);
    }
}
