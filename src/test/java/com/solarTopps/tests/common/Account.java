package com.solarTopps.tests.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.solarTopps.tests.interfaces.AccountSetup;


public class Account implements AccountSetup {

	public WebDriver addNewAccount(WebDriver driver, WebDriverWait wait) throws InterruptedException {

		RandomStr ranStr = new RandomStr();

		WebElement addNewButton = driver.findElement(By.xpath("(//button[@type='button'])[8]"));
		addNewButton.click();

		WebElement firstName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
		firstName.sendKeys(ranStr.randomString(7));

		WebElement lastName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']")));
		lastName.sendKeys(ranStr.randomString(5));

		WebElement email = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		email.sendKeys(ranStr.randomString(4) + "@mailinator.com");
		WebElement cell = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='value']")));
		cell.sendKeys(ranStr.randomInteger(10));
		Thread.sleep(2000);

//		/*=========  Select title from dropDown  =======*/
//        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[3]/div[3]/div[4]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div[10]/div/div/div/div[1]")));
//        Actions actions = new Actions(driver);
//        actions.click(title).sendKeys("Owner").perform();
//        WebElement ownerOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Owner')]")));
//        ownerOption.click();

		WebElement clickOnSave = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[3]/div[3]/div[4]/div/div[3]/button[2]")));
		clickOnSave.click();
		return null;
	}

	
	public WebDriver addNewSite(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions actions = new Actions(driver);

		WebElement site = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div/div[1]/div[3]/button[1]/img")));
		site.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='COMMERCIAL']")).click();
		WebElement siteName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id='app']/div[3]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[1]/ul[1]/li/div[2]/form/div/input")));
		RandomStr ranStr = new RandomStr();
		siteName.sendKeys(ranStr.randomString(12));
		Thread.sleep(3000);

		WebElement siteAddress = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='autocomplete']")));
		siteAddress.sendKeys(ranStr.randomInteger(3));
		Thread.sleep(2000);

		actions.sendKeys(siteAddress, "\uE015" + "\uE015").perform();
		actions.click(siteAddress);
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id='app']/div[3]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/h6"))
				.click();
		Thread.sleep(2000);

		WebElement bill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[@id='app']/div[3]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/ul[3]/li[1]/div[2]/div/input")));
		RandomStr ranInt = new RandomStr();
		bill.sendKeys(ranInt.randomInteger(4));
		Thread.sleep(2000);

		WebElement clickOnAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='app']/div[3]/div[3]/div[2]/div/div[3]/div/div[3]/button[2]")));
		clickOnAdd.click();
		return driver;
	}

}
