package pages;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;
import model.Timeout;

public class Logout extends CommonMethods{
	Locators lc =  new Locators();
	Timeout time = new Timeout();
	
	@Step("Click on username button and click on sign out button from drop-down")
	public void clickSignOut() {
		clickOnButton(lc.loginUserName);
		time.timeOut(1000);
		clickOnButton(lc.signout);
		time.timeOut(5000);
	}
	
	
}
