package com.matt.hellooworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/add")
    public String index(){
        return "helloworld";
    }
}

// localhost:8080/