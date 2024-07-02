package javaPractice;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class collection {
	@Test
	public void arraylist() {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("23");
		list.add("342342");
		list.add(423);
		list.add('a');
		list.add("23");
		list.add('a');
		System.out.println(list);
		System.out.println(list.get(0));
		
		//order of insertion is maintained 
		//duplicats are allowed
		//list fetch the data with the help of index
		//it stores heterogeneous type of data
	}
	@Test
	public void linkedList() {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("23");
		list.add("342342");
		list.add(423);
		list.add('a');
		list.add("23");
		list.add('a');
		list.push("rerw");
		list.push("rw4er3");
		
		System.out.println(list.poll());
		System.out.println(list);
//		System.out.println(list.get(0));
	}
	@Test
	public void ma() throws AWTException {
		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
		new Select(driver.findElement(By.id("sdf")));
		Font wr = new Font("Sf", 2342, 23);
		new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
}
