package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import io.qameta.allure.Description;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.HomePage;

public class Test_001_HomePage extends BaseDriver{
	HomePage homePage = new HomePage();
	Timeout time = new Timeout();
	Locators lc = new Locators();
	Take_Screenshot screenshot = new Take_Screenshot();
	@Test(description = "Open rokomari.com in the browser and perform Tests")
	@Description("Test Description: Tins test will wait to completely load the home page of Rokomari "
			+ "then perform testing & take a screenshot.")
	public void homePageTest() throws IOException {
		time.waitForPageLoad();
		assertEquals(homePage.getCurrentUrl(), lc.homePageUrl);
		time.timeOut(1000);	
		assertEquals(homePage.pagetitle(), lc.homePageTitle);
		time.timeOut(1000);	
		screenshot.takeScreenShot("Homepage");
		
		homePage.closePopupBannaer();
		screenshot.takeScreenShot("Homepage");
	}

}
