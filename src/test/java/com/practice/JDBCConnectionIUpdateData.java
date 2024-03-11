package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCConnectionIUpdateData {
	static int id=1000;
	public static void main(String[] args) {
		Connection con=null;
		try {
			//step 1:register connection
			DriverManager.registerDriver(new Driver());
			//step 2:get the connction from database
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shankar", "root", "root");
			  	for (int i = 2000; i <2010; i++) {
				Statement state = con.createStatement();
				int result = state.executeUpdate("insert into data values('name',"+i+",'keruguru');");
				if (result>=1) {
					System.out.println("data updated succesfully");
				} else {

					System.out.println("getting Error");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
