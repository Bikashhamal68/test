package com.springboot.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.Dao.CrudClass;
import com.springboot.Dao.User;
import com.springboot.controller.UserDto;
import com.springboot.service.SignupServiceImp;

@Controller
public class LoginController {

	@Autowired
	private SignupServiceImp service;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/logins")
    public String login(@RequestParam String email, @RequestParam String pwd, Model model) {
        UserDto users = service.check(email, pwd);
        if (users==null) {
            model.addAttribute("error", "Invalid email or password!");
            return "login";
        } else {
            return "redirect:/users";
        }
    }
	
	
}
