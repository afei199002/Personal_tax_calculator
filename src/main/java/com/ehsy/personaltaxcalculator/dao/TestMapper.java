package com.ehsy.personaltaxcalculator.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TestMapper {
    Object test();
}
