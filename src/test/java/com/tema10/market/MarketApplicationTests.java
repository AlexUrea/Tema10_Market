package com.tema10.market;

import com.tema10.market.model.Products;
import com.tema10.market.repository.UsersRepository;
import com.tema10.market.service.UsersService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MarketApplicationTests {

    @Autowired
    private UsersService usersService;

    @Autowired
    UsersRepository usersRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreateUser(){
        usersService.addUsers("test");
        Assertions.assertEquals("test", usersRepository.getById(1).getName());
    }

    @Test
    void testAddToCart(){
        usersService.addToCart(1, new Products("Cola"));
        Assertions.assertEquals("Cola", usersRepository.getById(1).cart.getProducts());
    }

}
