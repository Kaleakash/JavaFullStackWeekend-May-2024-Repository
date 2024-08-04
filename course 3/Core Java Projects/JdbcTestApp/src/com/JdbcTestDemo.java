package com;
import java.sql.*;
import java.util.Scanner;
public class JdbcTestDemo {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root@123");
System.out.println("Connected successfully");
	Statement stmt = con.createStatement();
	
		// Insert query 
//		int result = stmt.executeUpdate("insert into employee values(5,'Neena',27000)");
//		if(result>0) {
//			System.out.println("Record inserted succesfully");
//		}
		
		// delete query 
//		int result = stmt.executeUpdate("delete from employee where id=1");
//		if(result>0) {
//			System.out.println("Record deleted succesfully");
//		}else {
//			System.out.println("Record not present");
//		}
	
		// update 
		
//		int result = stmt.executeUpdate("update employee set salary =45000 where id=2");
//		if(result>0) {
//			System.out.println("Record updated succesfully");
//		}else {
//			System.out.println("Record not present");
//		}
		// retrieve records 
		
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//		//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary "+rs.getFloat(3));
//System.out.println("id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary "+rs.getFloat("salary"));
//		}
//		rs.close();
//		stmt.close();
	
		Scanner sc = new Scanner(System.in);
		// insert record using PreparedStatement 
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		System.out.println("Enter the id");
		int id  = sc.nextInt();
			pstmt.setInt(1, id);
		
		System.out.println("Enter the name");
		String name= sc.next();
			pstmt.setString(2, name);
		
		System.out.println("Enter the salary");
		float salary  = sc.nextFloat();
			pstmt.setFloat(3, salary);
		
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Record inserted...");
		}
		con.close();
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
