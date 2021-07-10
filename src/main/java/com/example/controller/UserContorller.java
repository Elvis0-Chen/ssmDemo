package com.example.controller;

import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserContorller {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/findAll")
    public String fingAll(Model model){

        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        System.out.println(userList);
        return "list";
    }
}
