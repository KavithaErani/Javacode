package com.destination.JDBC_connection.pack1;

import java.sql.*;
import java.util.Scanner;
public class DeleteQuery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
		//Loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish connetion
				String url = "jdbc:mysql://localhost:3306/Test";
				String user = "root";
				String pwd = "Deekshith_31";
				Connection con = DriverManager.getConnection(url, user, pwd);
				String sql = "Delete from Student where id=?";
				PreparedStatement pst = con.prepareStatement(sql); 
				System.out.println("Enter the id of the student to be deleted: ");
				pst.setInt(1, sc.nextInt());
				int x = pst.executeUpdate();
				if(x>0) {
					System.out.println("Data deleted");
				}
				else {
					System.out.println("Data deletion failed");
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
