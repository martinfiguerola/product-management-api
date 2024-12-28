# Products Management API with DTOs and MySQL

## Objective
Create a RESTful API for managing products in a basic online store. The application will use **DTOs (Data Transfer Objects)** to transfer data between backend layers. No validations or relationships between entities are required, and data will be persisted in a **MySQL** database.

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
- Update a product.
- Delete a product.


### API Endpoints
- `GET /products`: Retrieve all products.
- `GET /products/{id}`: Retrieve a specific product by ID.
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

## Recommended Technologies
- **Spring Boot**: To create the REST API.
- **Spring Data JPA**: To simplify interaction with the MySQL database.
- **DTOs**: To separate the presentation layer from the data layer.
- **MySQL**: To store product data.



