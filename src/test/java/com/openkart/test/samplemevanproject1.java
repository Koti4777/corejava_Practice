package com.openkart.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;

import com.selenium.pageproject.datagiven;

public class samplemevanproject1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		datagiven kss=new datagiven(driver);
		kss.open();
		
	
	

	}

}
