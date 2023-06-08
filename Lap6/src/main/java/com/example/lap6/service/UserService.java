package com.example.lap6.service;


import com.example.lap6.model.User;

public interface UserService {
    void save(User user);
    User findById(Long id);
}
