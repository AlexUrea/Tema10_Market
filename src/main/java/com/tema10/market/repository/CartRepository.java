package com.tema10.market.repository;


import com.tema10.market.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    public Cart getById(Integer id);

    public Cart getAllProductsById(Integer id);

    public Cart getAll();


}
