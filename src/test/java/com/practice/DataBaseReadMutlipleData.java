package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.hms.genericUtils.IpathConstants;
import com.mysql.cj.jdbc.Driver;

public class DataBaseReadMutlipleData implements IpathConstants {
	@Test
	public void methos() throws Exception {
		int i = 1;
		Driver ddriver = new Driver();
		DriverManager.registerDriver(ddriver);
		Connection conn = DriverManager.getConnection(DBUrl, DBusername, DBpassword);
		Statement stmt = conn.createStatement();
		
		ResultSet row = stmt.executeQuery("select count(*) from registrationdata;");
		int rowcount=0;
		while (row.next()) {
			 rowcount=Integer.parseInt(row.getString(i));
		
	}
		
		System.out.println(rowcount);
		Object[][] obj=new Object[rowcount][];
	
		ResultSet result = stmt.executeQuery("select * from registrationdata;");
		ResultSetMetaData in = result.getMetaData();
		int j=0;
		int column=0;
		while (result.next()) {
			 column= in.getColumnCount();
			obj[j]=new Object[column];
			
			int k=0;
			obj[j][k++]=result.getString(i);
			obj[j][k++]=result.getString(i+1);
			j++;
		
	}
		System.out.println(column+"coulmnn");
		for (Object[] obj1: obj) {
			for (Object obj3 : obj1) {
				System.out.println(obj3 );
			}
			
		}
		
		
	
		
		
		
		
		
		conn.close();
	}
}
