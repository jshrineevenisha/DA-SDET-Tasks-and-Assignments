package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LeavePage extends BasePage{
// Login Module
			@FindBy(name="username")
			public WebElement textUsername;
			
			@FindBy(name="password")
			public WebElement textPassword;
			
			@FindBy(xpath="//button[@type='submit']")
			public WebElement buttonLogin;
			
// Leave module
			@FindBy(xpath="//span[text()='Leave']")
			public WebElement leaveMod;
			
//			@FindBy(xpath = "//span[text()='Scheduled ']")
//			public WebElement leaveStatus;
//			Select objSelect = new Select(driver.findElement(By.xpath("[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]")));
//			objSelect.selectByValue("Rejected ");

			@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]")
			public WebElement leaveSubmit;
			
			public void enterUserName(String str) {
				textUsername.sendKeys(str);
			}
			public void enterPassword(String str) {
				textPassword.sendKeys(str);
			}
			public void clickLogin() {
				buttonLogin.click();
			}
			public void clickLeave() {
				leaveMod.click();
			}
			//String optionValue
//			public void selectLeaveStatus() {
//				WebElement selectElement = leaveStatus.findElement(By.xpath("ancestor::select"));
//		        Select dropdown = new Select(selectElement);
//		        leaveStatus.click();
////		        Select dropdown = new Select(leaveStatus);
////		        dropdown.selectByValue("Rejected ");
//		    }
			public void searchLeave() {
				leaveSubmit.click();
			}
}
