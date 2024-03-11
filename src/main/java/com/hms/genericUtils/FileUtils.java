package com.hms.genericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	/**
	 * this method used to read the data from propertyFile by passing key 
	 *  this method will return value    (key,value) 
	 *  
	 *  @author Shankar
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String readDataFromPropertyFile(String key) throws Exception {
	FileInputStream fis = new FileInputStream(IpathConstants.FilePath);
	Properties pObj=new Properties();
	
	pObj.load(fis);
	return pObj.getProperty(key);
	}
	public void writeDataInPropertyFile(String key,String value,String comments) throws IOException {
		
		Properties prop=new Properties();
		prop.setProperty(key, value);
		FileOutputStream fos=new FileOutputStream(IpathConstants.FilePath);
		prop.store(fos, comments);
		
	}
	
	public  Object[][] readFromPro(String key, int loopCount) throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstants.FilePath);

		Properties prop = new Properties();
		prop.load(fis);
		String[] str = new String[loopCount];
		for (int i = 0; i < loopCount; i++) {
			str[i] = prop.getProperty(key + i);
			System.out.println(str[i]);
		}
		Object[][] obj = new Object[loopCount][];

		for (int i = 0; i < str.length; i++) {
			String[] value = str[i].split(" ");
			obj[i] = new String[value.length];
			for (int j = 0; j < value.length; j++) {
				obj[i][j] = value[j];
			}
			System.out.println();
		}
		return obj;
	}

	
}
