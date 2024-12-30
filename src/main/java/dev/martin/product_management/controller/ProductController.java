package dev.martin.product_management.controller;

import dev.martin.product_management.entity.Product;
import dev.martin.product_management.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController{

    // Dependency Injection
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Build Add Product REST API
    @PostMapping
    public ResponseEntity<Product> createProduct (@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    // Build Get All Product REST API
    @GetMapping
    public ResponseEntity<List<Product>> getAll () {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

}
