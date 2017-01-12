package com.ables.btc.service;

import java.util.List;

import com.ables.btc.model.User;

public interface UserService {

    User findById(int id);
    
    User findByUsername(String sso);
     
    void save(User user);
     
    void deleteByUsername(String username);
     
    List<User> findAllUsers();
}
