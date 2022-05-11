package com.blockdev.pbkk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "static/index";
    }

    @GetMapping("/profile")
    public String profile() {
        return "static/profile";
    }

    @GetMapping("/company")
    public String company() {
        return "static/company";
    }

    @GetMapping("/service")
    public String service() {
        return "static/service";
    }

    @GetMapping("/collaboration")
    public String collaboration() {
        return "static/collaboration";
    }
}