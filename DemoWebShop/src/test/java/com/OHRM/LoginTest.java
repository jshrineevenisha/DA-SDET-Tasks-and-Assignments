package com.OHRM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		LoginPage log = new LoginPage(driver);
		
		log.enterUserName("Admin");
		log.enterPassword("admin123");
		log.clickLogin();
		System.out.println("Logged In");
		Thread.sleep(3000);
		log.clickAdmin();
		System.out.println("Admin Clicked");
		Thread.sleep(3000);
		log.clickAdd();
		System.out.println("Add Clicked");
		Thread.sleep(3000);
		log.clickPIM();
		System.out.println("PIM Clicked");
		Thread.sleep(3000);
		log.clickAddPim();
		System.out.println("Add in PIM Clicked");
		Thread.sleep(3000);
		log.enterFName("Shrinee");
		log.enterMName("Venisha");
		log.enterLName("J");
		Thread.sleep(3000);
		log.savePim();
	}

}
