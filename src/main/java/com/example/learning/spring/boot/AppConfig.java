package com.example.learning.spring.boot;

import com.example.learning.spring.boot.Controller.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class AppConfig {
    @Bean
    public UserController createUserBean(){
        return new UserController("defaultBean", "default@gmail.com");
    }
}
