# Spring Boot Student API

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Java_17-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Security-JWT-06B6D4?style=for-the-badge&logo=jsonwebtokens&logoColor=white" />
</p>

A production-ready generic REST API mimicking Laravel structure, completely built using Java Spring Boot 3. 
Highlights clean layered architecture: `Controller -> Service -> Repository` with strong Authentication boundaries using JSON Web Tokens (JWT).

## Features
- **Stateless Authentication:** Spring Security 6.x integrated with JJWT.
- **Data Persistence:** Spring Data JPA / Hibernate connected to MySQL.
- **REST CRUD:** Standard full-fledged Student Data interactions.

## Endpoints

### 🔐 Auth
- `POST /api/auth/register` - Create Admin or User.
- `POST /api/auth/login` - Authenticate to receive token.

### 🎓 Students
*(Requires `Authorization: Bearer <token>` in headers)*
- `GET /api/students` - Yields all student records.
- `GET /api/students/{id}` - Yields specific student record.
- `POST /api/students` - Create a new student.
- `PUT /api/students/{id}` - Update student data.
- `DELETE /api/students/{id}` - Delete student data.

## Running Locally

Because this relies on Spring Boot's internal auto-configurations, running it is highly straight forward via the Maven wrapper:

```bash
# Provide environment variables on local shell if replacing Railway
# Example: export DB_HOST=localhost DB_PORT=3306 DB_DATABASE=... DB_USERNAME=... DB_PASSWORD=...

./mvnw spring-boot:run
```

*Architected by Berlin Sugiyanto.*
