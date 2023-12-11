package com.solarTopps.tests.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.solarTopps.tests.Login.Login;
import com.solarTopps.tests.common.InventryMethods;

public class Inventry {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Soft for EC\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Login login = new Login();
		login.adminLogin(driver);
		WebDriver loggedInDriver = login.adminLogin(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		InventryMethods inv=new InventryMethods();
		inv.addModule(loggedInDriver, wait);
	}
}
