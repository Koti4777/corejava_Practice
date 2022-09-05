package com.openkart.test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.model.ScreencastFrame;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class amazonecase {
	WebDriver driver;
	
  @Test(priority = 0)
  public void f() throws InterruptedException  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//in search box search laptops
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		
		
		  driver.findElement(By.id("nav-search-submit-button")).click();
	
		  // in filter box select hp and select one product
		  driver.findElement(By.xpath("//*[@id=\"p_89/HP\"]/span/a/div/label/i")).click();
		 
		  Thread.sleep(5000);
		 // driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
		
		 driver.findElement(By.xpath("//span[text()='HP 14s, 5th Gen AMD Ryzen 3- 8GB RAM/512GB SSD 14 inches(35cm) Laptop, FHD IPS Micro-Edge Display/ Backlit Keyboard/Alexa/Windows 11/Fast Charge/Radeon Graphics/1.46Kg/Natural Silver) -14s-fq1089AU']")).click();
		  
		  
	//	  C:\\Users\\ravit\\Downloads\\edgedriver
		  
;
           
		
		 
		  
		 
		}
  
  @Test(priority = 1)
  public void f1()  {
	  
// selected product add into wishlist
      Set<String>windows=driver.getWindowHandles();
		 Iterator<String> it=windows.iterator();
		  
		  String p=it.next();
		  String c=it.next();
		  driver.switchTo().window(c);
		  //driver.findElement(By.xpath("//input[@id=\'add-to-cart-button\']")).click();
		  driver.findElement(By.xpath("//a[text()=' Add to Wish List ']")).click();

	  }
  
  
  @Test(priority = 2)
  public void f2() throws IOException {
	  
	//  Alert alert=driver.switchTo().alert();
	  
	  //driver.findElement(By.xpath("//span[@id=\'attach-sidesheet-checkout-button-announce\']")).click();
	  
	  // user provides wrong username and password credentials 
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9000268182");
	  driver.findElement(By.xpath("//input[@id='continue']")).click();
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9989983131");
	  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  
	  // user get text:: For your security, approve the notification sent to
	 String text=driver.findElement(By.xpath("//*[@id=\"body\"]/div/div/div[2]/span")).getText();
      Assert.assertEquals(text, "For your security, approve the notification sent to:");
      
      File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
      FileUtils.copyFile(scrfile,new File("C:\\Users\\ravit\\Dropbox\\Screenshots\\fullscreen.jpg"));
	}	
  
  @Test(priority = 3)
  
  public void f3() {
		
	driver.quit();
	  
  }
}
