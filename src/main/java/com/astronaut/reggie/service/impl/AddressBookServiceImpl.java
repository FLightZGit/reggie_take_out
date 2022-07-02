package com.astronaut.reggie.service.impl;

import com.astronaut.reggie.entity.AddressBook;
import com.astronaut.reggie.mapper.AddressBookMapper;
import com.astronaut.reggie.service.AddressBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
