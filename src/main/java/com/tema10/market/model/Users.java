package com.tema10.market.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer ordersCount = 0;

    private String name;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Cart cart;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Wishlist wishlist;

    public Users() {
    }

    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}

