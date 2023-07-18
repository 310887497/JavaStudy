package com.example.controller;

import com.example.entity.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    //直接访问http://localhost:8080/index即可，不用加web应用程序名称了
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/student")
    @ResponseBody
    public UserData student(){
        UserData userData = new UserData();
        userData.setUsername("小明");
        userData.setPassword("123456");
        userData.setRole("user");
        return userData;
    }

}

