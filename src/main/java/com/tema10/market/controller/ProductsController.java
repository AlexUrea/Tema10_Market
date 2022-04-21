package com.tema10.market.controller;

import com.tema10.market.model.Products;
import com.tema10.market.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("/id/{id}")
    public Products getById(@PathVariable Integer id){
        return productsService.getProductById(id);
    }
}
