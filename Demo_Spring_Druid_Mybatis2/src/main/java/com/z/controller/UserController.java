package com.z.controller;

import com.z.entity.User;
import com.z.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("")
    public String loginUser(){

        return "index";
    }

    @RequestMapping("/login")
    public String loginUser(String userName, String password, Model model){
        String user = userService.getUser(userName, password);
        model.addAttribute("user",user);
        return "index";
    }


}
