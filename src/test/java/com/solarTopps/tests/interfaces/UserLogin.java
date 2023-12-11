package com.solarTopps.tests.interfaces;

import org.openqa.selenium.WebDriver;

public interface UserLogin {
	
	WebDriver adminLogin(WebDriver driver);
	WebDriver dealerLogin(WebDriver driver);
	WebDriver ecLogin(WebDriver driver);
	WebDriver orderAdminLogin(WebDriver driver);
	WebDriver orderUserLogin(WebDriver driver);
	WebDriver drmLogin(WebDriver driver);
}
