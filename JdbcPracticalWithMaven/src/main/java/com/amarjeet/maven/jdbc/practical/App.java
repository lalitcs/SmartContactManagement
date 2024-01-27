package com.amarjeet.maven.jdbc.practical;

import java.sql.*;

class ConnectDb {

	public static void main(String a[]) throws Exception{

		
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";

		Connection con=DriverManager.getConnection(url);
		//System.out.println("connection created.."+con);
		String createDatabase="create database AmarjeetEdifecsDatabase11";
		Statement st = con.createStatement();
		st.executeUpdate(createDatabase);
		System.out.println("database created...");
		
		
	}
}
