package com.tema10.market.controller;

import com.tema10.market.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wishlist")
public class WishlistController {
    @Autowired
    private WishlistService wishlistService;

//    @PostMapping("/new")
//    public boolean newWishlist();  To be continued....
}
