package com.Login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//		9. Write any code and apply gettext(), getattribute()		
		WebElement element = driver.findElement(By.id("nav-cart-text-container"));
		String text = element.getText();
		System.out.println("Text of the element: " + text);
		String attributeValue = element.getAttribute("class");
		System.out.println("Value of the attribute: " + attributeValue);
		
//		10. How to use locator tag?
		driver.get("https://demowebshop.tricentis.com/");
		WebElement id = driver.findElement(By.id("bar-notification"));
		WebElement name = driver.findElement(By.className("button-1 search-box-button"));
		WebElement linktext = driver.findElement(By.linkText("/books"));
		WebElement xpath = driver.findElement(By.xpath("//button[@type='button']"));
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Link Text: " + linktext);
		System.out.println("Xpath: " + xpath);
		
//		11. How to switch from parent to child tab
		driver.get("file:///C:/Users/ADMIN/Desktop/sample01.html");
		String parent_handle= driver.getWindowHandle();
		System.out.println(parent_handle);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for(String handle1:handles)
		    if(!parent_handle.equals(handle1))
		    {
		        driver.switchTo().window(handle1);
		        break;

		}

//		12. How to switch from child frame to main frame
		driver.get("file:///C:/Users/ADMIN/Desktop/Page1.html");
		driver.findElement(By.id("fn")).sendKeys("Shrinee");
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("abc");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("def");

//		13. How to switch frame to main webpage?
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("java");
		driver.switchTo().defaultContent();

//		14. Write a code to verify if element isEnabled()?
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("Admin")).click();
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		if (submitButton.isEnabled()) {
            System.out.println("The submit button is enabled.");
        } else {
            System.out.println("The submit button is not enabled.");
        }
	}
}
