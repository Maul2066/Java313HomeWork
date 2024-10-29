package org.spring.mvc.User.controller;

import jakarta.servlet.http.HttpSession;
import org.spring.mvc.User.entity.User;
import org.spring.mvc.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping("/home")
    public String home(HttpSession session){
        List<User> UserList = UserService.findAll();
        session.setAttribute("UserList", UserList);
        return "home";
    }

    @RequestMapping("/new")
    public String showEmployee(Map<String, Object> model){
        User user = new User();
        model.put("user", user);
        return "new_user";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("user") User user, HttpSession session){
        UserService.save(user);
        session.setAttribute("msg", "Сотрудник добавлен успешно");
        return "redirect:/home";
    }

    @RequestMapping("/edit/{id}")
    public String showUser(@PathVariable("id") int id, Model m){
        User user = UserService.getUserById(id);
        m.addAttribute("editUser", user);
        return "edit_user";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("user") User user, @RequestParam("id") long id, HttpSession session){
        UserService.update(user, id);
        session.setAttribute("msg", "Сотрудник обновлен успешно");
        return "redirect:/home";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, HttpSession session){
        UserService.deleteUserById(id);
        session.setAttribute("msg", "Сотрудник удален успешно");
        return "redirect:/home";
    }
}
