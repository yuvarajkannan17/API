package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\yuvarajkannan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 1; i <= rows.size(); i++) {
			WebElement element = rows.get(i);
			List<WebElement> list = element.findElements(By.tagName("td"));
		//	for (int j = list.size(); j <= list.size(); j++) {
				WebElement element2 = list.get(0);
				String text = element2.getText();
				System.out.println(text);
			
		
		}
	}
}
