package com.openkart.test;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class bookmytripp {
	WebDriver driver;
	
  @SuppressWarnings("deprecation")
@Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
	     driver=new EdgeDriver();

		driver.get("https://www.mytrip.com/");
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@data-testid='searchForm-oneWay-radio-label']")).click();
		
		driver.findElement(By.xpath("//div[@class=\" css-1n3p2ym-placeholder\" and text()='From']")).click();
		
		driver.findElement(By.xpath("//input[@id='searchForm-singleBound-origin-input']")).sendKeys("Raja");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchForm-singleBound-origin-input']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='searchForm-singleBound-destination-input']")).sendKeys("vijayawada");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchForm-singleBound-destination-input']")).sendKeys(Keys.TAB);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-1a8en2k em00kgn0']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='counter-children-plus-button']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='etiModal__closeButton e1hxxnec2 css-1rydqur e1526d5i0']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("singleBound.departureDate")).click();
		
		
		
		
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Week'][5]/child::div[6]")).click();
		
		driver.findElement(By.xpath("//button[@class='_1hglkl65 _1hglkl60 _1hglkl63 css-1oa6w0n']")).click();
		
		//driver.findElement(By.xpath("//section[@class=\"css-1m4w594 e1ygvaur0\"][1]/div/div[1]/div[3]/div[1]/child::button[2]")).click();
		
		//driver.findElement(By.xpath("//section[@class='css-1m4w594 e1ygvaur0'][1]//div[@class='css-yo0kzt e7e8cbb0'][1]//button[@class='_1hglkl66 _1hglkl60 _1hglkl63 css-c9ay1s']")).click();
	
		Actions act=new Actions(driver);
		
		//act.moveToElement(driver.findElement(By.xpath("//section[@class='css-1m4w594 e1ygvaur0'][1]//div[@class='css-yo0kzt e7e8cbb0'][1]//button[@class='_1hglkl66 _1hglkl60 _1hglkl63 css-c9ay1s']"))).build().perform();
		
		//act.click(driver.findElement(By.xpath("//section[@class='css-1m4w594 e1ygvaur0'][1]//div[@class='css-yo0kzt e7e8cbb0'][1]//button[@class='_1hglkl66 _1hglkl60 _1hglkl63 css-c9ay1s']"))).build().perform();
	act.click(driver.findElement(By.xpath("//section[@class='css-1m4w594 e1ygvaur0'][1]//child::button[2]"))).build().perform();
	
		
	  
	  // act.doubleClick(driver.findElement(By.xpath("//div[@class='css-1a6zesa eleex970']"))).build().perform();
	   
	  
//	 driver.findElement(By.xpath("//div[@class=\" css-1n3p2ym-placeholder\" and text()='To']")).click();

	//driver.findElement(By.xpath("//input[@id='searchForm-singleBound-destination-input']")).sendKeys("vijayawada"); 
		
		
		//  act.click(driver.findElement(By.xpath(""))).build().perform();
	
	
	//driver.findElement(By.xpath("//div[@class='css-xovfk']"))
		
		//driver.findElement(By.xpath("//input[@id='searchForm-singleBound-destination-input']")).sendKeys("Vijaywada") ; 
		//div[@aria-label='Thu Jul 28 2022']
		
  }
}

