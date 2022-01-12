package pages;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class MyCartPage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	@Step("Click on My Cart Icon and wait for page load")
	public void goToMycartPage() {
		clickOnButton(lc.clickCardButton);
		time.waitForPageLoad();
	}
	
	@Step("Collect actual current page URL")
	public String getCurrentUrl() {
		return currentPageUrl();
	}
	
	@Step("Collect actual current page title ")
	public String pageTitle() {
		return getTitle();
	}
	
}
