package com.openkart.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class propertfileexp {
	@Test
	public void proper() throws IOException {
		
   FileInputStream fis=new FileInputStream("C:\\Users\\ravit\\eclipse-workspace\\MavenMayProjectsample\\src\\test\\java\\com\\openkart\\test\\conf.programfile1");
	Properties prop=new Properties();
	prop.load(fis);
	
	String url=prop.getProperty("asurl");
	
	String username=prop.getProperty("username");
	
	String password=prop.getProperty("password");
	
	System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}

}
