package com.tema10.market.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wishlist {
    @Id
    @Column(name = "userId")
    private Integer userId;
    private Integer wishlistId;
    private Integer quantity = 0;

    @OneToMany(mappedBy = "wishlist")
    private List<Products> products;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private Users user;

    public Wishlist() {
    }

    public Wishlist(List<Products> products) {
        this.products = products;
        this.quantity++;
    }

    public void addProduct(Products product){
        this.products.add(product);
    }
}
