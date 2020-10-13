package com.MySeleniumProject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MenSectionNavigation {
	WebDriver driver;
	String url;

	@BeforeClass
	  public void launch(){
		 System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	  @Test
	  public void NavigateToMen() {
		  try{
			  System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  url = "https://www.flipkart.com/";
			  driver.get(url);
			  driver.manage().window().maximize();
			  String windowHandle;
			  windowHandle = driver.getWindowHandle();
			  driver.switchTo().window(windowHandle);
			  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			  
			  //hover mouse over element
			  Actions actions = new Actions(driver);
			  WebElement mouseHover = driver.findElement(By.xpath("//*[text()='Men']"));
			  actions.moveToElement(mouseHover);
			  actions.perform();
			  driver.findElement(By.xpath("//*[text()='T-Shirts']")).click(); 
		  }catch(Exception ex){
			  ex.printStackTrace();
		  }finally{
			  driver.quit();
		  }
}
}


	


	
 
 
  
 

  





	
