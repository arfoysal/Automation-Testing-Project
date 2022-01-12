package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import io.qameta.allure.Description;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.SignUpWithGooglePage;

public class Test_002_SignUpWithGoogle extends BaseDriver{
	
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	SignUpWithGooglePage signUpPage = new SignUpWithGooglePage();
	@Test(description = "SignUp with Google test")
	@Description("Test Description: This test will try to Sign up with Google for Rokomari. "
			+ "It will verify every step and save screenshots for future use.")
	public void signUpWithGoogle() throws IOException {
		
		signUpPage.goTosiginUpPage();
		time.waitForPageLoad();
		
		assertEquals(signUpPage.getTitle(), lc.googleSignInPage_Title);
		assertEquals(signUpPage.googlePageMsg(), lc.googleSignInPage_MessageText);
		screenshot.takeScreenShot("Google Login page");
		signUpPage.singup();
		time.waitForPageLoad();
		assertEquals(signUpPage.user_name(), lc.loginUserNameText);
		signUpPage.userNameHighlight();
		time.timeOut(1000);;
		screenshot.takeScreenShot("Login_Successful");
	}

}
