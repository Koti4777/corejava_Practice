package com.openkart.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class dataprovider {
	WebDriver driver;
	
  @Test
  @BeforeMethod
  public void open() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
  }
  
  @Test(dataProvider = "mydata")
  public void loginfunction(String username,String password) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	  
  }
  @AfterMethod
  public void close() {
	  driver.close();
  }

  @DataProvider(name="mydata")
   String[][] login() {
  
	  String data[][]= {{"ram","raj"},{"sai","sie"},{"jhan","sri"}};
	return data;
  
 
  }
}
