package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@PreAuthorize("hasAnyRole('USER','MANAGER','ADMIN')")
public class UserController {

    @GetMapping
    public String userHome() {
        return "user/user-home";
    }
}