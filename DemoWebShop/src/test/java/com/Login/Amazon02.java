package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
public class Amazon02 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");

//        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        // Perform a right-click using the Robot class
//        Robot robot = new Robot();
//        robot.mouseMove(searchBox.getLocation().getX() + 5, searchBox.getLocation().getY() + 5);
//        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); // Right-click
//        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        
        Robot robot = new Robot();
        // Pressing the right click - shift+F10
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_F10);
        robot.keyRelease(KeyEvent.VK_F10);
        robot.keyRelease(KeyEvent.VK_SHIFT);

       
        Thread.sleep(2000);

        // pressing the down arrow key
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
       
        Thread.sleep(2000);

    
}

}
