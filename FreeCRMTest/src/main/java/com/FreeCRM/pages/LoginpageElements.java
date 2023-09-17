package com.FreeCRM.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCRM.base.BaseTest;


public class LoginpageElements extends BaseTest{
	
	
	
	
	public LoginpageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	public WebElement emailTextField;
	
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordTextField;
	
	@FindBy (xpath="//div[text()='Login']")
	public WebElement loginButton;
	
	@FindBy (xpath = "//p[text()='Invalid login']")
	public WebElement invalidLoginErrorMessage;

}
