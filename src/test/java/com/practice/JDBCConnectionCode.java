package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.System;

import com.mysql.cj.jdbc.Driver;

public class JDBCConnectionCode {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		// step 2:register database
		try {
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			// step 2:get connection from database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shankar", "root", "root");

			// step 3:create statement
			Statement state = con.createStatement();
			String query = "select * from data;";
			// step 4:execute query
			ResultSet result = state.executeQuery(query);
			while (result.next()) {
				int i=1;
				System.out.println(result.getString(i++) + " " + result.getString(i++) + " " + result.getString(i++));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// step 5: close the connection
			con.close();
			
		}
	}
	

}

