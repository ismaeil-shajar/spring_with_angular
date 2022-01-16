package com.shajar.controller;

import com.shajar.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api")
@CrossOrigin
public class HomeController {
    @Autowired
    HomeService homeService;

    @GetMapping("")
    public String getHome(){
        return homeService.getHome();
    }

    @PostMapping("authenticate")
    public Object getToken(@RequestBody(required = false) Map<String,String> login){
        System.out.println("login for user");
        System.out.println(login);
        return homeService.getToken();
    }
}
