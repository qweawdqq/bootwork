package com.example.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.example.demo.entity.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@SpringBootApplication
public class AiworkApplication {
    //设置fastjson
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter;
        converter = fastConverter;
        return new HttpMessageConverters(converter);
    }

//首页
    @RequestMapping("/")
    public String index() {
//        Model model
        return "login";
    }
    @RequestMapping("/index")
    public String test(Model model) {
        Person single = new Person("aaaa", 1111);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx", 1333);
        p1.setCreateDate(new Date());
        Person p2 = new Person("yy", 122);
        p2.setCreateDate(new Date());
        Person p3 = new Person("zz", 35676);
        p3.setCreateDate(new Date());
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "index";
    }



    public static void main(String[] args) {
        SpringApplication.run(AiworkApplication.class, args);
    }
}
