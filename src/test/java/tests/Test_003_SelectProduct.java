package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import io.qameta.allure.Description;
import model.Locators;
import model.Take_Screenshot;
import pages.ProductsPage;

public class Test_003_SelectProduct extends BaseDriver{
	
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	ProductsPage productsPage = new ProductsPage();
	@Test(description = "Select a book by filtering writer and category")
	@Description("Test Description: This test will try to select a specific writer then perform "
			+ "filtering based on two categories. after that, "
			+ "it browses to the next page and adds the fourth book to the cart")
	public void selectProduct() throws IOException {
		
		productsPage.selectWriter();
		assertEquals(productsPage.getTitle(), lc.productPageTitle);
		//assertEquals(productsPage.text(lc.writerNameAndBooks, "Book Collection name"), lc.writerNameAndBooks);
		screenshot.takeScreenShot("Writer Books Collection");
		
		productsPage.filterByCategories();
		assertTrue(productsPage.filterStatus(lc.categorySomokalinText, lc.checkSomokalinValue));
		assertTrue(productsPage.filterStatus(lc.categoryStoryCollectionText, lc.checkStoryCollectionValue));
		assertFalse(productsPage.filterStatus(lc.categorychildandteen, lc.checkChildandteenValue));
		screenshot.takeScreenShot("Writer Books Collection after filter");
		
		productsPage.scrollAndGotoNextPage();
		assertEquals(productsPage.text(lc.currentpageNumber, "page number"), lc.currentPagenumbeText);
		screenshot.takeScreenShot("Writer Books Collection 2nd page with filter");
		productsPage.selectBook();	
		screenshot.takeScreenShot("Product page after a book added in cart");
	}

}
