package com.destination.JDBC_connection.pack1;

import java.sql.*;
import java.util.Scanner;
public class Createdb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
		//Loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish connetion
				String url = "jdbc:mysql://localhost:3306/Test";
				String user = "root";
				String pwd = "The_kk_raj_89";
				Connection con = DriverManager.getConnection(url, user, pwd);
				System.out.println("Enter the Database name: ");
				Statement stmt = con.createStatement();
				int x = stmt.executeUpdate("Create database "+sc.next());
				if(x>0) {
					System.out.println("database created");
				}
				else {
					System.out.println("Database creation failed");
				}
				stmt.close();
				con.close();
				sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
