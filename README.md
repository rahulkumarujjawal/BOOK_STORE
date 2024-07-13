# BOOK_STORE
Book Strore Management System
Project Summary
Overview
The Book Store Management System is a comprehensive application developed using Spring Boot and MySQL, leveraging Java 17. This system is designed to efficiently manage the collection of books across multiple departments within a library. It provides functionalities to add, remove, search, and list books, ensuring that library operations are streamlined and user-friendly.

====================================================================================================
==> Key Components
Book Entity: Represents a book with attributes such as title, author, ISBN, genre, publication year, department, and availability status.

Library Service: Manages the collection of books and includes methods for adding, removing, finding, and listing books.

Controllers: RESTful controllers that handle HTTP requests for performing various library operations such as adding a book, removing a book, finding books by title or author, and listing all or available books.

Repositories: Interfaces that extend JpaRepository to interact with the MySQL database, providing CRUD operations for the Book entity.

Exception Handling: Custom exception handling to manage errors gracefully, such as when a book is not found.

Database Configuration: MySQL database is used to store and manage book records, with Spring Data JPA handling the database interactions.


====> Project Structure
src/main/java/com/bookstore
Controller
BookController.java: Handles incoming HTTP requests and delegates actions to the service layer.
Entity
Book.java: Defines the Book entity with relevant attributes.
Repository
BookRepo.java: Extends JpaRepository to provide CRUD operations for the Book entity.
Service
LibraryService.java: Contains business logic for managing books.
Exception
BookNotFoundException.java: Custom exception for handling cases where a book is not found.
src/main/resources
application.properties: Contains database configuration and other application settings.
Key Features
Add Book: Allows adding new books to the library's collection, ensuring no duplicates based on ISBN.
Remove Book: Enables removing a book from the library using its ISBN.
Find Book by Title/Author: Provides case-insensitive search functionality to find books by title or author.
List All Books: Lists all books available in the library.
List Available Books: Lists only those books that are currently available for borrowing.

== ==  >Technologies Used ==
Java 17: The latest version of Java, providing enhanced performance and new features.
Spring Boot: A framework that simplifies the development of production-ready applications.
Spring Data JPA: Simplifies database interactions and provides a robust ORM.
MySQL: A reliable and scalable relational database for storing book records.
Thymeleaf: (Optional) A template engine for rendering HTML pages, if a front-end interface is required.
This Library Management System serves as a robust solution for managing a library's book collection, ensuring efficient operations and an easy-to-use interface for library staff and users.



