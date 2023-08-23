package com.destination.JDBC_connection.pack1;

import java.sql.*;

public class Fetch {

	public static void main(String[] args) throws Exception {
		try {
		//Loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Establish connetion
				String url = "jdbc:mysql://localhost:3306/Test";
				String user = "root";
				String pwd = "Deekshith_31";
				Connection con = DriverManager.getConnection(url, user, pwd);
				String query = "Select * from Student";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				while(rs.next()==true) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println("-----------------------");
				}
				st.close();
				con.close();
		}
				catch(Exception e) {
					System.out.println("Exception caught");
					e.printStackTrace();
				}
	}

}
