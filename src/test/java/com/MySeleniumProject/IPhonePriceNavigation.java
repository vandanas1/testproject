package com.MySeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IPhonePriceNavigation {
	WebDriver driver;
	String url;
	
 @Parameters("myBrowser")	
 @BeforeClass
  public void launch(String myBrowser){
	 if(myBrowser.equalsIgnoreCase("Firefox")){
		 driver=new FirefoxDriver();
	 }else if(myBrowser.equalsIgnoreCase("Chrome"))
	 System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
 }
	
  @Test
  public void iPhone() {
	  
	  try{
		  url = "https://www.flipkart.com/";
		  driver.get(url);
		  
		  //maximize the browser
		  driver.manage().window().maximize();
		  
		  String windowHandle;
		  windowHandle = driver.getWindowHandle();
		  driver.switchTo().window(windowHandle);
		  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		  
		  //enter value in text to search for iPhone
		  driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iPhone");
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='vh79eN']")));
		  driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		  
		  //click on Price -- High to Low to get iPhone with maximum price on top
		  driver.findElement(By.xpath("//*[text()='Price -- High to Low']")).click();
		  
		  //Print the details of phone with highest price
		  List<WebElement> element= driver.findElements(By.xpath("//*[@class='vFw0gD']"));
		    System.out.println(element.size());

	      for (WebElement webElement : element) {
	          String parameters = webElement.getText();
	          System.out.println(parameters);
	  }
	  }catch(Exception ex){
		  ex.printStackTrace();
	  }finally{
		  driver.quit();
	  }
  }
}

