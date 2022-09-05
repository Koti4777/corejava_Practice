package com.openkart.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class emicalculaterproject {
	WebDriver driver;
	@Test(priority = 0)
	public void clculater() {
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
	 driver=new EdgeDriver();

	driver.get("https://emicalculator.net/");
	
	driver.manage().window().maximize();}
	@Test(priority = 1)
	public void perfom() {
	
	WebElement loneamount=driver.findElement(By.xpath("//span[@style=\'left: 25%;\']"));
	WebElement lntrestrate=driver.findElement(By.xpath("//span[@style=\'left: 33.34%;\']"));
	WebElement lonetenure=driver.findElement(By.xpath("//div[@id='loantermsteps']//child::span[4]"));
	
	
	WebElement loneamountdest=driver.findElement(By.xpath("//span[@style=\'left: 12.5%;\']"));
	WebElement lntrestratedest=driver.findElement(By.xpath("//div[@id='loanintereststeps']/child::span[2]"));
	WebElement lonetenuredest=driver.findElement(By.xpath("//div[@id='loantermsteps']//child::span[5]"));
	
			
	Actions act=new Actions(driver);
	act .dragAndDrop(loneamount, loneamountdest).build().perform();
	act .dragAndDrop(lntrestrate, lntrestratedest).build().perform();
	act .dragAndDrop(lonetenure, lonetenuredest).build().perform();}
	
	
	@Test(priority = 2)
	
	public void check() {
	WebElement emi=driver.findElement(By.xpath("//div[@id='emiamount']//child::p// child::span"));
	
	String expected="20,911";
	String emitext=emi.getText();
	Assert.assertEquals(expected, emitext);}
	
	
	@Test(priority = 3)
	
	
	public void close() {
//	driver.close();
	}
}
