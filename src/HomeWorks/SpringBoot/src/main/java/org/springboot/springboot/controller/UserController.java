package org.springboot.springboot.controller;


import org.springboot.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/home")
    public String users(Model model) {
        User user = new User("name01", "email01@gmail.com", "Nshw1h12h712MBydg27h", "humanoid");
        User user1 = new User("name02","email02@gmail.com","Jnn762t1hYgdb2yIj28yd2h", "humanoid");
        User colonel = new User("name03", "email03@gmail.com", "kJJ183hen2gdbwqNhd2h", "Very Important Person");
        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        users.add(colonel);
        model.addAttribute("users", users);
        return "home";
    }

    @GetMapping("/IF_Q")
    public String ifUnless(Model model) {
        User user = new User("name01", "email01@gmail.com", "Nshw1h12h712MBydg27h", "humanoid");
        User user1 = new User("name02","email02@gmail.com","Jnn762t1hYgdb2yIj28yd2h", "humanoid");
        User colonel = new User("name03", "email03@gmail.com", "kJJ183hen2gdbwqNhd2h", "Very Important Person");
        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        users.add(colonel);
        model.addAttribute("users", users);
        return "IF_Q";
    }

    @GetMapping("/update")
    public String switchCase(Model model) {
        User user = new User("name01", "email01@gmail.com", "Nshw1h12h712MBydg27h", "Admin");

        model.addAttribute("user", user);
        return "update";
    }
}