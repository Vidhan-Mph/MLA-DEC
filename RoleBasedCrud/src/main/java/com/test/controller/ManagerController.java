package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
@PreAuthorize("hasAnyRole('MANAGER','ADMIN')")
public class ManagerController {

    @GetMapping
    public String managerHome() {
        return "manager/manager-home";
    }
}
