package com.tema10.market.service;

import com.tema10.market.model.Products;
import com.tema10.market.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    public Products getProductById(Integer id){
        return productsRepository.getById(id);
    }
}
