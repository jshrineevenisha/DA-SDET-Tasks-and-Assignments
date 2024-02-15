package com.Login;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		// Find and click on the "Search" option
		driver.findElement(By.xpath("*[@id='top-banner']/div[2]/div/div/div/div[2]/p/a")).click();
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//search.click();

		// Find the departure date field
		WebElement departureDateField = driver.findElement(By.id("departure"));

		// Get today's date
		Date today = (Date) Calendar.getInstance().getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String todayDate = dateFormat.format(today);

		// Set today's date in the departure date field
		departureDateField.sendKeys(todayDate);
	}
}
