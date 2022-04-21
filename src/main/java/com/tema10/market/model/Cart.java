package com.tema10.market.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {
    @Id
    @Column(name = "userId")
    private Integer userId;
    private Integer quantity;
    private Integer ordersCount = 0;

    @OneToMany(mappedBy = "cart")
    private List<Products> products;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private Users user;

    public void addProduct(Products product){
        this.products.add(product);
    }

    public void removeProduct(Products product){
        this.products.remove(product);
    }

    public Cart() {
    }

    public void setOrdersCount(){
        this.ordersCount++;
    }

    public Integer getOrdersCount(){
        return this.ordersCount;
    }


}
