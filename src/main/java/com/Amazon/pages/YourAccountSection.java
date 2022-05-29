package com.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YourAccountSection {
	WebDriver driver;

	public YourAccountSection(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Your Account']")
	public WebElement yourAccount;

	@FindBy(how = How.XPATH, using = "//div[@data-card-identifier=\"YourOrders\"]")
	public WebElement yourOrder;

	@FindBy(how = How.XPATH, using = "//div[@data-card-identifier=\"SignInAndSecurity\"]")
	public WebElement signInandSecurity;

	@FindBy(how = How.XPATH, using = "//div[@data-card-identifier=\"PaymentOptions\"]")
	public WebElement payementOption;

 

	public void yourAccount() {
		yourAccount.click();
	}
	public void yourOrder() {
		yourOrder.click();
	}
	public void signInandSecurity() {
		signInandSecurity.click();
		}
	public void payementOption() {
		payementOption.click();}
	

	 
 
}
