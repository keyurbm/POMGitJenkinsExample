package tests;

import base.BaseTest;
import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLogin() {
		
		// Enter username & password
		loginPage.login("standard_user", "secret_sauce");
		System.out.println("Loogged In Successfully");
	}
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle = loginPage.getLoginPageTitle();
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle, "Login page title is not correct");
	}
}