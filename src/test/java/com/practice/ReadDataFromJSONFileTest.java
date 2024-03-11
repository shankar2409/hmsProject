package com.practice;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromJSONFileTest {

	public static void main(String[] args) throws IOException, ParseException {
		//to read the json file
		FileReader reader = new FileReader(".\\src\\test\\resources\\JsonData.json");
		//to communicate to Json lang from java lang 
		JSONParser parser = new JSONParser();
		//to fetch the data's json to java lang
		Object obj = parser.parse(reader);
		//to get the key and value pair TypeCast to JSONObject OR UpCasting to (
		JSONObject map = (JSONObject)obj;
//		Map map1=(JSONObject)obj;
		System.out.println(map.get("browser"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get((String) map.get("url"));
		
	}

}
