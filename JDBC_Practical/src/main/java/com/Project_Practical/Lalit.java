package com.Project_Practical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lalit {
	public static void main(String[] args) throws Throwable {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lalitDb11", "root", "root");
		// System.out.println("Connetion created " + con);

		/*
		 * Statement stmt=con.createStatement(); 
		 * String Str="create database lalitDb11";
		 * stmt.executeUpdate(Str); System.out.println("database created..."+Str);
		 */
		/*
		 * Statement stmt=con.createStatement(); String strTable =
		 * "create table emp1 (id int primary key auto_increment , name varchar(20),city varchar(20))"
		 * ; stmt.executeUpdate(strTable);
		 * System.out.println("table create successfully"+strTable);
		 */
		/*
		 * Statement stmt=con.createStatement(); String
		 * insertData="insert into emp values(102,'hira singh','bangalore')";
		 * stmt.executeUpdate(insertData);
		 * System.out.println("Values inserted...."+insertData);
		 */
		/*
		 * Statement stmt=con.createStatement(); String
		 * strUpdate="update emp set name='lalit' where id=101";
		 * stmt.executeUpdate(strUpdate);
		 * System.out.println("system updated"+strUpdate);
		 */

		/*
		 * Statement stmt=con.createStatement(); String
		 * strUpdate="update emp set name='lalit' where city='bangalore'";
		 * stmt.executeUpdate(strUpdate);
		 * System.out.println("system updated"+strUpdate);
		 */

		/*
		 * Statement st=con.createStatement(); String
		 * strDelete="delete from emp where id=101"; st.executeUpdate(strDelete);
		 * System.out.println("record deleted"+strDelete);
		 */

		/*
		 * Statement stmt=con.createStatement(); String
		 * insertData="insert into emp values(105,'abhay','bangalore')";
		 * stmt.executeUpdate(insertData);
		 * System.out.println("Values inserted...."+insertData);
		 */
		
		Statement st = con.createStatement();
		String sqlQuery = "SELECT * FROM emp";
		ResultSet resultSet = st.executeQuery(sqlQuery);
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " : " + resultSet.getString(2) + " : " + resultSet.getString(3));
			;
		}
		
	}

}
