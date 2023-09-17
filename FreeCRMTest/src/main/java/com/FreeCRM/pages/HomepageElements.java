package com.FreeCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCRM.base.BaseTest;

public class HomepageElements extends BaseTest{

	
	public HomepageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy (xpath =  "//span[text()='Log In']")
	public WebElement loginButton;
	
	
	
	

}
