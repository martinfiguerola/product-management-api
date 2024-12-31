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

    // Build Get Product REST API
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById (@PathVariable Long id) {
       return productService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Build Update Product REST API
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct (@PathVariable Long id, @RequestBody Product product) {
         return productService.update(id, product)
                 .map( productUpdated ->  new ResponseEntity<>(productUpdated, HttpStatus.CREATED))
                 .orElse(ResponseEntity.notFound().build());
    }

    // Build Delete Product REST API
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct (@PathVariable Long id) {
        if (productService.delete(id)) return ResponseEntity.ok("Product removed successfully");
        return ResponseEntity.notFound().build();
    }


}
