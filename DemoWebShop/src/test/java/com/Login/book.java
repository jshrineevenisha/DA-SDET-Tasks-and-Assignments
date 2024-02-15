package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class book {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/books");
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		//driver.findElement(By.xpath("//p[text()='shopping cart']")).click();// doubt
		driver.findElement(By.xpath("//a[contains(text()='shopping cart')]")).click();
				
	}
}
