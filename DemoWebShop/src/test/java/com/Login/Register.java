package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://demowebshop.tricentis.com/");
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());

		driver.get("https://demowebshop.tricentis.com/register");
		//driver.get("https://demowebshop.tricentis.com/registerresult/1");
		// Using Locators
		//driver.findElement(By.xpath("//button[@id='gender-female']")).click();
		//driver.findElement(By.xpath("//button[@type='radio']")).click();
		//driver.findElement(By.xpath("//p[text()='Female']")).click();
		//driver.findElement(By.xpath("//button[@for='gender-female]")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Shrine");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("VJ");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shrinee@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("jsv916*");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("jsv916*");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
}
