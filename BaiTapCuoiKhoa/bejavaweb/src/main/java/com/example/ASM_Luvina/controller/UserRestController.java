package com.example.ASM_Luvina.controller;

import com.example.ASM_Luvina.entity.User;
import com.example.ASM_Luvina.repository.UserRepo;
import com.example.ASM_Luvina.service.IUserService;
import com.example.ASM_Luvina.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserRestController {
    @Autowired
    IUserService userService;
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.listAll();
    }
    @PostMapping("/add")
    public User add(@RequestBody User user){
        return userService.add(user);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")Integer id){
        userService.delete(id);
    }
    @GetMapping("/getById/{id}")
    public User getById(@PathVariable("id")Integer id){
        return userService.findById(id);
    }
    @PutMapping("/update/{id}")
    public User update(@PathVariable("id") int id,@RequestBody User user){
        if(userService.update(user,id) != null){
            return userService.update(user,id);
        }else {
            throw new IllegalStateException("Cập nhập thất bại");
        }
    }
}
