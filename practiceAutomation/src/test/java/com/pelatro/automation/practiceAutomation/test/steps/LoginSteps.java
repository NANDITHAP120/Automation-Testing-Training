package com.pelatro.automation.practiceAutomation.test.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.pelatro.automation.practiceAutomation.login.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
	
	private LoginPage loginPage;
	
	@Given("I opened the app using following (.*)")
	public void openApp(String url) {
		loginPage.openAt(url);
		
	}
	
	 @When("I enter username (.*) and password (.*)")
	    public void enterCredentials(String username, String password) {
	        loginPage.enterUsername(username);
	        loginPage.enterPassword(password);
	    }

	    @When("I click on the Submit button")
	    public void clickSubmitButton() {
	        loginPage.clickSubmit();
	    }
	    @Then("I verify new page URL contains (.*)")
	    public void verifyPageUrl(String expectedUrlPart) {
	        String currentUrl = loginPage.getDriver().getCurrentUrl();
	        assertTrue("URL did not match expected part.", currentUrl.contains(expectedUrlPart));
	    }

	    @Then("I verify new page contains expected text (.*) or (.*)")
	    public void verifyPageContainsText(String expectedText,String expectedText2) {
	        String pageSource = loginPage.getDriver().getPageSource();
	        assertTrue("Page did not contain expected text.", pageSource.contains(expectedText)||pageSource.contains(expectedText2));
	    }

	    @Then("I verify logout button is displayed on the new page")
	    public void verifyButtonDisplayed() {
	        boolean isButtonDisplayed = loginPage.isLogoutButtonVisible();
	        assertTrue("Log out button is not displayed", isButtonDisplayed);
	    }

	    @Then("I verify error message is displayed")
	    public void verifyErrorMessageIsDisplayed() {
	        assertTrue("Error message is not displayed", loginPage.isErrorMessageVisible());
	    }
	    @Then("I verify error message text is (.*)")
	    public void verifyErrorMessageText(String expectedErrorMessage) {
	        String actualErrorMessage = loginPage.getErrorMessageText();
	        assertEquals("Error message text does not match", expectedErrorMessage, actualErrorMessage);
	    }
}