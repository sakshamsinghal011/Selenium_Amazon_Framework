package com.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class forwardAndBackward_Pic {

	WebDriver driver;

	public forwardAndBackward_Pic(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//i[@class='a-icon a-icon-next-rounded']")
	public WebElement forwardButton;

	@FindBy(how = How.XPATH, using = "//i[@class='a-icon a-icon-previous-rounded']")
	public WebElement backButton;
	
	public void clickOnImageForward()
	{
		forwardButton.click();
	}
	public void clickOnImageBackward()
	{
		backButton.click();
	}

}
