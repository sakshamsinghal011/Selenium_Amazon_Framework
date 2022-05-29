package com.Amazon.pages;

 
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class addAddress {
	
WebDriver driver;
	
	public addAddress(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='glow-ingress-line1']")
	public WebElement addressBar;
	
	@FindBy(how=How.XPATH,using="//input[@id='GLUXZipUpdateInput']")
	public WebElement pinCode;
	
	@FindBy(how=How.XPATH,using="//input[@aria-labelledby='GLUXZipUpdate-announce']")
	public WebElement apply;
	
	@FindBy(how=How.XPATH,using="//input[@aria-label='Sign in to see your addresses']")
	public WebElement addressAfterSignIn;
	
	public void openAdressWindow() {
		 
		addressBar.click();
	}
	
	public void enterPincode(String pin) {
		 
		pinCode.sendKeys(pin);
	}
	
	public void clickOnApply() {
		 
		apply.click();
		 
	}

	public void clickOnSignInToSeeYourAddress() {
		
		addressAfterSignIn.click();
	}

}
