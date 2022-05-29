package com.Amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.excel.libs.util.Xls_Reader;

public class SignUp {
	WebDriver driver;

	public SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Start here.")
	public WebElement registering;

	@FindBy(how = How.ID, using = "ap_customer_name")
	public WebElement new_customer_name;

	@FindBy(how = How.XPATH, using = " //input[@id='ap_email']")
	public WebElement new_email;

	@FindBy(how = How.XPATH, using = "//input[@id='ap_password']")
	public WebElement new_password;

	@FindBy(how = How.XPATH, using = "//input[@id='ap_password_check']")
	public WebElement confirm_new_password;

	@FindBy(how = How.XPATH, using = "//input[@id='continue']")
	public WebElement continueButton;
	
	
	public void openRegistration()
	{
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"))).build().perform();
//		Thread.sleep(2000);
		registering.click();
	}
	
	public void enterName(String name)
	{
		new_customer_name.sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		new_email.sendKeys(email);
	}
	
	public void password(String pass)
	{
		new_password.sendKeys(pass);
	}
	public void confirmPassword(String pass)
	{
		confirm_new_password.sendKeys(pass);
	}
	public void submit()
	{
		continueButton.click();
	}
	

}
