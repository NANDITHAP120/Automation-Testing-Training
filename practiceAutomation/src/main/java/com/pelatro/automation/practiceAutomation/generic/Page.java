package com.pelatro.automation.practiceAutomation.generic;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class Page extends PageObject {

	private WebDriver driver;
	public Page(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		driver.manage().window().maximize();
		
	}
	public void type(String xpath, String value) {
		element( By.xpath(xpath) ).waitUntilVisible().type(value);
	}
	
	public void click(String xpath) {
		element( By.xpath(xpath) ).waitUntilVisible().waitUntilClickable().click();
	}
	public boolean isElementVisible(String xpath) {
        return element(By.xpath(xpath)).isVisible();
    }
	
	 public String getElementText(String xpath) {
	        return element(By.xpath(xpath)).getText();
	    }
	
}
