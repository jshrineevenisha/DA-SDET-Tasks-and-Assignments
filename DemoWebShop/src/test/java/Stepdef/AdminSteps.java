package Stepdef;

import com.POM.AdminPage;

import io.cucumber.java.en.Then;

public class AdminSteps {
	AdminPage ap = new AdminPage();
	@Then("Click Admin")
	public void click_admin() {
		ap.clickAdmin();
	}

	@Then("Admin Clicked")
	public void admin_clicked() {
		System.out.println("Successful");
	}

}
