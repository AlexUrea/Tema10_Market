package com.tema10.market.model;

import javax.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue
    private Integer productId;
    private Integer quantity;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "cartId", nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "wishlistId", nullable = false)
    private Wishlist wishlist;

    public Products() {
    }
}
