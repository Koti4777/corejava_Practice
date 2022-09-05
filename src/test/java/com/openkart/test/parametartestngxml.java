package com.openkart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parametartestngxml {
	WebDriver driver;
	
	@Parameters({ "browser","a","b"})
	@Test(priority = 0)	
 public void openurl1(String brow ,String s1, String s2) {
		
		if(brow.equals("Edge")) {
			
			System.out.println(s1+s2);
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		 driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");	
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(s1);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(s2);
		driver.findElement(By.xpath("//button[@name='login']")).click();	
	}
		else if(brow.equals("chrome")) {
			System.out.println(s1+s2);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");	
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(s1);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(s2);
			driver.findElement(By.xpath("//button[@name='login']")).click();	
		}

		else  {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");	
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ram");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("998998");
			driver.findElement(By.xpath("//button[@name='login']")).click();}
		
	/*	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="browsersuit">
  <test name="browsertest">
  <parameter name="browser" value="chrome"/>
  <parameter name="a" value="hiisai"/>
  <parameter name="b" value="gopalam"/>
    <classes>
      <class name="com.openkart.test.parametartestngxml">
        <methods>
          <include name="openurl1"/>
        </methods>
      </class> <!-- com.openkart.test.parametartestngxml -->
    </classes>
  </test> <!-- Default test(failed) -->
</suite> <!-- Failed suite [Default suite] -->*/
		
		

}}
