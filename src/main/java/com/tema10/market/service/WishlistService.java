package com.tema10.market.service;

import com.tema10.market.model.Products;
import com.tema10.market.model.Wishlist;
import com.tema10.market.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {
    @Autowired
    WishlistRepository wishlistRepository;

    public Wishlist getWishlistByUserId(Integer id){
        return wishlistRepository.getById(id);
    }

    public void addToWishlist(Integer id, Products product){
        wishlistRepository.getById(id).addProduct(product);
    }
}
