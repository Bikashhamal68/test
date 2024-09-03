package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot.Dao.CrudClass;
import com.springboot.Dao.User;
import com.springboot.service.SignupServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ControllerClass {

    @Autowired
    private SignupServiceImp service;

    @GetMapping("/signup")
    public String showSignupForm() {
        return "signup";
    }
    @GetMapping("/signups")
    public String showSignups() {
        return "redirect:/users";
    }

    @PostMapping("/signupss")
    public String signup(@ModelAttribute UserDto user, Model model) {
        service.save(user);
        model.addAttribute("message", "User registered successfully!");
        return "redirect:/users";
    }


    @GetMapping("/users")
    public String getAllUsers(Model model) {
        List<UserDto> users = service.getAllUsers();
        model.addAttribute("bikash", users);
        return "signups";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam int id) {
        service.delete(id);
        return "redirect:/users";
    }

    @GetMapping("/editImage")
    public String showEditImageForm(@RequestParam int id, Model model) {
        UserDto user =service.findById(id);
        model.addAttribute("user", user);
        return "updateImage";
    }

    @PostMapping("/updateImage")
    public String updateImage(@RequestParam int id, @RequestParam String url) {
        service.modify(id, url);
        return "redirect:/users";
    }
}
