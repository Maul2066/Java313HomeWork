package org.springsecurity.projectjd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springsecurity.projectjd.config.CustomUser;
import org.springsecurity.projectjd.entity.Comm;
import org.springsecurity.projectjd.entity.User;
import org.springsecurity.projectjd.entity.UserComm;
import org.springsecurity.projectjd.repository.EmpRepo;
import org.springsecurity.projectjd.service.CommentService;
import org.springsecurity.projectjd.service.IUserService;
import org.springsecurity.projectjd.service.UserCommService;

import java.util.Collections;
import java.util.List;


@Controller
public class HomeController {
    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private UserCommService userCommService;

    @Autowired
    private IUserService userService;

    @Autowired
    private CommentService commentService;


    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }


    @GetMapping("/login")
    public String login(@RequestParam(value = "logout", required = false) String logout, Model model) {
        return "login";
    }


    @GetMapping("/home")
    public String home(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();

        model.addAttribute("name", customUser.getNickname());
        model.addAttribute("nickname", customUser.getName());

        return "home";
    }


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/User/comments")
    public String comments(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();

        model.addAttribute("nickname", customUser.getNickname());
        model.addAttribute("name", customUser.getName());
        model.addAttribute("email", customUser.getEmail());
        return "User/comments";
    }


    @GetMapping("/User/Other_Comments")
    public String comments1(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUser customUser = (CustomUser) authentication.getPrincipal();


        List<Comm> comments = commentService.getAllComments();Collections.reverse(comments);
        model.addAttribute("comments", comments);
        return "User/Other_Comments";
    }

    @GetMapping("/Report/ReportPAGE")
    public String report(){
        return "Report/ReportPAGE";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/Transformers/TF")
    public String TF(){
        return "Transformers/TF";
    }


    @GetMapping("/Cars/Cars")
    public String CARS(){
        return "Cars/Cars";
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

    @PostMapping("/User/comments")
    public String registerComm(@ModelAttribute UserComm userComm) {
        userCommService.saveComment(userComm);
        return "redirect:/User/Other_Comments";
    }
}