package com.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplExplSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		System.out.println(driver.getTitle());
		System.out.println("Page Loaded");
		
//		wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("Alert message pops up");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admin")));
		driver.findElement(By.linkText("Admin")).click();
		System.out.println("Admin Clickable");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='oxd-input oxd-input--active']")));
		System.out.println("Username field is Located");
		
//		driver.findElement(By.linkText("+ Add")).click();
//		wait.until(ExpectedConditions.elementSelectionStateToBe(null, false)
//		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//button[@type='button']")), false);
//		WebElement userrole = driver.findElement(By.xpath("//p[text()='User Role']"));
//		Select select = new Select(userrole);
//		select.selectByIndex(1);
//		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//option[@class='oxd-select-wrapper']"), true));
		
		//wait.until(ExpectedConditions.textToBe(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Peter F Admin"), "Peter F Admin");
		
	}

}
