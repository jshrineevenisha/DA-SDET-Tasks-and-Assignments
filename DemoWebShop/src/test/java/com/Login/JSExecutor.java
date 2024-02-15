package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/JSExec.html");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		String stmt="document.getElementById('n').value='Shrinee'";
		j.executeScript(stmt);
		
		Thread.sleep(3000);
		String stmt1="document.getElementById('n').value=''";
		j.executeScript(stmt1);
		
		// isEnabled()
		Thread.sleep(3000);
		boolean eleEnabled= driver.findElement(By.id("n")).isEnabled();
		System.out.println("Since value is replaced with null, value is "+ eleEnabled);
		
		// isSelected()
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		boolean elePresent = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		System.out.println("Radio button clicked: "+elePresent);
		
		Thread.sleep(3000);
		String click="document.getElementById('g').click()";
		j.executeScript(click);

	}

}
