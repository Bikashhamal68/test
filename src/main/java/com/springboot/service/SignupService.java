package com.springboot.service;

import java.util.List;

import com.springboot.controller.UserDto;

public interface SignupService {
    void save(UserDto user);
    List<UserDto> getAllUsers();
    void delete(int id);
    UserDto findById(int id);
    void modify(int id, String url);
    UserDto check(String email, String pwd);
	void update(UserDto userdto);
}
