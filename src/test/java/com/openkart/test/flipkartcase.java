package com.openkart.test;

import java.util.Iterator;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class flipkartcase {
	WebDriver driver;
	Actions action;
	
  @Test(priority = 0)
  public void f() {
	  
	  System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
	     driver=new EdgeDriver();

		driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=1712822f118d9f717f8a5bc666918880");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		  driver.findElement(By.xpath("//div[@class='xtXmba']")).click();
		
		   
		}
  
  @Test(priority = 1)
  public void f1() throws InterruptedException {
	  

       Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[@class='_2I9KP_' and text()='Electronics']")).click();
	  
	    Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//span[@class='_2I9KP_' and text()='Electronics']"))).build().perform(); 
       
        Thread.sleep(2000);
		WebElement smartphone=	driver.findElement(By.xpath("//a[@title=\"Smart Headphones\"]"));
		action.click(smartphone).build().perform();
		Thread.sleep(2000);

		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[2]")).click();
		 
		  
	   }
  
  
  @Test(priority = 2)
  public void f2() throws InterruptedException {

		 Set<String>windows=driver.getWindowHandles();
		 Iterator<String> it=windows.iterator();
	  String p=it.next();
	  String c=it.next();
	  driver.switchTo().window(c);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	 driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("saigopalamp@gmail.com");
	 
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh _17N0em']")).sendKeys("9989983131@sai");
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
	//a[@class="_1_3w1N"]
	 
  }
  
  @Test(priority = 3)
  public void f3() {
		
		//driver.quit();
	  
  }
}