package org.demo;

import java.awt.AWTException;
import java.awt.List;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException,AWTException,IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		driver.manage().window().maximize();
		java.util.List<WebElement> allRows=table.findElements(By.tagName("tr"));
		
		WebElement row =allRows.get(1);
		
		
		java.util.List<WebElement> allData = row.findElements(By.tagName("td"));
		
		
		for (int i = 0; i<allData.size(); i++) {
			WebElement data=allData.get(i);
			
			
			
			
			
			System.out.println(data.getText());
			
		}
		WebElement row1 =allRows.get(4);
		java.util.List<WebElement> allData1 = row1.findElements(By.tagName("td"));
		for (int j = 0; j < allData1.size(); j++) {
			WebElement data1=allData1.get(j);
			System.out.println(data1.getText());
	}
}
}