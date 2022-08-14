package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsConcept {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvarajkannan\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement btnCreateNwAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btnCreateNwAcc.click();
	Wait w=new FluentWait(driver).withTimeout(Duration.ofSeconds(100)).pollingEvery(Duration.ofSeconds(100))
	.ignoring(Throwable.class);

	//Object until = w.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
//	WebElement btnlogin = (WebElement)until;
	
	WebElement btnLogin=(WebElement)	w.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
	btnLogin.sendKeys("yuvaraj");
	driver.quit();
	
}
}
