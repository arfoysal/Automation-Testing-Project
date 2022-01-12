package pages;

import java.io.IOException;

import io.qameta.allure.Step;
import model.CommonMethods;
import model.Locators;
import model.Timeout;


public class SignUpWithGooglePage extends CommonMethods {
	Timeout time = new Timeout();
	Locators lc =  new Locators();
	
	@Step("Hover on the sign-in button then click the Google button")
	public void goTosiginUpPage() {
		hover(lc.signInButton);
		clickOnButton(lc.singUpWithGoogleButton);
	}
	
	@Step("Collect actual current page title ")
	public String pageTitle() {
		return getTitle();
	}
	
	@Step("Collect actual current page message")
	public String googlePageMsg() {
		return getText(lc.googleSingInPage_Message);
	}
	@Step("Complete Signup with email and password")
	public void singup() throws IOException {
		sendText(lc.signInEmail, lc.signInEmailText);
		clickOnButton(lc.signNext);
		time.timeOut(2000);
		sendText(lc.signInPassword, lc.signInPasswordText);
		time.timeOut(1000);
		clickOnButton(lc.signNext);
		time.timeOut(4000);
	}
	@Step("Collect user name after completing the successful sign-up")
	public String user_name() {
		return getText(lc.loginUserName);
	}
	@Step("Highlight user name after successful sign-up")
	public void userNameHighlight() {
		highlighter(lc.loginUserName);
	}
	
	
	
	
	
	
	

}
