package com.example.lap6.controller;


import com.example.lap6.model.Address;
import com.example.lap6.model.User;
import com.example.lap6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/registUser")
    public void registUser() {
        Address address = new Address("Cau Giay", "Ha Noi");

        User user = new User("Nguyen Van An", "09012345678");
        user.setAddress(address);

        this.userService.save(user);
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {
        return this.userService.findById(id);
    }
}
