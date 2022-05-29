package com.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class sortPurchase {

WebDriver driver;
	
	public sortPurchase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='a-dropdown-label']")
	public WebElement  sortBy;
	
	@FindBy(how=How.XPATH,using="//a[@id='s-result-sort-select_2']")
	public WebElement  highToLow;
	
	@FindBy(how=How.XPATH,using="//li[@id='p_90/6741118031']//i[@class='a-icon a-icon-checkbox']")
	public WebElement  getItByTomorrow;
	
	 
	@FindBy(how=How.XPATH,using="//section[@aria-label='3 Stars & Up']//span[@class='a-size-small a-color-base'][normalize-space()='& Up']")
	public WebElement  rating;
	
	public void sortBy()
	{
		sortBy.click();
	}
	public void highToLow()
	{
		highToLow.click();
	}
	public void getItByTomorrow()
	{
		getItByTomorrow.click();
	}
	 
	public void rating()
	{
		rating.click();
	}
	
}
