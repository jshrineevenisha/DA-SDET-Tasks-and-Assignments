package com.Test;

import org.testng.annotations.Test;

import com.Generic.Driverutils;
import com.POM.PIMPage;
import com.POM.AdminPage;
public class PIMTest {
	@Test
	public void verifyPIM() {
		Driverutils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		PIMPage pp = new PIMPage();
		pp.enterUserName("Admin");
		pp.enterPassword("admin123");
		pp.clickLogin();
		pp.clickPIM();
		pp.clickAddPim();
		pp.enterFName("Shrinee");
		pp.enterMName("J");
		pp.enterLName("Venisha");
		pp.savePim();
	}
}
