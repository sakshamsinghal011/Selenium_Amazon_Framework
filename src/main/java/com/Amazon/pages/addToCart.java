package com.Amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class addToCart {
	
	WebDriver driver;
	
	public addToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
	public WebElement searchInputBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='nav-search-submit-button']")
	public WebElement searchButton;
	
	@FindBy(how=How.CSS,using="div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-size-medium a-color-base a-text-normal']")
	public WebElement jbl;
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']")
	public WebElement addCart;
	
	public void searchText(String text)
	{
		searchInputBox.sendKeys(text);
	}
	
	public void clickOnsearchButton()
	{
		 searchButton.click();
	}
	
	public void jblClick()
	{
		Actions a = new Actions(driver);
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		jbl.click();
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	public void addTocart() {
		addCart.click();
	}


}
