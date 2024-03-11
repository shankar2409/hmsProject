package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.hms.genericUtils.IpathConstants.*;
import com.mysql.cj.jdbc.Driver;

public class db {

	@Test(dataProvider = "inputData")
	public void inputs(String username, String password) throws SQLException {

		System.out.println(username + " " + password);
		try {

			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8888/");
			driver.findElement(By.name("user_name")).sendKeys(username);
			driver.findElement(By.name("user_password")).sendKeys(password);

			driver.findElement(By.id("submitButton")).click();
			String actualtitle = driver.getTitle();
			String expectedData = "http://localhost:8888/index.php?action=index&module=Home";
			Assert.assertNotEquals(expectedData, actualtitle, "validationData");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@DataProvider
	public Object[][] inputData() throws Exception {
		Driver driverf = new Driver();
		DriverManager.registerDriver(driverf);
		Connection conn = DriverManager.getConnection(DBUrl, DBusername, DBpassword);
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery("Select * from RegistrationData;");
		ResultSet rowi = stmt.executeQuery("SELECT COUNT(*) AS row FROM RegistrationData;");
		int row = rowi.getInt("row");
		System.out.println(row);
		ResultSetMetaData rsmd = result.getMetaData();
		// getting the column type
		int column_count = rsmd.getColumnCount();
		System.out.println(column_count);
		Object[][] obj = new Object[row][column_count];
		int temp = 0, temp1 = 0;
		while (result.next()) {
			String col1 = result.getString("username");
			String col2 = result.getString("password");
			obj[temp][temp1++] = col1;
			obj[temp][temp1++] = col2;
			temp1 = 0;
			temp++;
		}
		conn.close();
		System.out.println(conn.isClosed());
		return obj;
	}
}
