package com.destination.JDBC_connection.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class TableCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
		//Loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish connetion
				String url = "jdbc:mysql://localhost:3306/Test";  //Test is the database name that was created earlier
				String user = "root";
				String pwd = "Deekshith_31";
				Connection con = DriverManager.getConnection(url, user, pwd);
				Statement stmt = con.createStatement();
				int x = stmt.executeUpdate("Create table Student(id int, name varchar(60))");
				if(x>0) {
					System.out.println("Table created");
				}
				else {
					System.out.println("Table creation failed");
				}
				stmt.close();
				con.close();
				sc.close();
		}
		catch (Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}

}
