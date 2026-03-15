package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

@Test
public void verifyLogin() {

LoginPage lp = new LoginPage(driver);
lp.login("standard_user", "secret_sauce");

System.out.println("Login Test Executed");

}

}