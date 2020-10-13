package com.MySeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingWebTable {
	WebDriver driver;
	String url;
  
	
@BeforeMethod
	public void setUp(){
	  System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  url="http://demo.guru99.com/test/web-table-element.php";
	  driver.get(url);
}

@Test
   public void HandlingTable(){
	


}}