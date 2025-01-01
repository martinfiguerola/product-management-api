package dev.martin.product_management.service;

import dev.martin.product_management.entity.Product;
import dev.martin.product_management.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    // Dependency Injection
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Optional<Product> update(Long id, Product product) {
        // If found, updates and returns object already created
        // If not found, Optional.empty() is returned
        return productRepository.findById(id)
                .map(productExist -> {
                    productExist.setName(product.getName());
                    productExist.setDescription(product.getDescription());
                    productExist.setCategory(product.getCategory());
                    productExist.setPrice(product.getPrice());
                    return productExist;
                });
    }

    @Override
    public Boolean delete(Long id) {
        return productRepository.findById(id)
                .map(productExist -> {
                    productRepository.delete(productExist);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByNameContaining(name);
    }

}
