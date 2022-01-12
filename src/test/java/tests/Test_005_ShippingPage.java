package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import io.qameta.allure.Description;
import model.Locators;
import model.Take_Screenshot;
import pages.ShippingPage;

public class Test_005_ShippingPage extends BaseDriver{
	
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	ShippingPage shippingPage = new ShippingPage();
	
	@Test(description = "Shipping page test")
	@Description("Test Description: This test will try to browse to my shipping page then fill up "
			+ "the delivery information form with book recipient info ")
	public void shippingPage() {
		
		shippingPage.goToSippingPage();
		screenshot.takeScreenShot("Shipping page");
		assertEquals(shippingPage.pageTitle(), lc.shippingPageTitle);
		
		shippingPage.fillUpForm();
	
		assertEquals(shippingPage.formInputfieldvalue("name", lc.customer_name),lc.customer_nameText );
		assertEquals(shippingPage.formInputfieldvalue("phone Number", lc.phoneNumber), lc.phoneNumberText);
		assertEquals(shippingPage.formfiledStatus("country", lc.selectCountry), lc.countryName);
		assertFalse(shippingPage.formfiledStatus("country not selected one", lc.selectCountry).contains(lc.countryNameNotSelectedOne));
		assertEquals(shippingPage.formfiledStatus("city", lc.selectCity), lc.cityName);
		assertEquals(shippingPage.formfiledStatus("Area", lc.selectArea), lc.areaName);
		assertEquals(shippingPage.formfiledStatus("zone", lc.selectZone), lc.zoneName);
		
		screenshot.takeScreenShot("Shipping page after provide requre information");
		
		shippingPage.scrolldown();
		
		screenshot.takeScreenShot("Shipping page after heighlight the Confirm Order");
		
	}
}
