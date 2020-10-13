package com.MySeleniumProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


public class ParallelExecution {
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass(){
			 System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
				driver= new ChromeDriver(); 
	  }

  @Test
  public void launchBrowser() {
	  driver.get("https://www.google.com/");
	  
  }

}
