package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Generic.Driverutils;
import com.POM.LoginPage;

public class LoginTest {
//
//	@Test(alwaysRun=true)
//	public void verifyTest() {
//		Driverutils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		LoginPage lp = new LoginPage();
//		// login
//		lp.enterUserName("Admin");
//		lp.enterPassword("admin123");
//		lp.clickLogin();
//	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] Data=new Object[2][2];
		Data[0][0]="Admin";
		Data[0][1]="admin123";
		Data[1][0]="UserB";
		Data[1][1]="PassB";
		return Data;
	}
	@Test(dataProvider="getData")
	public void test(String un,String pw)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       			
		//Reporter.log(un + "" + pw,true);
	}	
//	@Test(groups="abc")
//	@Parameters({"a", "b"})
//	public void method1(String a, String b) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//	
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		
//        driver.findElement(By.name("username")).sendKeys(a);
//        driver.findElement(By.name("password")).sendKeys(b);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}

}
