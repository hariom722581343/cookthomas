# Thomas Cook Spring Boot Project

Overview

This project is a Spring Boot application that demonstrates a simple employee management system. It uses H2 as the database and provides REST API endpoints for managing employees and calculating bonuses.

Features

- Employee management (create, read, update, delete)
- Bonus calculation based on employee data
- H2 database integration
- REST API endpoints for API access

API Endpoints

- POST /tci/employee-bonus - Save employees and calculate bonuses
- GET /tci/employee-bonus - Get eligible employees for bonus

Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- H2 Database Engine

Configuration

- application.properties - Database configuration and other settings

Entity Classes

- Employee.java - Employee entity class
- Department.java - Department entity class

Repository Classes

- EmployeeRepository.java - Employee repository class
- DepartmentRepository.java - Department repository class

Service Classes

- EmployeeService.java - Employee service class

Controller Classes

- EmployeeController.java - Employee controller class

Database Configuration

- DatabaseConfig.java - Database configuration class

Web Configuration

- WebConfig.java - Web configuration class

