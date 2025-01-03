package dev.martin.product_management.dto;

import dev.martin.product_management.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDTOMapper {

    // Convert Entity to DTO
    public ProductDTO toDTO (Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory()
        );
    }

    // Convert DTO to Entity
    public Product toEntity (ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(productDTO.getCategory());

        return product;
    }

}
