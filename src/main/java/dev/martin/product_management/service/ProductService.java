package dev.martin.product_management.service;

import dev.martin.product_management.dto.ProductDTO;
import dev.martin.product_management.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductDTO save (ProductDTO productDTO);
    List<ProductDTO> findAll ();
    Optional<ProductDTO> findById (Long id);
    Optional<Product> update (Long id, Product product);
    Boolean delete (Long id);
    List<Product> findByName (String name);
}
