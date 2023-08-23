package com.destination.JDBC_connection.pack1;

import java.sql.*;
import java.util.Scanner;
public class UpdateQuery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
		//Loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish connetion
				String url = "jdbc:mysql://localhost:3306/student_details";
				String user = "root";
				String pwd = "Deekshith_31";
				Connection con = DriverManager.getConnection(url, user, pwd);
				String sql = "Update student_information set Name=? where id=?";
				PreparedStatement pst = con.prepareStatement(sql); 
				System.out.println("Enter the name to be changed: ");
				pst.setString(1, sc.next());
				System.out.println("Enter the id: ");
				pst.setInt(2, sc.nextInt());
				int x = pst.executeUpdate();
				if(x>0) {
					System.out.println("Data Updated");
				}
				else {
					System.out.println("Data update failed");
				}
				pst.close();
				con.close();
				sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
