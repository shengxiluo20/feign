package com.example.demo.controller;

import com.example.demo.service.FeginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chi  2017-12-21 11:16
 **/
@RestController
public class TestController {

    @Resource
    private FeginService feginService;

    @RequestMapping("test")
    public String test(){
        String test = feginService.test();
        System.out.println(test);
        return test;
    }
}

