package pages;


import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;
import model.Timeout;

public class HomePage extends CommonMethods{
	Locators lc =  new Locators();
	Timeout time = new Timeout();
	
	@Step("Collect actual current page URL")
	public String getCurrentUrl() {
		return currentPageUrl();
		
	}
	
	@Step("Collect actual current page title ")
	public String pagetitle() {
		return getTitle();
	}
	
	@Step("Close home page popup banner")
	public void closePopupBannaer() {
		time.timeOut(5000);
		try {
			clickOnAButtonJs(lc.hompagePopupBannarJs);
		} catch (Exception e) {
			System.out.println("Pop up is not present");
		}
		time.timeOut();
	}
}
