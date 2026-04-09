<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:1a1a2e,50:16213e,100:0f3460&height=180&section=header&text=Spring%20Boot%20Student%20API&fontSize=40&fontColor=e94560&animation=fadeIn&fontAlignY=38&desc=Enterprise%20Java%20Backend%20%7C%20Spring%20Boot%203%20%7C%20JWT%20%7C%20MySQL&descAlignY=55&descColor=a8b2d8" />

[![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)](https://oracle.com/java)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://mysql.com)
[![JWT](https://img.shields.io/badge/JWT-Auth-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white)](https://jwt.io)
[![Live Demo](https://img.shields.io/badge/Live_Demo-Railway-0B0D0E?style=for-the-badge&logo=railway&logoColor=white)](https://springboot-student-api-production-32eb.up.railway.app)
[![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)](https://github.com/B3rlinSugi/springboot-student-api)

</div>

---

## 📌 Overview

**Spring Boot Student API** adalah backend enterprise-grade yang dibangun menggunakan **Spring Boot 3** dan **Spring Security 6**. Proyek ini menerapkan arsitektur berlapis (N-Tier) yang ketat, menggunakan JWT untuk autentikasi stateless dan Spring Data JPA untuk persistensi relasional yang dioptimalkan.

> 💡 **Fokus Teknis:** Menunjukkan implementasi Spring Security modern, penanganan exception global, dan integrasi database relational dengan standar industri.

### 🏆 Hasil Pengujian & Standar

| Metrik | Status |
|---|---|
| Autentikasi Stateless (JWT) | ✅ **Terverifikasi** |
| Layered Architecture (N-Tier) | ✅ **Strictly Enforced** |
| Response Consistency | ✅ **Unified API Result** |
| Security Filter Chain | ✅ **Customized SC6** |

---

## ✨ Fitur Utama

- **🔐 Robust Security:** Autentikasi stateless via JWT yang terintegrasi penuh dengan filter chain Spring Security 6.
- **🏛️ N-Tier Architecture:** Pemisahan tanggung jawab yang jelas antara `Controller`, `Service`, dan `Repository` layer.
- **🔄 Mapper Pattern:** Implementasi Entity-to-DTO mapping untuk eksposur data yang aman dan terkontrol.
- **📡 RESTful Semantics:** Mendukung operasi CRUD lengkap dengan status code HTTP yang tepat.
- **🛡️ Global Exception Handling:** Penanganan error terpusat menggunakan `@RestControllerAdvice`.

---

## 🏗️ Arsitektur Sistem

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

## 📡 API Endpoints

### 🔑 Authentication
| Method | Endpoint | Deskripsi |
|---|---|---|
| `POST` | `/api/auth/register` | Membuat akun baru (Admin/User) |
| `POST` | `/api/auth/login` | Autentikasi dan menerima token JWT |

### 🎓 Student Management
*Memerlukan `Authorization: Bearer <token>`*
| Method | Endpoint | Deskripsi |
|---|---|---|
| `GET` | `/api/students` | Mengambil semua data mahasiswa |
| `GET` | `/api/students/{id}` | Mengambil detail mahasiswa tertentu |
| `POST` | `/api/students` | Membuat entri mahasiswa baru |
| `PUT` | `/api/students/{id}` | Memperbarui data mahasiswa |
| `DELETE` | `/api/students/{id}` | Menghapus data mahasiswa |

---

## ⚙️ DevOps & Deployment

Proyek ini dikelola dengan standar DevOps modern untuk memastikan reliabilitas dan kemudahan deployment:

- **Platform**: [Railway](https://railway.app)
- **CI/CD**: Deployment otomatis setiap kali ada perubahan pada branch `main`.
- **Environment Management**: Menggunakan `application.properties` yang dinamis untuk injeksi kredensial database di lingkungan produksi.
- **Build Tool**: Maven Wrapper (`./mvnw`) digunakan untuk memastikan integritas environment build di semua sistem.
- **Containerization Readiness**: Struktur proyek siap untuk di-containerize menggunakan Docker.

---

## 🚀 Cara Menjalankan Secara Lokal

### Prasyarat
- JDK 17+
- Maven 3.x
- MySQL 8.0

### Instalasi
1. **Clone Repository:**
   ```bash
   git clone https://github.com/B3rlinSugi/springboot-student-api.git
   cd springboot-student-api
   ```
2. **Konfigurasi Database:**
   Update `src/main/resources/application.properties` dengan kredensial MySQL lokal Anda.
3. **Run Application:**
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 👤 Author

<div align="center">

**Berlin Sugiyanto Hutajulu**

[![GitHub](https://img.shields.io/badge/GitHub-B3rlinSugi-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/B3rlinSugi)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-berlinsugi-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/berlinsugi)
[![Portfolio](https://img.shields.io/badge/Portfolio-berlinsugi.vercel.app-4e73df?style=for-the-badge&logo=vercel&logoColor=white)](https://berlinsugi.vercel.app)

---

Built with ☕ and Spring Boot · Java Backend Excellence

</div>
