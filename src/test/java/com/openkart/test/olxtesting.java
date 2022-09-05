package com.openkart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class olxtesting {
	WebDriver driver;
	
	@Test
	public void olx() throws InterruptedException {
		
		  System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		     driver=new EdgeDriver();

			driver.get("https://www.olx.in");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@class='_2xvhw']")).click();
			
			
			driver.findElement(By.xpath("//input[@class='_2xvhw']")).clear();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='_2xvhw']")).sendKeys("Tanuku,Andhra Pradesh");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-aut-id='locationItem']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cars");
			driver.findElement(By.xpath("//div[@data-aut-id='btnSearch']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//li[@data-aut-id=\"itemBox\"][2]")).click();
		
		
			//Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//div[@class=\"_1amj0\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='rui-39-wj rui-3mpqt rui-1JPTg rui-2NuAg']")).click();
			
			//driver.findElement(By.xpath("//div[@class='_1amj0']")).click();
			
			
			
			//driver.findElement(By.xpath("//span[text()='Chat with seller']")).click();
			
			
			
	/*		Actions action=new Actions(driver);
			
		WebElement car=	driver.findElement(By.xpath("//img[@alt='Mahindra Scorpio 2010 Diesel']"));
		
		action.click(car).build().perform();*/
			
			
	}

}
