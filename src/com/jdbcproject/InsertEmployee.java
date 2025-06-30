package com.jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEmployee {
	public void insert(Connection con) {
		try {
			Scanner sc = new Scanner(System.in) ;
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Salary: ");
			double salary = sc.nextDouble();

			String sql = "INSERT INTO employee VALUES (?, ?, ?)";
			
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setDouble(3, salary);
				int rows = pst.executeUpdate();
				System.out.println(rows + " employee inserted.");
			
		} catch (Exception e) {
			System.out.println("Error inserting employee: " + e.getMessage());
		}
	}
}
