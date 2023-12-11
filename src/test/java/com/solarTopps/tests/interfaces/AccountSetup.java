package com.solarTopps.tests.interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface AccountSetup {
	
	WebDriver addNewAccount(WebDriver driver, WebDriverWait wait) throws InterruptedException;
	
	WebDriver addNewSite(WebDriver driver) throws InterruptedException;

}
