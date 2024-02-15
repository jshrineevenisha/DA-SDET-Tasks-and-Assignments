package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage extends BasePage {
// Login Module
		@FindBy(name="username")
		public WebElement textUsername;
		
		@FindBy(name="password")
		public WebElement textPassword;
		
		@FindBy(xpath="//button[@type='submit']")
		public WebElement buttonLogin;

// PIM Module	
		@FindBy(xpath="//span[text()='PIM']")
		public WebElement pimMod;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
		public WebElement addPim;
		@FindBy(name="firstName")
		public WebElement fname;
		@FindBy(name="middleName")
		public WebElement mname;
		@FindBy(name="lastName")
		public WebElement lname;
		@FindBy(xpath="//button[@type='submit']")
		public WebElement savePim;
		
		public void clickPIM() {
		pimMod.click();
	}
		public void enterUserName(String str) {
			textUsername.sendKeys(str);
		}
		public void enterPassword(String str) {
			textPassword.sendKeys(str);
		}
		public void clickLogin() {
			buttonLogin.click();
		}
	public void clickAddPim() {
		addPim.click();
	}
	public void enterFName(String str) {
		fname.sendKeys(str);
	}
	public void enterMName(String str) {
		mname.sendKeys(str);
	}
	public void enterLName(String str) {
		lname.sendKeys(str);
	}
	public void savePim() {
		savePim.click();
	}
}
