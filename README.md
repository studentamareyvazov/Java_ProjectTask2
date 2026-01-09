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

<img width="1874" height="783" alt="Screenshot 2026-01-08 193459" src="https://github.com/user-attachments/assets/cd489086-506d-483f-9e2e-74cc15940dc2" />
<img width="1792" height="709" alt="Screenshot 2026-01-08 193516" src="https://github.com/user-attachments/assets/58a7ec06-d59e-4767-97c9-84d37426a9a6" />
Creates a new product and saves it to the H2 database with a unique ID.
<img width="1905" height="424" alt="Screenshot 2026-01-08 193545" src="https://github.com/user-attachments/assets/f1c2352d-e951-439d-8e10-6285fcf6520d" />
<img width="1821" height="647" alt="Screenshot 2026-01-08 193553" src="https://github.com/user-attachments/assets/0ddf8915-6fdb-4a99-91b3-f46d699cf9bd" />
<img width="1905" height="698" alt="Screenshot 2026-01-08 193616" src="https://github.com/user-attachments/assets/7c2ada8d-a61f-4f0e-ba15-6c8fec467d86" />
Retrieves product details from the database or returns a 404 error if the ID is not found.
<img width="1852" height="903" alt="image" src="https://github.com/user-attachments/assets/e26e4d5a-f272-4e58-a55e-ea43a078921f" />
<img width="1911" height="720" alt="image" src="https://github.com/user-attachments/assets/5268b5fb-07d5-4a97-9e84-96f00ab643ad" />
Updates the name of an existing product and returns the modified data as shown in the 200 OK response.
<img width="1886" height="707" alt="Screenshot 2026-01-08 193717" src="https://github.com/user-attachments/assets/e9de5f1b-3223-42d7-a8e9-33de3897f7db" />
<img width="1841" height="900" alt="Screenshot 2026-01-08 193739" src="https://github.com/user-attachments/assets/0fbc1ba2-64e1-42bb-a870-585e918d0eab" />
Permanently removes the selected product from the database and returns a 204 No Content status.
<img width="1919" height="915" alt="image" src="https://github.com/user-attachments/assets/a872bd94-df88-40ea-a844-6bd7d88c6332" />
This method retrieves the complete list of all products from the H2 database as a JSON array.
To clone the project: https://github.com/studentamareyvazov/Java_ProjectTask2.git

