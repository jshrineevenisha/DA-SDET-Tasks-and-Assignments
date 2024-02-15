package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
public class Robot01 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		// A robot class is used to generate native system input events for the purpose of test automation, self-running demos, and other applications where the control of the mouse and keyboard is needed.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://demowebshop.tricentis.com/";

    	driver.manage().window().maximize();
        String elementXPath = "//input[@type='button']";

        driver.get(url);
        try {
            WebElement rightClickElement = driver.findElement(By.xpath("//input[@type='button']"));

            // Create a Robot object
            Robot robot = new Robot();

            // Create an Actions object
            Actions actions = new Actions(driver);

            // Right-click on the element
            //actions.contextClick(rightClickElement).build().perform();

            // Use the Robot class to scroll down
            //robot.keyPress(KeyEvent.VK_DOWN);
            robot.mousePress(InputEvent.BUTTON3_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_MASK);
            Thread.sleep(5000);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            
            Thread.sleep(5000);

            // Send the keyboard shortcut to open the inspect dialog
            //actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
//                             Keys.ENTER).build().perform();
//            actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
//            actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}

}
