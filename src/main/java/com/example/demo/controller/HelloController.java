package com.example.demo.controller;


import com.example.demo.entity.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
@RestController
public class HelloController {
//    @RequestMapping("/hello")
//    public String index() {
//        return "hello worldsadsdggdsgdfgdfgdgf";
//    }
////    @RequestMapping(value = {"/","/hellox"})
////    public String indexy() {
////        return "login";
////    }
//
//    @RequestMapping("/jsontest")
//    public String getindex(Model model) {
//        Person single = new Person("aaaa", 1111);
//        List<Person> people = new ArrayList<Person>();
//        Person p1 = new Person("xx", 1333);
//        p1.setCreateDate(new Date());
//        Person p2 = new Person("yy", 122);
//        p2.setCreateDate(new Date());
//        Person p3 = new Person("zz", 35676);
//        p3.setCreateDate(new Date());
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//        model.addAttribute("singlePerson",single);
//        model.addAttribute("people",people);
//
//        return "index";
//    }
}
