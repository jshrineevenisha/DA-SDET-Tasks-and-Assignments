package com.Login;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AmazonTest01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(35000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("mobile");
		
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(), '10000')]"));
		
		Thread.sleep(5000);
		int count = suggestions.size();
		System.out.println(count);
		
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 1);
		for (int i=0; i<count; i++)
		{
			WebElement suggestion=suggestions.get(i);
			String text=suggestion.getText();
			System.out.println(text);
			
			if(text.equals("under 10000"))
			{
				suggestion.click();
				wait.until(ExpectedConditions.titleContains("10000"));
				System.out.println("Product Loaded");
				//break;
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[alt*='itel P55 5G']")));
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'itel S23 (8GB RAM + 128GB ROM, Up to 16GB RAM with Memory Fusion | 50MP AI Dual Rear Camera | 5000mAh Battery with Type-C Charging | 90 Hz Display) - Mystery White']")));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'itel')][3]")));
				driver.findElement(By.xpath("//span[contains(text(), 'itel')][3]")).click();
				System.out.println("product clicked");
												
				// helps in getting the window handle(unique address) of the current window
				String parent_handle= driver.getWindowHandle();
				System.out.println(parent_handle);
				//helps in getting the handles of all the windows opened
				Set<String> handles = driver.getWindowHandles();
				System.out.println(handles);
				
				for(String handle1:handles)
				    if(!parent_handle.equals(handle1))
				    {
				        driver.switchTo().window(handle1);
				        break;
				    }
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='add-to-cart-button'])")));
				driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])")).click();
				
				
				// proceed to checkout
				Thread.sleep(3000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='proceedToRetailCheckout'])")));
				//driver.findElement(By.xpath("(//input[@name='proceedToRetailCheckout'])")).click();
				driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
				
				// use this address
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(span[@id='shipToThisAddressButton'])")));
				driver.findElement(By.xpath("(span[@id='shipToThisAddressButton'])")).click();
				
				
				//changing the payment method
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='payChangeButtonId']")));
				driver.findElement(By.xpath("//a[@id='payChangeButtonId']")).click();
				
				//chosing the credit card radio button
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pp-Z5VAQt-97']")));
				driver.findElement(By.xpath("//input[@id='pp-Z5VAQt-97']")).click();
				
				// choosing credit card
				//driver.switchTo().frame();
				driver.findElement(By.id("pp-ru7Gmr-16")).sendKeys("1234 4567 7889 5678");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='pp-Z5VAQt-100']")));
				driver.findElement(By.xpath("//a[@id='pp-Z5VAQt-100']")).click();
				
				
			}
			
		}
	}

}
//driver.findElement(By.xpath("//p[text()='P55 5G | Dimensity 6080 | 12GB* RAM+128GB ROM with Memory Fusion| 50MP AI Dual Rear Camera| 5000mAh Battery | 2 Years Warranty | Mint Green']")).click();
























//package com.login;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class amazonNewTab {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		// login in to amazon 
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(28000);
//		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 11);
//		/*
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pintola peanut butter ");
//		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//div[@role='button']"));
//        for (WebElement suggestion : suggestions) {
//            System.out.println(suggestion.getText());
//        }
//
//        // Click on the option containing "pintola peanut butter 1_kg crunchy"
//        for (WebElement suggestion : suggestions) {
//            if (suggestion.getText().contains("pintola peanut butter 1_kg crunchy")) {
//                suggestion.click();
//                break;
//            }
//        }
//        */
//		
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pintola peanut butter 1_kg crunchy");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		
//		//new page containing target product
//		driver.findElement(By.xpath("//img[@class='s-image']")).click();
//		
//		// navigating to new page 
//				String parent_handle= driver.getWindowHandle();
//				System.out.println(parent_handle);
//				Set<String> handles = driver.getWindowHandles(); // parentid,childid,subchild
//				System.out.println(handles);
//					
//				for(String handle1:handles)
//				    if(!parent_handle.equals(handle1))
//				    {
//				        driver.switchTo().window(handle1);
//				        break;
//				}
//		// adding to cart
//		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		//clicking proceed to check out 
//		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
//		
//		//changing the payment method
//		driver.findElement(By.xpath("//a[@id='payChangeButtonId']")).click();
//		
//		//choosing the credit card radio button
//		wait.until(ExpectedConditions.titleContains("Amazon.in Checkout"));
//		driver.findElement(By.xpath("//input[@name='ppw-instrumentRowSelection']")).click();
//		wait.until(ExpectedConditions.titleContains("Amazon.in Checkout"));
//		//clicking enter card details button
//		driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")).click();
//		wait.until(ExpectedConditions.titleContains("Amazon.in Checkout"));
//		//getting into frame via code and entering details
//		driver.switchTo().frame(0);
//		System.out.println("Frame switched");
//		driver.findElement(By.xpath("//input[@class='a-input-text a-form-normal pmts-account-Number']")).sendKeys("123254");
//		
//		// changing the expiry date 
//		WebElement element1=driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
//		Select sel=new Select(element1);
//		sel.selectByVisibleText("04");
//		WebElement element2 = driver.findElement(By.xpath("//span[@id=\"pp-ns2ywO-23\"]/span/span]"));
//		Select sel2=new Select(element2);
//		sel2.selectByVisibleText("2026");
//		
//		driver.findElement(By.xpath("//button[@id=\"pp-jyjhy6-25-announce\"]")).click();
//		
//		//switching to main page
//		driver.switchTo().defaultContent();
//	}
//
//}