package com.openkart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.selenium.pageproject.pagelogin;

public class pageloginrecive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\ravit\\\\Downloads\\\\edgedriver\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/");


driver.manage().window().maximize();

	
pagelogin page=new pagelogin(driver);

page.login("raju", "1234");
	}

}
