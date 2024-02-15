package com.DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	@FindBy(xpath="//a[contains(text(), 'Log in')]")
	public WebElement buttonLogin;
	
	@FindBy(name="Email")
	public WebElement email;
	@FindBy(name="Password")
	public WebElement password;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	public WebElement buttonLogin2;
	
	// books
	@FindBy(css = "a[href='/books']")
    private WebElement booksLink;
	    
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	private WebElement computingAndInternetLink;
  
	@FindBy(css = "input[value='Add to cart']")
	private WebElement addToCartButton;
	    
	@FindBy(xpath = "//a[@href='/cart']")
	private WebElement shoppingCartButton;
	
	@FindBy(id="termsofservice")
	private WebElement tos;
	
	@FindBy(id="checkout")
	private WebElement chkout;
	
	// initialization
	public SigninPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickLogin() {
		buttonLogin.click();
	}
	public void enterEmail(String str) {
		email.sendKeys(str);
	}
	public void enterPassword(String str) {
		password.sendKeys(str);
	}
	public void clickLogin2() {
		buttonLogin2.click();
	}
	public void clickBooksLink() {
	        booksLink.click();
	}
	public void clickComputingAndInternetLink() {
	     computingAndInternetLink.click();
	}
	public void clickAddToCartButton() {
	     addToCartButton.click();
	}
    public void clickShoppingCartButton() {
       shoppingCartButton.click();
    }
    public void clickTOS() {
    	tos.click();
    }
    public void clickCheckOut() {
    	chkout.click();
    }
}
