package com.hms.genericUtils;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils {
	Connection conn;

	public void connectToDB() throws Exception {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		conn = DriverManager.getConnection(IpathConstants.DBUrl, IpathConstants.DBusername, IpathConstants.DBpassword);
	}

	public void ExceuteAndGetData(String query, int colIndex, String ExpData) throws Exception {
		Statement state = conn.createStatement();
		ResultSet result = state.executeQuery(query);

		boolean flag = false;
		while (result.next()) {
			String actualData = result.getString(colIndex);
			if (actualData.equalsIgnoreCase(ExpData)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("---data is present---");
		} else {
			System.err.println("---data is not present---");
		}
	}
	public void ExceuteAndUpdateData(String query) throws Exception {
		Statement state = conn.createStatement();
		int result = state.executeUpdate(query);
		if (result>=1) {
			System.out.println("---data updated succesfully---");
		} else {

			System.out.println("---data not updated---");
		}
	}

	public void disconnectDB() throws Exception {
		conn.close();
	}
	public ResultSet getDataFromDB(String sqlQuery) throws Exception {
		Statement state = conn.createStatement();
		 return state.executeQuery(sqlQuery);
	}
}
