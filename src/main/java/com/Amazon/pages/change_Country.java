package com.Amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class change_Country {
WebDriver driver;
	
	public change_Country(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//div[@id='nav-flyout-icp']//div[@class='icp-mkt-change-lnk']")
	public WebElement countryButton;
	
	@FindBy(how = How.XPATH, using = "//span[@class='a-dropdown-prompt']")
	public WebElement selectCountry;
 
	@FindBy(how = How.XPATH, using = "	//a[@id='icp-dropdown_3']\r\n")
	public WebElement china;
	
	@FindBy(how = How.XPATH, using = "//input[@class='a-button-input']")
	public WebElement refresh;

	
	public void firstdropdown() {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//span[@class='nav-line-2']"))).build().perform();
	}
	
	public void clickOnCountry() {
		countryButton.click();
	}
	
	public void selectCountry()
	{
		selectCountry.click();
		
	}
	public void selectCountry_fromList() {
		 china.click();
	}
	public void refreshCountry() {
		 refresh.click();
	}

}
