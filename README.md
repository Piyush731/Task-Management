# 🗂️ Task Management System

A **role-based Task Management System** built using **Java Spring Boot** and **MySQL**. It provides secure authentication and user-specific task operations for different user roles like `Admin`, `Manager`, and `User`.

> ✅ Ideal for internal task tracking systems in startups, teams, or personal productivity tools.

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.0-green)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Active-brightgreen)

---

## 🚀 Features

- 🔐 **JWT Authentication** (Login/Register)
- 👥 **Role-based Authorization** (Admin / Manager / User)
- ✅ **CRUD Operations** for Tasks
- 🗃️ **MySQL Database Integration**
- 📦 RESTful APIs using Spring Boot
- 📜 Global Exception Handling
- 🧪 API testing with Postman / Swagger

---

## 🧑‍💻 Tech Stack

| Layer        | Tech Used                           |
|--------------|--------------------------------------|
| Language     | Java 21                              |
| Framework    | Spring Boot                          |
| Security     | Spring Security + JWT                |
| Database     | MySQL                                |
| IDE          | Eclipse IDE with Spring Tools        |
| Tools        | Postman, Swagger, Git, GitHub        |

---

## 📁 Project Structure

src/<br>
├── controller # API endpoints<br>
├── entity # JPA entities<br>
├── repository # Data access layer<br>
├── service # Business logic<br>
├── dto # Data Transfer Objects<br>
├── config # Security and JWT config<br>
└── exception # Global exception handling<br>

---

## 🔐 Roles and Access

| Role     | Access Permissions                                |
|----------|----------------------------------------------------|
| Admin    | Create, Update, Delete any task; Manage users      |
| Manager  | Assign and update tasks                            |
| User     | View and update own tasks                          |

---

## 🔧 API Endpoints

### 🔐 Authentication

| Method | Endpoint              | Description        |
|--------|-----------------------|--------------------|
| POST   | `/api/auth/register`  | Register new user  |
| POST   | `/api/auth/login`     | Login and receive JWT |

### 📝 Task Management

| Method | Endpoint              | Description                      |
|--------|-----------------------|----------------------------------|
| GET    | `/api/tasks`          | Get all tasks (based on role)    |
| POST   | `/api/tasks`          | Create new task                  |
| PUT    | `/api/tasks/{id}`     | Update task                      |
| DELETE | `/api/tasks/{id}`     | Delete task (admin only)         |

🧪 Test with Swagger UI: `http://localhost:8080/swagger-ui.html` (if Swagger is enabled)

---

## 🧪 API Usage Examples

### 🔐 Register a User <br>

**POST** `/api/auth/register`<br>
{<br>
  "username": "johndoe",<br>
  "password": "123456",<br>
  "role": "USER"<br>
}<br>
🔐 Login<br>
POST /api/auth/login<br>
{<br>
  "username": "johndoe",<br>
  "password": "123456"<br>
}<br>
➡️ Response:<br>
{<br>
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."<br>
}<br>
Use the token in headers as:<br>
Authorization: Bearer <your_token_here><br>
✅ Create a Task<br>
POST /api/tasks<br>
{<br>
  "title": "Deploy app to production",<br>
  "description": "Use Render or Railway to deploy backend",<br>
  "status": "PENDING"<br>
}<br>
✅ Get All Tasks<br>
GET /api/tasks<br>

Returns all tasks based on user’s role.<br>

---
## ⚙️ Setup Instructions

1. Clone the Repository<br>
git clone https://github.com/Piyush731/Task-Management.git<br>
cd Task-Management<br>
2. Configure MySQL<br>
Create a MySQL database (e.g., taskdb) and update application.properties:<br>
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb<br>
spring.datasource.username=yourUsername<br>
spring.datasource.password=yourPassword<br>
3. Run the Application<br>
Using Maven:<br>
./mvnw spring-boot:run<br>
Or using Eclipse:<br>
Right-click the project → Run As → Spring Boot App<br>

---
## 📬 Contact
Name: Piyush Kashyap<br>
📧 Email: piyushkashyap3247@gmail.com<br>
