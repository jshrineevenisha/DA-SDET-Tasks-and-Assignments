package com.Login;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice001 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		TakesScreenshot scr=(TakesScreenshot)driver;
		File src=scr.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Screenshot.png");
		FileUtils.copyFile(src, dest);

		
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("QSpiders");
		
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(), 'QSpiders')]"));
		
		Thread.sleep(5000);
		int count = suggestions.size();
		System.out.println(count);
		
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		for (int i=0; i<count; i++)
		{
			WebElement suggestion=suggestions.get(i);
			String text=suggestion.getText();
			System.out.println(text);
			
			if(text.equals("QSpiders Vadapalani"))
			{
				suggestion.click();
				wait.until(ExpectedConditions.titleContains("Vadapalani"));
				System.out.println("Page Loaded");
				break;
			}
//			System.out.println(element.getText());
			
		}
	}

}
