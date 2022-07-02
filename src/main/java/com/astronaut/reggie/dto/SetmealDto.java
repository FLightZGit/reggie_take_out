package com.astronaut.reggie.dto;

import com.astronaut.reggie.entity.Setmeal;
import com.astronaut.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
