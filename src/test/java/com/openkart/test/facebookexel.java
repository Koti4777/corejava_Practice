package com.openkart.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class facebookexel {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  FileInputStream fis=new FileInputStream("C:\\Users\\ravit\\Downloads\\saifile.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		String username=sheet.getRow(0).getCell(1).getStringCellValue();
		String password=sheet.getRow(1).getCell(1).getStringCellValue();
		String userxpath=sheet.getRow(2).getCell(1).getStringCellValue();
		String passxpath=sheet.getRow(3).getCell(1).getStringCellValue();
		String loginxpath=sheet.getRow(4).getCell(1).getStringCellValue();
		String forgetxpath=sheet.getRow(5).getCell(1).getStringCellValue();
		String conxpath=sheet.getRow(6).getCell(1).getStringCellValue();
		System.out.println(password);
		
		 System.setProperty("webdriver.edge.driver","C:\\Users\\ravit\\Downloads\\edgedriver\\msedgedriver.exe");
	     driver=new EdgeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(userxpath)).sendKeys(username);
		driver.findElement(By.xpath(passxpath)).sendKeys(password);
		driver.findElement(By.xpath(loginxpath)).click();
		driver.findElement(By.xpath(forgetxpath)).click();
		driver.findElement(By.xpath(conxpath)).click();
		//driver.close();
		
  }
}
