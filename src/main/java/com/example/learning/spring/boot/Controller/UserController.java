package com.example.learning.spring.boot.Controller;

import org.springframework.stereotype.Controller;

public class UserController {
    String username;
    String email;

    public UserController(String username, String email) {
        this.username = username;
        this.email = email;
    }


}
