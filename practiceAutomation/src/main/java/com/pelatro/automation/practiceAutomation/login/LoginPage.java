package com.pelatro.automation.practiceAutomation.login;

import org.openqa.selenium.WebDriver;

import com.pelatro.automation.practiceAutomation.generic.Page;

public class LoginPage extends Page{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	private String usernameFieldXPath = "//input[@id='username']";
    private String passwordFieldXPath = "//input[@id='password']";
    private String submitButtonXPath = "//button[@id='submit']";
    private String logoutButtonXPath = "//a[text()='Log out']";
    private String errorMessageXPath = "//div[@id='error']";

    
    public void enterUsername(String username) {
        type(usernameFieldXPath, username);
    }

    
    public void enterPassword(String password) {
        type(passwordFieldXPath, password);
    }

   
    public void clickSubmit() {
        click(submitButtonXPath);
    }
    public boolean isLogoutButtonVisible() {
        return isElementVisible(logoutButtonXPath);
    }
    
    public boolean isErrorMessageVisible() {
        return isElementVisible(errorMessageXPath);
    }
    public String getErrorMessageText() {
        return getElementText(errorMessageXPath);
    }
}
