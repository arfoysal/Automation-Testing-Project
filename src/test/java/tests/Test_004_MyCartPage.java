package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import io.qameta.allure.Description;
import model.Locators;
import model.Take_Screenshot;
import pages.MyCartPage;

public class Test_004_MyCartPage extends BaseDriver{
	
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	MyCartPage myCartPage = new MyCartPage();
	@Test(description = "My cart page")
	@Description("Test Description: This test will try to browse to my cart page and perform tests")
	public void myCartPage() {
		
		myCartPage.goToMycartPage();
		screenshot.takeScreenShot("My Cart Page");
		assertTrue(myCartPage.getCurrentUrl().contains(lc.my_CartPageUrl));
		assertEquals(myCartPage.pageTitle(), lc.my_CartPageTitle);
		
	}
}
