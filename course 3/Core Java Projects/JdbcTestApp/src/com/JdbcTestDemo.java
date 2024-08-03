package com;
import java.sql.*;
public class JdbcTestDemo {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root@123");
System.out.println("Connected successfully");
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
