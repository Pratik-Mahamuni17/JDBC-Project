# JDBC Employee Management System

This is a simple **Core Java + JDBC** project developed in **Eclipse IDE** that performs basic **CRUD (Create, Read, Update, Delete)** operations on an **employee database using MySQL**. It demonstrates how to connect a Java application to a database using JDBC without any frameworks.

## 💡 Features
- Add new employee records
- View existing employee records
- Update employee details
- Delete employee records
- Uses JDBC API to interact with MySQL

## 🛠️ Technologies Used
- Core Java
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse IDE

## 🧪 How to Run
1. Open the project in Eclipse
2. Add the MySQL JDBC Driver (`mysql-connector-java.jar`) to your `lib/` folder and configure it in your build path
3. Update your database connection credentials in the source file:
   ```java
   String url = "jdbc:mysql://localhost:3306/your_database";
   String username = "root";
   String password = "root";
