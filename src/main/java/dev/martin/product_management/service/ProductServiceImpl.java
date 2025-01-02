package dev.martin.product_management.service;

import dev.martin.product_management.dto.ProductDTO;
import dev.martin.product_management.entity.Product;
import dev.martin.product_management.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    // Dependency Injection
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Non-Stream Method
    @Override
    public ProductDTO save(ProductDTO productDTO) {

        // 1. Convert DTO to an entity
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(productDTO.getCategory());

        // 2. Only at this time, it is saved in the database.
        Product productDB = productRepository.save(product);

        // 3. The entity created is transformed into a dto
        ProductDTO productDTOResponse = new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory()
        );
        // 4. return DTO
        return productDTOResponse;
    }

    // Non-Stream Method
    @Override
    public List<ProductDTO> findAll() {

        // List for saving ProductDTOS
        List<ProductDTO> productDTOS = new ArrayList<>();

        // Retrieves all entities from database
        List<Product> productList = productRepository.findAll();

        // Transform each product into a DTO
        for (Product product : productList){
            productDTOS.add(new ProductDTO(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getCategory())
            );
        }

        return productDTOS;
    }

    // Non-Stream Method
    @Override
    public Optional<ProductDTO> findById(Long id) {

        // Search for the product in the database
        Optional<Product> optionalProduct = productRepository.findById(id);

        // Check if it exists and transform into DTO
        if (optionalProduct.isPresent()){

            Product product = optionalProduct.get();

            ProductDTO productDTO = new ProductDTO(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getCategory()
                    );

            return Optional.of(productDTO);
        }

        // If it does not exist, return an Empty Optional
        return Optional.empty();
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
