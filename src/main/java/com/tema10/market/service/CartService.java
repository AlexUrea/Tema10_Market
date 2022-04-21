package com.tema10.market.service;

import com.tema10.market.model.Cart;
import com.tema10.market.model.Products;
import com.tema10.market.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public Cart getCartByUserId(Integer id){
        return cartRepository.getById(id);
    }

    public void addCart(Cart cart){
        cartRepository.save(cart);
    }

    public Cart printProducts(Integer id){
        cartRepository.getById(id).setOrdersCount(); //Increases orders count by 1;
        return cartRepository.getAllProductsById(id);
    }

    public Integer totalOrdersById(Integer id){
       return cartRepository.getById(id).getOrdersCount();
    }

}
