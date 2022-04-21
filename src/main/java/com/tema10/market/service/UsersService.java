package com.tema10.market.service;

import com.tema10.market.model.Products;
import com.tema10.market.model.Users;
import com.tema10.market.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public Users getUserById(Integer id){
        return usersRepository.getById(id);
    }

    public void addUsers(String name){
        usersRepository.save(new Users(name));
    }

    public Users getAllUsers(){
        return usersRepository.getAll();
    }

    public void removeUserById(Integer id){
        usersRepository.removeUsersById(id);
    }

    public void addToCart(Integer id, Products product){
        usersRepository.getById(id).cart.addProduct(product);
    }

    public void removeFromCart(Integer id, Products product){
        usersRepository.getById(id).cart.removeProduct(product);
    }
}
