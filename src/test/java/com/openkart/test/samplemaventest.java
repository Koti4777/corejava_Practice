package com.openkart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.selenium.pageproject.loginpage;

public class samplemaventest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		loginpage weblogin=new loginpage(driver);
		
		weblogin.login("vinay","1234");
		
		
		
		
		
	}
	

}


