package com.ehsy.personaltaxcalculator.controller;

import com.ehsy.personaltaxcalculator.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    TestMapper testMapper;

    @RequestMapping("/test")
    public Map<String, Object> test(){
        Map<String, Object> result = new HashMap<>();
        result.put("test","test");
        testMapper.test();
        return result;
    }
}
