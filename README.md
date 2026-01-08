Java Project - Task 2: Product Management API
This project is a RESTful API built with Spring Boot for managing products. It demonstrates the use of a layered architecture, exception handling, and data persistence with an in-memory database.

Features
Full CRUD Operations: Create, Read, Update, and Delete products.

Layered Architecture: Clear separation between api, service, domain, and repository layers.

DTO Pattern: Uses ProductRequest and ProductResponse to separate API data from Database Entities.

Exception Handling: Global exception advisor to return clean JSON error messages for 404 scenarios.

Auto-Documentation: Integrated Swagger UI for easy API testing.

Technology Stack
Java 17

Spring Boot 3

Spring Data JPA

H2 Database (In-Memory)

Lombok

SpringDoc OpenAPI (Swagger)

How to Run
Clone the repository to your local machine.

Open the project in IntelliJ IDEA.

Wait for Maven to load the dependencies.

Run the JavaProjectTask2Application class.

Access the API documentation at: http://localhost:8080/swagger-ui/index.html.

API Endpoints
POST /api/v1/products: Create a new product.

GET /api/v1/products: Get a list of all products.

GET /api/v1/products/{id}: Get a specific product by its ID.

PUT /api/v1/products/{id}: Update an existing product's name.

DELETE /api/v1/products/{id}: Remove a product from the database.

<img width="1905" height="698" alt="Screenshot 2026-01-08 193616" src="https://github.com/user-attachments/assets/6601f4f3-4e82-4436-938b-f62496e17dfb" />



