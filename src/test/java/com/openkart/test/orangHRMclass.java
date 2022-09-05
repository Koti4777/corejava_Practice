package com.openkart.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class orangHRMclass {
	WebDriver driver;
	
	@Test(priority = 0)
	public void orange() {
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
     driver=new EdgeDriver();

	driver.get("https://www.flipkart.com/?affid=siteplug&affExtParam1=1712822f118d9f717f8a5bc666918880");
	
	driver.manage().window().maximize();}
	@Test(priority = 1)
	public void orangeclick() {
	
		//Alert alert=driver.switchTo().alert();
		
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
////	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("tshirt");
	
	//driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).click();
		}
	
	
	
	@Test(priority = 2)
	public void addcart() {
	
	
//	driver.findElement(By.id("add_to_cart")).click();
	
	}
	
	@Test(priority = 3)
	public void orangealert() {
	
	
	////Alert alert =driver.switchTo().alert();
	
	//alert.accept();
	
	//driver.findElement(By.xpath("//i[@class='icon-chevron-right right']")).click();
		}
	
	@Test(priority = 4)
	public void close() {
		//driver.close();
	
		
	}
		
	


}
