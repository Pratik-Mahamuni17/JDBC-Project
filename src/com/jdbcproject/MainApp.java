package com.jdbcproject;

import java.sql.Connection;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {
        	Connection con = DBConnection.getConnection();
        	Scanner sc = new Scanner(System.in);
            while (true) {
            	System.out.println("\n--- Employee CRUD Menu ---");
                System.out.println("1. Insert Employee");
                System.out.println("2. Update Employee");
                System.out.println("3. Delete Employee");
                System.out.println("4. View All Employees");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                case 1 -> new InsertEmployee().insert(con);
                case 2 -> new UpdateEmployee().update(con);
                case 3 -> new DeleteEmployee().delete(con);
                case 4 -> new ViewEmployee().viewAll(con);
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
            }
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
