package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvarajkannan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	WebElement table = driver.findElement(By.id("customers"));
	List<WebElement> tableRows = table.findElements(By.tagName("tr"));
	List<WebElement> tableData = table.findElements(By.tagName("td"));
	for (int i = 1; i <tableRows.size(); i++) {
		tableRows.get(i);
	 String text = tableData.get(i).getText();
		System.out.println(text);
	}




	driver.quit();
	
	
}
}
