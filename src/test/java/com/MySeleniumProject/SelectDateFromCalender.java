package com.MySeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectDateFromCalender {
	String url;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  url="https://www.irctc.co.in/nget/train-search";
	  driver.get(url);
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit' and @class='btn btn-primary']")));
	  driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']")).click();
	  driver.findElement(By.xpath("//input[@type='text' and @autocomplete='off' and @placeholder='From*']")).sendKeys("PUNE JN - PUNE");
	  driver.findElement(By.xpath("//input[@type='text' and @autocomplete='off' and @placeholder='To*']")).sendKeys("BUXAR - BXR");
	  Actions action = new Actions(driver);
	  //WebElement element=driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']"));
	 // action.moveToElement(element);
	  //action.perform();
	  //driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
	 
	  
	  
  }
}
