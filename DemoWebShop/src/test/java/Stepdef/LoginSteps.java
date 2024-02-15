package Stepdef;

import com.Generic.Driverutils;
import com.POM.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage lp = new LoginPage();
	
	@Given("Enter the URL")
	public void enter_the_url() {
		Driverutils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter valid username and password <{string}> and <{string}>")
	public void enter_valid_username_and_password_and(String string, String string2) {
		lp.enterUserName(string);
		lp.enterPassword(string2);
	}

	@Then("Login Successful")
	public void login_successful() {
		lp.clickLogin();
	}

}
