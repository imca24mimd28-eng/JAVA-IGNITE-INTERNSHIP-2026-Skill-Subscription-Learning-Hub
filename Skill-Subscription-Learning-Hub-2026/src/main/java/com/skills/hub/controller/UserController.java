package com.skills.hub.controller;

import com.skills.hub.entity.User;
import com.skills.hub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        service.registerUser(user);
        return "login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        Model model) {

        User user = service.login(email, password);

        if (user != null) {
            model.addAttribute("name", user.getName());
            return "welcome";
        } else {
            model.addAttribute("error", "Invalid Credentials");
            return "login";
        }
    }
}
