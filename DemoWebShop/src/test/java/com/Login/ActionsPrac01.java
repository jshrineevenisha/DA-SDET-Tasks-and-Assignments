package com.Login;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPrac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//driver.get("https://demowebshop.tricentis.com/fiction");
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
	//WebElement element=	driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	//WebElement elementToRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement  elementToDblClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//WebElement element1 = driver.findElement(By.id("todrag"));// //span[contains(text(), 'Draggable')][1]
	//WebElement element2 = driver.findElement(By.id("mydropzone"));// 
	 
	Actions act=new Actions(driver);
	 
	// to hover over an element----------works
	//act.moveToElement(element).build().perform();
	
	// Context click(right-click) action----works
    //act.contextClick(elementToRightClick).build().perform();
    
    // double click-----works
    act.doubleClick(elementToDblClick).build().perform();

	//drag and drop
	//act.dragAndDrop(element1, element2).build().perform();
	
	// switching to alert
	driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	System.out.println("OK button in Alert is clicked");
	//a.dismiss();

	}

}
