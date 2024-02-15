package com.DemoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OHRM.LoginPage;

public class DemoWebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		SigninPage log = new SigninPage(driver);
		
		log.clickLogin();
		log.enterEmail("jshrineev19@gmail.com");
		log.enterPassword("jsv19*");
		log.clickLogin2();
		
		// clicking on books
        log.clickBooksLink();
        log.clickComputingAndInternetLink();
        log.clickAddToCartButton();
        log.clickShoppingCartButton();
        log.clickTOS();
        log.clickCheckOut();

	}

}
