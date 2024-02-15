package com.Test;
import org.testng.annotations.Test;

import com.Generic.Driverutils;
import com.POM.LeavePage;
public class LeaveTest {
	@Test
	public void verifyLeave() {
		Driverutils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LeavePage lp = new LeavePage();
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
		lp.clickLeave();
//		lp.selectLeaveStatus();
		lp.searchLeave();
	}
}
