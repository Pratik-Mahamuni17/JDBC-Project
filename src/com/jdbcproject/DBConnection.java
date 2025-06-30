package com.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static String URL = "jdbc:mysql://localhost:3307/CompanyDB";
	static String USER = "root";
    static String PASS = "Satara@123"; 
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
    

}
