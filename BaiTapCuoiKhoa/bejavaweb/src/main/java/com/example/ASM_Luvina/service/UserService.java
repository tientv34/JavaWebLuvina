package com.example.ASM_Luvina.service;

import com.example.ASM_Luvina.entity.User;
import com.example.ASM_Luvina.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> listAll() {
        return userRepo.findAll();
    }

    @Override
    public User add(User user) {
        return userRepo.save(user);
    }

    @Override
    public User update(User user, int id) {
        User user1 = userRepo.findById(id).get();
        if(user1 != null){
            user1.setName(user.getName());
            user1.setPhone(user.getPhone());
            user1.setGender(user.getGender());
            return userRepo.save(user1);
        }
        return null;
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
