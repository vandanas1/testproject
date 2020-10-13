package com.MySeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDate {
	WebDriver driver;
	String url;
	
  @BeforeMethod
	public void setUp(){
	  System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  url="https://www.spicejet.com/";
	  driver.get(url);
  }
  @Test
  public void selectDateFromCalender() throws InterruptedException {
	  driver.get(url);
	  Thread.sleep(3000);
	  Actions action = new Actions(driver);
	  WebElement element=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
	  action.moveToElement(element);
	  action.perform();
	  element.click();
	  Thread.sleep(3000);
	  //Select select = new Select(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
	  //select.selectByIndex(2);
	  //Select select1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
	  //select1.selectByValue("GOI");
  }
}
