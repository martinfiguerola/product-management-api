package dev.martin.product_management.repository;

import dev.martin.product_management.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // SELECT * FROM products WHERE name LIKE '%?1%';
    List<Product> findByNameContaining(String name);

}
