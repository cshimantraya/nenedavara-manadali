package com.FreeCRM.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.FreeCRM.base.BaseTest;
import com.FreeCRM.pages.HomepageElements;
import com.FreeCRM.pages.LoginpageElements;

//Do not use main class

public class FreeCRMTestCases extends BaseTest{
	
	
	HomepageElements hpe  ;
	LoginpageElements lpe ;
	

	
	
	@Test
	public void login() throws InterruptedException
	{
		
			hpe  =new HomepageElements(driver);
			 lpe = new LoginpageElements(driver);
			
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
	
	/*
	
	@Test
	public void browserSetup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://freecrm.com/");
		Thread.sleep(10000);
	}
	
	
	
	@Test
	public void loginDemo() throws InterruptedException
	{
			System.out.println("Inside login Method");
			driver.findElement(By.xpath("//span[text()='Log In']")).click();
			Thread.sleep(10000);
			
			System.out.println("Entering text to Email TextField");
			
			driver.findElement(By.xpath("//input[@name='email']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcxyz");
			Thread.sleep(3000);
			
			System.out.println("Entering Password");
			driver.findElement(By.xpath("//input[@name='password']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcxyz");
			Thread.sleep(3000);
			
			System.out.println("Clicking login button");
			driver.findElement(By.xpath("//div[text()='Login']")).click();
			Thread.sleep(5000);
			
			WebElement invalidLoginMessage = driver.findElement(By.xpath("//p[text()='Invalid login']"));
			
			if(invalidLoginMessage.isDisplayed())
			{
				System.out.println("Pass : InvalidErrorMessage Has been displayed");
			}
			else
			{
				System.out.println("Fail : Invalid Error Message not Displayed");
			}
			Thread.sleep(5000);
	}
	*/

}
