package com.tema10.market.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wishlist {
    @Id
    @Column(name = "userId")
    private Integer userId;
    private Integer wishlistId;
    private Integer quantity;

    @OneToMany(mappedBy = "wishlist")
    private List<Products> products;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private Users user;

    public Wishlist() {
    }


}
