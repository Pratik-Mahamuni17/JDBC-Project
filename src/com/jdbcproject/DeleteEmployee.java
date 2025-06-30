package com.jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmployee {
    public void delete(Connection con) {
        try{
        	Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee ID to Delete: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM employee WHERE id = ?";
            
            	PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                int rows = pst.executeUpdate();
                System.out.println(rows > 0 ? "Employee deleted." : "Employee not found.");
           
        } catch (Exception e) {
            System.out.println("Error deleting employee: " + e.getMessage());
        }
    }
}
