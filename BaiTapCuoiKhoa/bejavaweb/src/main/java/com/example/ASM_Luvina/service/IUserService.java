package com.example.ASM_Luvina.service;

import com.example.ASM_Luvina.entity.User;

import java.util.List;

public interface IUserService{
    List<User> listAll();
    User add(User user);
    User update(User user, int id);
    User findById(int id);
    void delete(int id);
}
