package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
@ComponentScan(basePackages = {"com.jk.*"})
public class UserController {
    @Reference
    private UserService userService;
//查看商品分类
    @RequestMapping("querycommclss")
    public @ResponseBody
    void querycommclss(){

    }
}
