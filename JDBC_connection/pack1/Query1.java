package com.destination.JDBC_connection.pack1;

import java.sql.*;
import java.util.Scanner;

public class Query1 {
	public static void main(String[] args) {
		try {
			Scanner sc =new Scanner(System.in);
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Establish connetion
					String url = "jdbc:mysql://localhost:3306/student_details";
					String user = "root";
					String pwd = "Deekshith_31";
					Connection con = DriverManager.getConnection(url, user, pwd);
					String query = "Select * from student_information where id=?";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setInt(1, sc.nextInt());
					ResultSet rs = pst.executeQuery();
					while(rs.next()==true){
						System.out.println(rs.getInt(1));
						System.out.println(rs.getString(2));
						System.out.println("-----------------------");
					}
					pst.close();
					sc.close();
					con.close();
		}
					catch(Exception e) {
						System.out.println("Exception caught");
						e.printStackTrace();
					}
	}

}
