package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonScroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.amazon.in/");
			Thread.sleep(30000);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.name("field-keywords")).sendKeys("mobile");

			WebDriverWait wait = new WebDriverWait(driver, 5);
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@aria-label='mobile under 10000']")));
			driver.findElement(By.xpath("//div[@aria-label='mobile under 10000']")).click();
			
			WebElement mobile = driver.findElement(By.xpath("//span[text()='Redmi 13C (Stardust Black, 6GB RAM, 128GB Storage) | Powered by 4G MediaTek Helio G85 | 90Hz Display | 50MP AI Triple Camera']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mobile);
			
			driver.findElement(By.xpath("//span[text()='Redmi 13C (Stardust Black, 6GB RAM, 128GB Storage) | Powered by 4G MediaTek Helio G85 | 90Hz Display | 50MP AI Triple Camera']")).click();
			
		}
}