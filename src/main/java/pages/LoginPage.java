package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilis.Constants;
import utilis.ElementUtil;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;

    // 1. By Locators (Object Repository)
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton   = By.id("login-button");
    private By errorMessage  = By.xpath("//h3[@data-test='error']");

    // 2. Constructor to initialize driver
    public LoginPage(WebDriver driver) {
        this.driver = driver; 
        elementUtil = new ElementUtil(driver);
    }

    // 3. Page Actions (Methods)
    public void enterUsername(String user) {
        driver.findElement(usernameField).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(passwordField).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
    
    // High-level "Fluent" method
    public void login(String user, String pass) {
        this.enterUsername(user);
        this.enterPassword(pass);
        this.clickLogin();
    }
    
    public String getLoginPageTitle() { 
     	 return elementUtil.getLoginPageTitle(
     			 Constants.DEFAULT_TIMEOUT, 
     			 Constants.LOGIN_PAGE_TITLE);
    }
}
