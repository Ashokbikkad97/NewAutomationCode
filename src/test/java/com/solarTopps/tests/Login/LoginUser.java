package com.solarTopps.tests.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.solarTopps.tests.interfaces.Config;
import com.solarTopps.tests.interfaces.UserLogin;

public class LoginUser implements UserLogin {

  
	
	public WebDriver adminLogin(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://dev.solartopps.com/");
		driver.manage().window().maximize();
		WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/input")));
		userName.sendKeys(Config.admin);
		WebElement pass= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/div/div/input[1]")));
		pass.sendKeys(Config.AdminPass);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[4]/button")));
		login.click();
		return driver;
	}

	
	public WebDriver dealerLogin(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://dev.solartopps.com/");
		driver.manage().window().maximize();
		
		WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/input")));
		userName.sendKeys(Config.dealer);
		WebElement pass= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/div/div/input[1]")));
		pass.sendKeys(Config.pass);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[4]/button")));
		login.click();
		return driver; // Return the WebDriver instance after login
	}

	
	public WebDriver orderAdminLogin(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://dev.solartopps.com/");
		driver.manage().window().maximize();
		WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/input")));
		userName.sendKeys(Config.orderAdmin);
		WebElement pass= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/div/div/input[1]")));
		pass.sendKeys(Config.pass);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[4]/button")));
		login.click();
		return driver;
	}

	public WebDriver drmLogin(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://dev.solartopps.com/");
		driver.manage().window().maximize();
		WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/input")));
		userName.sendKeys(Config.DRM);
		WebElement pass= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/div/div/input[1]")));
		pass.sendKeys(Config.DRMpass);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[4]/button")));
		login.click();
		return driver;
	}

	
	public WebDriver ecLogin(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://dev.solartopps.com/");
		driver.manage().window().maximize();
		WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/input")));
		userName.sendKeys(Config.ec);
		WebElement pass= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/div/div/input[1]")));
		pass.sendKeys(Config.pass);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[4]/button")));
		login.click();
		return driver;
	}

	
	public WebDriver orderUserLogin(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://dev.solartopps.com/");
		driver.manage().window().maximize();
		WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/input")));
		userName.sendKeys(Config.orderUser);
		WebElement pass= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/div/div/input[1]")));
		pass.sendKeys(Config.pass);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[4]/button")));
		login.click();
		return driver;
	}

}
