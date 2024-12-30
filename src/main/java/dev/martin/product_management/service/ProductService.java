package dev.martin.product_management.service;

import dev.martin.product_management.entity.Product;

import java.util.List;

public interface ProductService {

    Product save (Product product);
    List<Product> findAll ();
}
