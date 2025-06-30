package com.jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEmployee {
    public void update(Connection con) {
        try {
        	Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee ID to Update: ");
            int id = sc.nextInt();
            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            String sql = "UPDATE employee SET salary = ? WHERE id = ?";
            
            	PreparedStatement pst = con.prepareStatement(sql);
                pst.setDouble(1, salary);
                pst.setInt(2, id);
                int rows = pst.executeUpdate();
                System.out.println(rows > 0 ? "Employee updated." : "Employee not found.");
       
        } catch (Exception e) {
            System.out.println("Error updating employee: " + e.getMessage());
        }
    }
}
