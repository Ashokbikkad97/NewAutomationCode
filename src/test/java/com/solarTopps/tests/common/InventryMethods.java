package com.solarTopps.tests.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.solarTopps.tests.Login.Login;

public class InventryMethods {
	
	public WebDriver addModule(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		WebElement clickOnInventry= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"10\"]/a"))); 
		clickOnInventry.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sidebar-main\"]")).click();
		return driver;
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Soft for EC\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Login obj = new Login();
		obj.adminLogin(driver);
		WebDriver loggedInDriver = obj.adminLogin(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		InventryMethods inv=new InventryMethods();
		inv.addModule(loggedInDriver, wait);
	}

}
