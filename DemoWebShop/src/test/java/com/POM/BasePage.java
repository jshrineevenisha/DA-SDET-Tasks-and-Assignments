package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Generic.Driverutils;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage() {
		driver=Driverutils.getDriver();
		PageFactory.initElements(driver, this);
	}
}
