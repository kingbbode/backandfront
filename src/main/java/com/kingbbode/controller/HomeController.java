package com.kingbbode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by YG-MAC on 2017. 4. 9..
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }
}
