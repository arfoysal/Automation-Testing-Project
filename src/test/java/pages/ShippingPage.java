package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class ShippingPage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	@Step("Click on Go to shipping page button and wait for page load")
	public void goToSippingPage() {
		clickOnButton(lc.clickGoToShippingPageBy);
		time.waitForPageLoad();
	}
	@Step("Collect actual current page title ")
	public String pageTitle() {
		return getTitle();
	}
	@Step("Fill up the delivery information form with book recipient information")
	public void fillUpForm() {
		sendText(lc.customer_name, lc.customer_nameText);
		sendText(lc.phoneNumber, lc.phoneNumberText);
		//clickOnButton(lc.selectCountry);
		///selectitem(lc.selectCountry, lc.cityName);
		time.timeOut();
		clickOnButton(lc.selectCity);
		selectitem(lc.selectCity, lc.cityName);
		time.timeOut();
		clickOnButton(lc.selectArea);
		selectitem(lc.selectArea, lc.areaName);
		time.timeOut();
		clickOnButton(lc.selectZone);
		selectitem(lc.selectZone, lc.zoneName);
		time.timeOut();
		sendText(lc.address, lc.addressText);
		time.timeOut();
		clickOnButton(lc.paymentCOD);
		time.timeOut();
	}
	@Step("Check actual input text in  {0} field ")
	public String formInputfieldvalue(String name,By element) {
		return getAttributeValue(element, "value");
	}
	
	@Step("Check actual info in  {0} field ")
	public String formfiledStatus(String fieldname, By elemnt) {
		return currentlySelecteditem(elemnt);
	}
	@Step("Scroll down to Confirm order button and higlight it")
	public void scrolldown() {
		scorllToElement(lc.confirm_Order);
		time.timeOut();
		highlighter(lc.confirm_Order);
		time.timeOut(5000);
		
	}
	

}
