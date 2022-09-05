package com.selenium.pageproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class datagiven {

	WebDriver driver;
	//FindBy
	/*@FindBy(xpath ="//input[@name='txtUsername']")public WebElement username;
	
	@FindBy(xpath ="//input[@name='txtPassword']")public WebElement password;
	@FindBy(xpath ="//input[@class='button']")public WebElement loginbtn;*/
	
	//samplemevenproject1

	
	
	public datagiven(WebDriver driver) throws IOException{
		
    	 this .driver=driver;
    	 PageFactory.initElements(driver, this);
    	 
    	
	}	
	public void open() throws IOException {
		
		/*username.sendKeys("Admin");
		
		password.sendKeys("admin123");
		
		loginbtn.click();*/
		
		
	   	 Actions action= new Actions(driver);
    
   
    action.moveToElement(driver.findElement(By.xpath("//a[@data-nav-role='signin']"))).build().perform();
	
	WebElement men=driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"));

	action.click(men).build().perform();
	
	 File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrfile, new File("C:\\Users\\ravit\\Dropbox\\Screenshots\\fullscreenshort101.jpg"));	 

		
		
	}
	
}
