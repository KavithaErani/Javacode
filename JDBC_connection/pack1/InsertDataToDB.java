package com.destination.JDBC_connection.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDataToDB {
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
				String sql = "insert into Student value(?,?)";
				System.out.println("How many data rows are to be added? :"); // total inputs that we want to give
				int dataRowInputs = sc.nextInt(); 
				//System.out.println(dataRowInputs);
				PreparedStatement pst = con.prepareStatement(sql);
				for(int i=1; i<=dataRowInputs; i++) {
				System.out.println("Enter the id: ");
				pst.setInt(1, sc.nextInt());
				System.out.println("Enter the name: ");
				pst.setString(2, sc.next());
				/*System.out.println("Enter the marks 1: ");
				pst.setInt(3, sc.nextInt());
				System.out.println("Enter the marks 2: ");
				pst.setInt(4, sc.nextInt());
				System.out.println("Enter the total: ");
				pst.setInt(5, sc.nextInt());
				*/
				int x = pst.executeUpdate();
				if(x>0) {
					System.out.println("Data Inserted");
				}
				else {
					System.out.println("Data Insertion failed");
				}
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
