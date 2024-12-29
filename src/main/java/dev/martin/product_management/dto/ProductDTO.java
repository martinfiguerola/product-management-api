package dev.martin.product_management.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDTO {
    /**
     * Unique identifier of the product.
     * This field should only be sent in read (GET) and update (PUT or PATCH) responses.
     * It should not be necessary when creating a new product (POST).
     */
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String category;

    // Constructors
    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    // toString method (optional for debug)
    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
