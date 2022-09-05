package com.openkart.test;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class amazoncasess1 {
	
	
	WebDriver driver;
	@Test
	 public void f() throws InterruptedException  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
	     driver=new EdgeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tshirt");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.TAB.ENTER);
		
		Thread.sleep(2000);
			
		Actions act=new Actions(driver);
			
	act.click(driver.findElement(By.xpath("//li[@id='p_89/Allen Solly']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"))).build().perform();
				
	Thread.sleep(2000);
				
    act.click(driver.findElement(By.xpath("//span[text()='Under ₹300']"))).build().perform();		
				
	act.click(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[2]/div[2]/h2/a/span"))).build().perform();
	
	Set<String>windows=driver.getWindowHandles();
	 Iterator<String> it=windows.iterator();
	  
	  String p=it.next();
	  String c=it.next();
	  driver.switchTo().window(c);
	  driver.findElement(By.xpath("//li[@id='color_name_6']")).click();
	  
	  Select sele=new  Select(driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']")));
	  
	  sele.selectByIndex(2);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saigopalamp@gmail.com");
	  driver.findElement(By.xpath("//input[@id='continue']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9989983131@sai");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	  
	
	  
	
	
	//  driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
		}
	

	
}
