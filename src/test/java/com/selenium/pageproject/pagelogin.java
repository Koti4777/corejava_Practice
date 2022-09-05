package com.selenium.pageproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pagelogin {
	
	WebDriver driver;
	
public pagelogin(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	}

public void login(String username, String password) {
	// TODO Auto-generated method stub
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
driver.findElement(By.xpath("//button[@name='login']")).click();	

	
	
	}}


