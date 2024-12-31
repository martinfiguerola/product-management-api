package dev.martin.product_management.service;

import dev.martin.product_management.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product save (Product product);
    List<Product> findAll ();
    Optional<Product> findById (Long id);
    Optional<Product> update (Long id, Product product);
    Boolean delete (Long id);
}
