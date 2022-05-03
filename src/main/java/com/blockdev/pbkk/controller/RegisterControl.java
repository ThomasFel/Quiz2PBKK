package com.blockdev.pbkk.controller;

import com.blockdev.pbkk.model.Customers;
import com.blockdev.pbkk.model.Users;
import com.blockdev.pbkk.service.CustomersService;
import com.blockdev.pbkk.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("register")
public class RegisterControl {

    private UsersService userService;

    @Autowired
    public void setUserService(UsersService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showRegistrationForm(Model model) {

        model.addAttribute("user", new Users());
        return "register";

    }

    @PostMapping("/save")
    public String processRegister(Users user) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userService.save(user);
        return "redirect:/login";

    }

}
