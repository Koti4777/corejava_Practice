package com.openkart.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import com.selenium.pageproject.pagelogin;
public class testannotationexample {
	WebDriver driver;
	@Test(priority = 0)	
 public void openurl1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravit\\Downloads\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
			
	}
	@Test(priority = 1)
	public void logins() {
		pagelogin page=new pagelogin(driver);

		page.login("raju", "1234");
		
  
	}	
	@Test(priority = 2)
	public void close() {
	
	driver.close();
	
	}
	

}
