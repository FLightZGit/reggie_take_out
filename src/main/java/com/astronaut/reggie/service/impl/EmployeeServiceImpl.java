package com.astronaut.reggie.service.impl;

import com.astronaut.reggie.entity.Employee;
import com.astronaut.reggie.mapper.EmployeeMapper;
import com.astronaut.reggie.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
