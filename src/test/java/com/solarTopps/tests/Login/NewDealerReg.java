package com.solarTopps.tests.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.solarTopps.tests.common.RandomStr;
import com.solarTopps.tests.interfaces.Config;

public class NewDealerReg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(Config.driver, Config.path);

		WebDriver driver = new ChromeDriver();

		driver.get(Config.url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/p/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[1]/ul/li[2]/div/div")).click();
		Thread.sleep(3000);
		
		RandomStr str=new RandomStr();
		WebElement businessName = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[1]/div[1]/form/div/input"));
		businessName.sendKeys(str.randomString(15));

		WebElement ein = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div/form/div/input"));
		ein.sendKeys(str.randomInteger(10));	

		WebElement service = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[6]/div[2]/input"));
		service.click();

		WebElement firstName = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[7]/div[1]/form/div/input"));

		firstName.sendKeys(str.randomString(10));

		WebElement lastName = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[7]/div[2]/form/div/input"));
		lastName.sendKeys(str.randomString(5));

		WebElement email = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[8]/div[1]/form/div/div/input"));
		email.sendKeys(str.randomString(4)+"@mailinator.com");

		WebElement phone = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[8]/div[2]/div/form/div/input"));
		phone.sendKeys(str.randomInteger(10));

		WebElement scrollDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/div/div[1]/div[9]/h5"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollDown);
//		Actions act = new Actions(driver);
//		act.moveToElement(scrollDown, 0, 500);

		WebElement clickCaptcha = driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[2]"));

		clickCaptcha.submit();

		// WebElement img =
		// driver.findElement(By.xpath("//*[@id=\"rc-imageselect-target\"]/table/tbody/tr[2]/td[2]/div/div[1]/img"));

		// Thread.sleep(3000);
	}
}
