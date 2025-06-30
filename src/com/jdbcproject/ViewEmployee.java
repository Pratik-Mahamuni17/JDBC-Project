package com.jdbcproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewEmployee {
    public void viewAll(Connection con) {
        String sql = "SELECT * FROM employee";
        try{
        	Statement stmt = con.createStatement();
        	ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n--- Employee List ---");
            System.out.println("ID\tName\tSalary");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.printf("%d\t%s\t%.2f\n", id, name, salary);
            }
        } catch (Exception e) {
            System.out.println("Error fetching employees: " + e.getMessage());
        }
    }
}
