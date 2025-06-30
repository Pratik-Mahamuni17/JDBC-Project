# JDBC Student Management Project

This is a simple **Core Java + JDBC** project developed in **Eclipse IDE** that performs basic **CRUD (Create, Read, Update, Delete)** operations on a **MySQL database**. It demonstrates how to connect a Java application to a database using JDBC without using any frameworks.

## 💡 Features
- Add new student records
- View existing student records
- Update student details
- Delete student records
- Uses JDBC API to interact with MySQL

## 🛠️ Technologies Used
- Core Java
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse IDE

## 🧪 How to Run
1. Open the project in Eclipse
2. Add MySQL JDBC Driver (`mysql-connector-java.jar`) to the `lib/` folder and build path
3. Update your DB credentials in the source file:
   ```java
   String url = "jdbc:mysql://localhost:3306/your_database";
   String username = "root";
   String password = "your_password";
