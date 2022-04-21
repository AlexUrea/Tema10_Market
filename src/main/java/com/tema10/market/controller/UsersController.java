package com.tema10.market.controller;

import com.tema10.market.model.Products;
import com.tema10.market.model.Users;
import com.tema10.market.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/addUser")
    boolean addUser(@RequestBody String name) {
        usersService.addUsers(name);
        return true;
    }

    @GetMapping("/id/{id}")
    public Users getUser(@PathVariable Integer id){
        return usersService.getUserById(id);
    }

    @PostMapping("/removeUser")
    boolean removeUser(@RequestBody Integer id){
        usersService.removeUserById(id);
        return true;
    }

    @GetMapping("/allUsers")
    public Users getAllUsers(){
        return usersService.getAllUsers();
    }

    @PostMapping("/addToCart")
    boolean addToCart(@RequestBody Integer id, @RequestBody Products product){
        usersService.addToCart(id, product);
        return true;
    }

    @PostMapping("/removeFromCart")
    boolean removeFromCart(@RequestBody Integer id, @RequestBody Products product){
        usersService.removeFromCart(id, product);
        return true;
    }
}

