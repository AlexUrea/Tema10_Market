package com.tema10.market.controller;

import com.tema10.market.model.Cart;
import com.tema10.market.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static java.util.Arrays.stream;

@RestController
@RequestMapping("cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/order/userId")
    public Cart makeAnOrder(@RequestBody Integer id){
        return cartService.printProducts(id);
    }

    @GetMapping("/totalOrders/userId/{id}")
    public Integer totalOrders(@PathVariable Integer id){
        return cartService.totalOrdersById(id);
    }

    @GetMapping("/allCarts/sorted")
    public Cart getALlCartsSortedByProducts(){
        return cartService.getAllCarts().stream().sorted().get();
    }
}
