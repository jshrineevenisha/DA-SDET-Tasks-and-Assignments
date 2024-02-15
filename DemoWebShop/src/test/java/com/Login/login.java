package com.Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("jsv19@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("jsv19*");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		// using LinkText
		driver.findElement(By.linkText("BOOKS")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("BillingNewAddress_CountryId")).click();
		WebElement selectobj=driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select drpCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		drpCountry.selectByVisibleText("India");
		
		//Billing address
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.City']")).sendKeys("Madurai");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.Address1']")).sendKeys("16 B, Adam Street");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.Address2']")).sendKeys("16 B, Adam Street");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']")).sendKeys("625016");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']")).sendKeys("6567784534");
//		driver.findElement(By.xpath("//input[@title='Continue' and @class='button-1 new-address-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();

		// Shipping address 
		Select sclDeliveryAddr = new Select(driver.findElement(By.id("shipping-address-select")));
		sclDeliveryAddr.selectByVisibleText("Shrinee Venisha J, 16 B, Adam Street, Madurai 625016, India");
		//sclDeliveryAddr.selectByIndex(0);
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		
		// Shipping method
		driver.findElement(By.id("shippingoption_2")).click();
		int a = driver.findElements(By.xpath("//input[@name='shippingoption']")).size();  
		System.out.println(a);  
        for(int i=1;i<=a;i++)  
        {  
            driver.findElements(By.xpath("//input[@name='shippingoption']")).get(2).click();  
        }  
//		driver.findElement(By.xpath("//a[contains(text(), 'Next Day Air (0.00)']")).click();
//		driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
        driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
        
        // Payment method
		driver.findElement(By.id("paymentmethod_2")).click();
		int b = driver.findElements(By.xpath("//input[@name='paymentmethod_2']")).size();  
		System.out.println(b);  
        for(int i=1;i<=b;i++)  
        {  
            driver.findElements(By.xpath("//input[@name='shippingoption']")).get(2).click();  
        }
        driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
//        radio_button = driver.findElement(By.cssSelector("#paymentmethod_2"));
//        radio_button.click();
        
        // Payment information - using tagname
        driver.findElement(By.tagName("name")).sendKeys("ShrineeJ");
        driver.findElement(By.tagName("input")).sendKeys("123445675645");
        driver.findElement(By.tagName("input")).sendKeys("123");
        driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
        
        // Confirm Order
        driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
        
        
        
        //////////////////
//      //shipping method
//        driver.findElement(By.xpath("//label[contains(text(), 'Ground (10.00)')]")).click();
//        //driver.findElement(By.xpath("//input[@title='Continue']")).click();
//        driver.findElement(By.cssSelector("input.button-1.shipping-method-next-step-button[onclick='ShippingMethod.save()']")).click();
//        //driver.findElement(By.xpath("//input[@title='Continue']")).click();
//        //payment method
//        driver.findElement(By.xpath("//input [@id=\"paymentmethod_2\"]")).click();
//        //driver.findElement(By.cssSelector("label[for='paymentmethod_0']")).click();
//        //driver.findElement(By.cssSelector("input.button-1.payment-method-next-step-button[onclick='PaymentMethod.save()']")).click();
//        //driver.findElement(By.cssSelector("input.button-1.payment-method-next-step-button[onclick='PaymentMethod.save()']")).click();
//
//        driver.findElement(By.xpath("//input[@title='Continue']")).click();
//        //payment information
//        driver.findElement(By.cssSelector("input.button-1.payment-info-next-step-button[onclick='PaymentInfo.save()']")).click();
//        //confirm order
       		
	}
}





































/////////////////////////////////////////////////		

//driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Hexaware");
//
//driver.findElement(By.id("BillingNewAddress_CountryId")).click();
//
//WebElement selectobj2=driver.findElement(By.id("BillingNewAddress_CountryId"));
//Select drpCountry2 = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
//drpCountry2.selectByVisibleText("India");
//
//driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Belgaum");
//driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Gokak");
//driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Gokak");
//driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("591308");
//driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9686816301");
//
//driver.findElement(By.xpath("//input[@title='Continue' and @class='button-1 new-address-next-step-button']")).click();

//////////////////////////////////////////////////////
