# ☕ Spring Boot Student API — Enterprise Java Backend

A high-performance Java backend built on **Spring Boot 3** and **Spring Security 6**. This project implements a strictly decoupled layered architecture, utilizing JWT for stateless authentication and Spring Data JPA for optimized relational persistence.

[![Live Demo](https://img.shields.io/badge/Live%20Demo-springboot--student--api.railway.app-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://springboot-student-api-production-32eb.up.railway.app)
[![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)](https://oracle.com/java)
[![Spring](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://mysql.com)

---

## 🏗 System Architecture

The system follows the **N-Tier Layered Architecture** pattern, ensuring absolute separation of concerns and high testability.

```mermaid
graph TD
    Client["🌐 Client (Postman/Frontend)"]
    AuthFilter["🔒 Security Filter Chain (JWT)"]
    Controller["🎮 Controller Layer"]
    Service["⚙️ Service Layer (Business Logic)"]
    Repository["💾 Repository Layer (JPA)"]
    Database[("🗄️ MySQL Database")]

    Client -->|HTTP Request| AuthFilter
    AuthFilter -->|Validated| Controller
    Controller --> Service
    Service --> Repository
    Repository --> Database
```

---

## ✨ Features

- **🔐 Robust Security:** Stateless authentication via JWT (JSON Web Tokens) integrated with Spring Security 6 filter chain.
- **🏛 Layered Design:** strictly enforced separation between `Controller` (Transport), `Service` (Business), and `Repository` (Persistence) layers.
- **🔄 Automated Mapping:** Efficient Entity-to-DTO mapping patterns for secure data exposure.
- **📡 RESTful CRUD:** Comprehensive student data management with standard HTTP semantics.
- **🛡 Input Validation:** Stringent server-side validation using Jakarta Validation API.

---

## 🔌 API Endpoints

### 🔑 Authentication
| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/api/auth/register` | Create new account (Admin/User) |
| `POST` | `/api/auth/login` | Authenticate and receive JWT token |

### 🎓 Student Management
*Requires `Authorization: Bearer <token>`*
| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/students` | Retrieve all student records |
| `GET` | `/api/students/{id}` | Retrieve specific student detail |
| `POST` | `/api/students` | Create a new student entry |
| `PUT` | `/api/students/{id}` | Update existing student record |
| `DELETE` | `/api/students/{id}` | Remove student record |

---

## 🗄 Database Schema

The persistence layer uses **Spring Data JPA** (Hibernate) to manage the following relational structure:

```mermaid
erDiagram
    USERS {
        long id PK
        string username
        string password
        string role
    }
    STUDENTS {
        long id PK
        string nim UK
        string nama
        string email
        string jurusan
    }
```

---

## 🚀 Execution Guide

### Prerequisites
- JDK 17+
- Maven 3.x
- MySQL 8.0

### Local Setup
1. **Clone & Enter:**
   ```bash
   git clone https://github.com/B3rlinSugi/springboot-student-api.git
   cd springboot-student-api
   ```

2. **Database Config:**
   Update `src/main/resources/application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/db_student_management
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. **Run Application:**
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 👨‍💻 Developed By

**Berlin Sugiyanto Hutajulu**

[![GitHub](https://img.shields.io/badge/GitHub-B3rlinSugi-181717?style=flat&logo=github)](https://github.com/B3rlinSugi)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-berlinsugi-0A66C2?style=flat&logo=linkedin)](https://linkedin.com/in/berlinsugi)
[![Portfolio](https://img.shields.io/badge/Portfolio-berlinsugi.vercel.app-4e73df?style=flat&logo=vercel)](https://berlinsugi.vercel.app)

---

## ⚙️ DevOps & Deployment

- **Platform**: [Railway](https://railway.app)
- **CI/CD**: Fully automated deployment triggered by `git push` to `main`.
- **Environment Management**: Dynamic environment variable injection for database credentials.
- **Artifacts**: Uses the Maven wrapper (`./mvnw`) to ensure consistent build environments across different systems.

---
<p align="center">Built with ☕ and Spring Boot · High Performance Java Backend</p>

