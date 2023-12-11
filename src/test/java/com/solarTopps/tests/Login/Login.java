package com.solarTopps.tests.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.solarTopps.tests.interfaces.Config;
import com.solarTopps.tests.interfaces.UserLogin;

public class Login implements UserLogin {
	public WebDriver performLogin(WebDriver driver, String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://dev.solartopps.com/");

		WebElement userName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[2]/div[2]/div[1]/div[1]/div/input")));
		userName.sendKeys(username);
		WebElement pass = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[2]/div[2]/div[1]/div[2]/div/div/input[1]")));
		pass.sendKeys(password);
		WebElement login = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[2]/div[2]/div[1]/div[4]/button")));
		login.click();
		return driver;
	}

	public WebDriver adminLogin(WebDriver driver) {
		return performLogin(driver, Config.admin, Config.AdminPass);
	}

	public WebDriver dealerLogin(WebDriver driver) {
		return performLogin(driver, Config.dealer, Config.pass);
	}

	public WebDriver orderAdminLogin(WebDriver driver) {
		return performLogin(driver, Config.orderAdmin, Config.pass);
	}

	public WebDriver drmLogin(WebDriver driver) {
		return performLogin(driver, Config.DRM, Config.DRMpass);
	}

	public WebDriver ecLogin(WebDriver driver) {
		return performLogin(driver, Config.ec, Config.pass);
	}

	public WebDriver orderUserLogin(WebDriver driver) {
		return performLogin(driver, Config.orderUser, Config.pass);
	}
}
