package com.tema10.market.repository;

import com.tema10.market.model.Wishlist;
import org.springframework.data.repository.CrudRepository;

public interface WishlistRepository extends CrudRepository<Wishlist, Integer> {
    public Wishlist getById(Integer id);
}
