package com.springboot.Dao;

import java.util.List;

public interface SignupDao {
    void save(User user);
    List<User> getAllUsers();
    void delete(int id);
    User findById(int id);
    void modify(int id, String url);
    User check(String email, String pwd);
}
