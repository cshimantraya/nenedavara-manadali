package com.FreeCRM.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.FreeCRM.base.BaseTest;
import com.FreeCRM.pages.HomepageElements;
import com.FreeCRM.pages.LoginpageElements;

//Do not use main class

public class FreeCRMTestCases {

	WebDriver driver;
	

	
	HomepageElements hpe  =new HomepageElements(driver);
	LoginpageElements lpe = new LoginpageElements(driver);
	
	//
	@Test
	public void browserSetup() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://freecrm.com/");
		Thread.sleep(10000);
	}
	
	@Test
	public void login() throws InterruptedException
	{
			System.out.println("Inside login Method");
			hpe.loginButton.click();
			Thread.sleep(10000);
			
			System.out.println("Entering text to Email TextField");
			lpe.emailTextField.click();
			lpe.emailTextField.sendKeys("abcxyz");
			Thread.sleep(3000);
			
			System.out.println("Entering Password");
			lpe.passwordTextField.click();
			lpe.passwordTextField.sendKeys("12345");
			Thread.sleep(5000);
			
			System.out.println("Clicking login button");
			lpe.loginButton.click();
			Thread.sleep(5000);
			
			if(lpe.invalidLoginErrorMessage.isDisplayed())
			{
				System.out.println("Pass : InvalidErrorMessage Has been displayed");
			}
			else
			{
				System.out.println("Fail : Invalid Error Message not Displayed");
			}
			Thread.sleep(5000);
	}

}
