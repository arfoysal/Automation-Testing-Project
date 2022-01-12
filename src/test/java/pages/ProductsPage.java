package pages;

import org.openqa.selenium.By;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class ProductsPage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	@Step("Hover on the লেখক button then click the হুমায়ূন আহমেদ button")
	public void selectWriter() {
		hover(lc.writerButton);
		clickOnButton(lc.writerName);
		time.timeOut();
	}
	@Step("Collect actual current page title ")
	public String pageTitle() {
		return getTitle();
	}
	
	@Step("Collect actual current {1} ")
	public String text(By element, String name) {
		return getText(element);
	}
	
	@Step("Filter categories based on সমকালীন উপন্যাস & রচনা সংকলন ও সমগ্র")
	public void  filterByCategories() {
		listitem(lc.filterCategoriesList, lc.categorySomokalinText);
		time.timeOut();
		listitem(lc.filterCategoriesList, lc.categoryStoryCollectionText);
		time.timeOut();
	}
	
	@Step("Check actual category select status of {0}")
	public boolean filterStatus(String text, String value) {
		return itemSelecteStatus(lc.checkfilterCatagoriesList, value);
	}
	
	@Step("Scroll down to page numbers and browse to the next page")
	public void scrollAndGotoNextPage() {
		scorllToElement(lc.nextPageButton);
		time.timeOut(4000);
		clickOnButton(lc.nextPageButton);
		time.waitForPageLoad();
	}
	
	@Step("Add to cart the selected 4th book")
	public void selectBook() {
		clickOnAButtonJs(lc.addtocardFortThItemJs);
		time.timeOut(1000);
	}	
	
}
