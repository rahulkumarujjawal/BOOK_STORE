# 📚 Book Store Management System

> 🚀 A Spring Boot + MySQL based backend application for managing books efficiently using REST APIs.

---
src
└── main
    ├── java
    │   └── com.bookstore
    │
    │       ├── 🎮 Controller
    │       │   └── BookController.java
    │       │
    │       ├── 📖 Entity
    │       │   └── Book.java
    │       │
    │       ├── 🗄️ Repository
    │       │   └── BookRepo.java
    │       │
    │       ├── ⚙️ Service
    │       │   └── LibraryService.java
    │       │
    │       └── ⚠️ Exception
    │           └── BookNotFoundException.java
    │
    └── resources
        └── application.properties
## 🌟 Project Overview

The **Book Store Management System** is a backend application developed using **Java 17, Spring Boot, Spring Data JPA, and MySQL**.

The application provides REST APIs to manage books and perform common operations such as:

- ➕ Add Book
- ❌ Remove Book
- 🔍 Search Book
- 📋 List All Books
- 📖 List Available Books
- 🛡️ Handle Application Exceptions

The project follows a **layered architecture** to keep the code clean, maintainable, and scalable.

---

## 🏗️ Architecture

```text
             🌐 Client / Postman
                    │
                    ▼
          🎮 Controller Layer
                    │
                    ▼
            ⚙️ Service Layer
                    │
                    ▼
          🗄️ Repository Layer
                    │
                    ▼
             🐬 MySQL Database



| Feature               | Description                        |
| --------------------- | ---------------------------------- |
| ➕ Add Book            | Add new books to the database      |
| 🚫 Duplicate Check    | Prevent duplicate books using ISBN |
| ❌ Remove Book         | Delete a book using ISBN           |
| 🔍 Search             | Search books by title or author    |
| 📋 List All           | Retrieve all books                 |
| 📖 Available Books    | Retrieve books currently available |
| ⚠️ Exception Handling | Handle book-not-found scenarios    |
