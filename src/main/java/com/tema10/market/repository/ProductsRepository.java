package com.tema10.market.repository;

import com.tema10.market.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer> {
    public Products getById(Integer id);
}
