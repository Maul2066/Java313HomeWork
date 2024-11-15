package org.springsecurity.projectjd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springsecurity.projectjd.entity.User;
import org.springsecurity.projectjd.service.IUserService;


@Controller
public class HomeController {

    @Autowired
    private IUserService userService;


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/register")
    public String register() {
        return "register";
    }



    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        User user1 = userService.saveUser(user);
        return "redirect:/login";
    }
}