package com.selenium.pageproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//FindBy
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")public  WebElement username;
	@FindBy(xpath="//input[@id='pass']") public WebElement password;
	@FindBy(xpath="//button[@name='login']")public  WebElement loginbtn;
	
	public loginpage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void login(String usernam, String passwor) {
		
		username.sendKeys(usernam);
		password.sendKeys(passwor);
		loginbtn.click();}
		
		
	

	public void logins(String username, String password) {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();	
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		driver.close();
			
		
	}
	
}
