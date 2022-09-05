package com.openkart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.selenium.pageproject.pagelogin;

public class sampleTestNGclass {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\ravit\\\\Downloads\\\\edgedriver\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();

		
	pagelogin page=new pagelogin(driver);

	page.login("raju", "1234");
	  driver.close();
	  
  }
  
  @Test
  public void f1() {
	  
	  

	  System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\ravit\\\\Downloads\\\\edgedriver\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();

		
	pagelogin page=new pagelogin(driver);

	page.login("rao", "1478");
	  driver.close(); 
	  
	  
  }
  
  @Test
  public void f2() {
	  
	  

	  System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\ravit\\\\Downloads\\\\edgedriver\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();

		
	pagelogin page=new pagelogin(driver);

	page.login("rlaao", "14998");
	  driver.close(); 
	  
	  
  }
}
