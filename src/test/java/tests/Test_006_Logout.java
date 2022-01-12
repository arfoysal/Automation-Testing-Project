package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import io.qameta.allure.Description;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.Logout;

public class Test_006_Logout extends BaseDriver{
	
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	Logout logout = new Logout();
	@Test(description = "Sign Out from rokomari.com")
	@Description("Test Description: This test will try to Sign Out from rokomari.com")
	public void logoutTest() throws IOException {
		 logout.clickSignOut();
		 screenshot.takeScreenShot("After Sign Out");
	}
}
