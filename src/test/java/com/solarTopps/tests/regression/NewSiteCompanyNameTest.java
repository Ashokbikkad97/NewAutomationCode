package com.solarTopps.tests.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.solarTopps.tests.Login.Login;
import com.solarTopps.tests.common.Account;
import com.solarTopps.tests.common.RandomStr;


public class NewSiteCompanyNameTest {
	public static void main(String[] args) throws InterruptedException {
		RandomStr ranStr = new RandomStr();
		System.setProperty("webdriver.chrome.driver", "D:\\Soft for EC\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Login obj = new Login();

		obj.dealerLogin(driver);
		WebDriver loggedInDriver = obj.dealerLogin(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement popup = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']")));
		popup.click();
		Thread.sleep(2000);
		WebElement accounts = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/div/div/ul/li[2]")));
		accounts.click();
		Thread.sleep(3000);
		// Add New Account
		Account account = new Account();
		account.addNewAccount(loggedInDriver, wait);
//
//		Thread.sleep(1000);
//		accounts.click();
		Thread.sleep(1000);
		// click on any customer account to nevigate to account
		//WebElement clickOnAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Vishal  Krishna']")));
		//clickOnAccount.click();

//			Add New site
		//account.addNewSite(loggedInDriver);
	}

}
