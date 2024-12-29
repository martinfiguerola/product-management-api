# Products Management API 

## Objective
Create a RESTful API for product management in a basic online store. The application will be used to implement the topics I am learning:  **DTOs (Data Transfer Objects)** to transfer data between backend layers. **Validations** because it supports several mechanisms for validation, including annotations, custom validator annotations, error handling and group validation. Data will be persisted in a **MySQL** database without relationships.
I will try to apply best practices with **ResponseEntity** responses and **Optional** handling.

---

## Requirements

### Product Model
- `ID`: Unique identifier (Long, auto-incremented).
- `Name`: Product name (String).
- `Description`: Brief description of the product (String).
- `Price`: Product price (BigDecimal).
- `Category`: Product category (String).

### CRUD Operations (Create, Read, Update, Delete)
- Create a product.
- Retrieve all products or a specific product by ID.
- Retrieve a specific product by name.
- Update a product.
- Delete a product.


### API Endpoints
- `GET /products`: Retrieve all products.
- `GET /products/{id}`: Retrieve a specific product by ID.
- `GET /products/{productName}`: Retrieve a specific product by ID.
- `POST /products`: Create a new product.
- `PUT /products/{id}`: Update an existing product.
- `DELETE /products/{id}`: Delete a product.

### MySQL Database
- Use **MySQL** to persist product data.
- Configure the connection to MySQL using Spring Data JPA.
- Create a `products` table with the following fields:
    - `id`
    - `name`
    - `description`
    - `price`
    - `category`

---

## Implemented Technologies / Themes
- **Spring Boot**: To create the REST API.
- **Spring Data JPA**: To simplify interaction with the MySQL database.
- **DTOs**: To separate the presentation layer from the data layer.
- **Valid**: To validation
- **MySQL**: To store product data.



