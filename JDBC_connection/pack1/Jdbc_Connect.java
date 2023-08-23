package com.destination.JDBC_connection.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_Connect {

	public static void main(String[] args) throws Exception {
		//Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish connetion
		String url = "jdbc:mysql://localhost:3306/dest_projects";
		String user = "root";
		String pwd = "The_kk_raj_89";
		Connection con = DriverManager.getConnection(url, user, pwd);
		if(con != null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Connection failed");
		}
	}
}
