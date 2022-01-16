package com.shajar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringRestApp {

    public static void main(String[] arg){
        SpringApplication.run(SpringRestApp.class);
    }
    @RestController
    class TestController{
        @GetMapping("api")
        public String getTest() {
            return "Welcome Home Spring";
        }
    }
}
