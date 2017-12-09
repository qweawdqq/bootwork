package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/29.
 */
@Controller
public class LoginController {

/**
 * @Description:登录页面
 * @return:  java.lang.String
 * @author : 贾亮
 * @date : 2017/6/29 15:25
 */
    @RequestMapping("/hehe")
    public String getLogin(){
        return "menu";

    }
}
