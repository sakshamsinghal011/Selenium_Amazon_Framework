package com.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class changePassword {


	WebDriver driver;

	public changePassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "	//a[@id='auth-fpp-link-bottom']\r\n")
	public WebElement forgotPasswordButton;
	
	 
	@FindBy(how = How.XPATH, using = "//input[@aria-labelledby='cvf-submit-otp-button-announce']")
	public WebElement OtpButton;
 	
	public void forgotPassword()
	{
		forgotPasswordButton.click();
	}
	
	 
	public void Otp()
	{
		OtpButton.click();
	}
}
