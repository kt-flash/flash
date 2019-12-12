package com.flash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiLiang
 * @Date: 2019/11/19 15:58
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
