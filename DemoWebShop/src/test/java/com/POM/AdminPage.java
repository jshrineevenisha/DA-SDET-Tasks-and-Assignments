package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminPage extends BasePage{
// Login Module
//		@FindBy(name="username")
//		public WebElement textUsername;
//		
//		@FindBy(name="password")
//		public WebElement textPassword;
//		
//		@FindBy(xpath="//button[@type='submit']")
//		public WebElement buttonLogin;
	
// Admin Module	
//		@FindBy(xpath="//a[@class='oxd-main-menu-item']")
		@FindBy(xpath="//span[text()='Admin']")
		public WebElement adminMod;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
		public WebElement add;
		
//		public void enterUserName(String str) {
//			textUsername.sendKeys(str);
//		}
//		public void enterPassword(String str) {
//			textPassword.sendKeys(str);
//		}
//		public void clickLogin() {
//			buttonLogin.click();
//		}

		public void clickAdmin() {
			adminMod.click();
		}
		public void clickAdd() {
			add.click();
		}
}
