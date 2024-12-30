# Products Management API

## 🎯 Objective

This project is a RESTful API for managing products in a basic online store. It serves as a learning tool to practice key Spring Boot concepts and best practices. The API includes functionality to perform CRUD (Create, Read, Update, Delete) operations on products and focuses on the following areas of development:

- **DTOs (Data Transfer Objects):** Used to transfer data between backend layers to ensure clean architecture.
- **Validation:** Includes mechanisms for validating input data using annotations, custom validators, error handling, and group validation.
- **ResponseEntity:** Utilized for standardized HTTP responses.
- **Optional Handling:** Applied for safer null management.
- **MySQL Integration:** Data persistence without relationships, stored in a simple `products` table.

## 🚀 Features

### Product Model
Each product has the following attributes:

- **ID:** Unique identifier (Long, auto-incremented).
- **Name:** Product name (String).
- **Description:** Brief description of the product (String).
- **Price:** Product price (BigDecimal).
- **Category:** Product category (String).

### CRUD Operations

- **Create a product:** Add a new product to the database.
- **Retrieve all products:** Fetch all products in the database.
- **Retrieve a specific product:** Get details of a product by its ID and name.
- **Update a product:** Modify details of an existing product.
- **Delete a product:** Remove a product from the database.

### API Endpoints

| HTTP Method | Endpoint              | Description                              |
|-------------|-----------------------|------------------------------------------|
| GET         | `/products`          | Retrieve all products.                   |
| GET         | `/products/{id}`     | Retrieve a specific product by ID.       |
| GET         | `/products/{name}`   | Retrieve a specific product by name.     |
| POST        | `/products`          | Create a new product.                    |
| PUT         | `/products/{id}`     | Update an existing product by ID.        |
| DELETE      | `/products/{id}`     | Delete a product by ID.                  |

## 💾 Database Schema

The product data is stored in a MySQL database with the following table structure:

| Field       | Type        | Description                             |
|-------------|-------------|-----------------------------------------|
| `id`        | BIGINT      | Unique identifier, auto-incremented.    |
| `name`      | VARCHAR(255)| Name of the product.                   |
| `description`| TEXT        | Description of the product.            |
| `price`     | DECIMAL(10,2)| Price of the product.                  |
| `category`  | VARCHAR(255)| Category of the product.               |

## 🛠️ Technology Stack

- **Spring Boot:** For creating and managing the RESTful API.
- **Spring Data JPA:** Simplifies interaction with the MySQL database.
- **MySQL:** Used for data storage.
- **DTOs:** Ensures separation between presentation and data layers.
- **Validation:** For data integrity checks.
- **ResponseEntity and Optional:** To implement best practices in API design.

## 📊 Purpose of the API

This API is designed as a practice project to strengthen understanding of core Spring Boot concepts, database interactions, and API development. It serves as a demonstration of:

1. **Good coding practices** in backend development.
2. **Proper separation of concerns** through DTOs and validation layers.
3. **Efficient database interactions** using Spring Data JPA.
4. **Building robust APIs** with standardized responses and error handling.

## 🌱 Getting Started

1. Clone the repository.
2. Set up a MySQL database and configure the connection in `application.properties`.
3. Run the Spring Boot application.
4. Use a tool like Postman to interact with the API endpoints.

## 🤝 Contributing

Feel free to fork this repository and propose improvements, or use it as inspiration for your own practice projects.

