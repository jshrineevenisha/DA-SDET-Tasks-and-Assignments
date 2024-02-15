package com.Test;
import org.testng.annotations.Test;
import com.Generic.Driverutils;
import com.POM.AdminPage;
import com.POM.LoginPage;
public class AdminTest {
	@Test
	public void verifyAdmin() {
		Driverutils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		AdminPage ap = new AdminPage();
		LoginPage lp = new LoginPage();
		//Admin Module
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
		ap.clickAdmin();
		ap.clickAdd();
	}
}
