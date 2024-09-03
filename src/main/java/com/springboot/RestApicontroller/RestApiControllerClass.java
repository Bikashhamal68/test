package com.springboot.RestApicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot.controller.UserDto;
import com.springboot.service.SignupServiceImp;

import java.util.List;

@RestController
@RequestMapping("/v2")
public class RestApiControllerClass {

    @Autowired
    private SignupServiceImp service;

    private Messageresponse createMessage(String message) {
    	Messageresponse msg=new Messageresponse();
        msg.setCode(1);
        msg.setMessage(message);
        return msg;
    }

    //bikash
    @PostMapping("/signups")
    @ResponseStatus(HttpStatus.CREATED)

    public Messageresponse signup(@RequestBody UserDto user) {
        service.save(user);
        return createMessage("You have signed up successfully saved");
    }
    
    @PutMapping("/signups")
    @ResponseStatus(HttpStatus.OK)

    public Messageresponse update(@RequestBody UserDto user) {
        service.update(user);
        return createMessage("You have updated data successfully");
    }



    @GetMapping("/signups")
    public List<UserDto> getAllUsers() {
        List<UserDto> users = service.getAllUsers();
        return users;
    }

    @DeleteMapping("/signups/{id}")
    public Messageresponse deleteUser(@PathVariable int id) {
        service.delete(id);
        return createMessage("Hey the info of particular id has been deleted");
    }

    @GetMapping("/signups/{id}")
    public UserDto showEditImageForm(@PathVariable int id) {
        UserDto user =service.findById(id);
        return user;
    }

    @PatchMapping("/signups/image")
    @ResponseStatus(HttpStatus.OK)
    public  Messageresponse updateImage(@RequestParam int id, @RequestParam String url) {
        service.modify(id, url);
        return createMessage("Hey image has been updated");
    }
}
