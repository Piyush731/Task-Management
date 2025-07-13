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

src/
├── controller # API endpoints
├── entity # JPA entities
├── repository # Data access layer
├── service # Business logic
├── dto # Data Transfer Objects
├── config # Security and JWT config
└── exception # Global exception handling

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

### 🔐 Register a User

**POST** `/api/auth/register`
{
  "username": "johndoe",
  "password": "123456",
  "role": "USER"
}
🔐 Login
POST /api/auth/login
{
  "username": "johndoe",
  "password": "123456"
}
➡️ Response:
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."
}
Use the token in headers as:
Authorization: Bearer <your_token_here>
✅ Create a Task
POST /api/tasks
{
  "title": "Deploy app to production",
  "description": "Use Render or Railway to deploy backend",
  "status": "PENDING"
}
✅ Get All Tasks
GET /api/tasks

Returns all tasks based on user’s role.

⚙️ Setup Instructions
1. Clone the Repository
git clone https://github.com/Piyush731/Task-Management.git
cd Task-Management
2. Configure MySQL
Create a MySQL database (e.g., taskdb) and update application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
3. Run the Application
Using Maven:
./mvnw spring-boot:run
Or using Eclipse:
Right-click the project → Run As → Spring Boot App

📬 Contact
Name: Piyush Kashyap
📧 Email: piyushkashyap3247@gmail.com
