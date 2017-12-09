package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : 贾亮
 * @Description:
 * @date: 2017/7/20 ${time}
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String getLogin(){
        return "menu";
    }

}
