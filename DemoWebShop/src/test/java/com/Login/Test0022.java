package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		12. How to switch from child frame to main frame
		driver.get("file:///C:/Users/ADMIN/Desktop/Page1.html");
		driver.findElement(By.id("fn")).sendKeys("Shrinee");
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("abc");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("def");
	}

}
