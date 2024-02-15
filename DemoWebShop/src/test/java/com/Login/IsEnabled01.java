package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled01 {
	 public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	    driver.get("https://www.amazon.in");
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    searchBox.click();
        if (searchBox.isEnabled()) {
            System.out.println("Search box is enabled.");
        } else {
            System.out.println("Search box is not enabled.");
        }
	 }
}
