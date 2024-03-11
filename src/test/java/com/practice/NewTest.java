package com.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
 
  
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("--login--");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("--logout--");
  }
  @AfterMethod
  public void afterMethod1() {
	  System.out.println("--logout1--");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("--open browser--");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("--close browser--");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("--test script--");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("--close testScript--");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("--open suite--");
  }
  @BeforeSuite
  public void aeforeSuite() {
	  System.out.println("--open suite1--");
  }
  @BeforeSuite
  public void aforeSuite() {
	  System.out.println("--open suite1--");
  }
  @Test(invocationCount = 1,threadPoolSize =1)
  public void testMethos2_Test() { 
	  System.out.println("---testmethod_2---");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("--close suite--");
  }

}
