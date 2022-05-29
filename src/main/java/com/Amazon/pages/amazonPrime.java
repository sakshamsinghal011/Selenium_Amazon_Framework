package com.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class amazonPrime {

	WebDriver driver;

	public amazonPrime(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//i[@class='hm-icon nav-sprite']")
	public WebElement allButton;

	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Amazon Prime Video']")
	public WebElement prime;
	
	@FindBy(how = How.XPATH, using = " //a[@class='hmenu-item'][normalize-space()='All Videos']")
	public WebElement allVideo;
	
	@FindBy(how = How.XPATH, using = " //span[@class='pv-nav-link-with-droplist']//span//a[@id='pv-nav-sign-in']")
	public WebElement signIn;
	
	public void allButtonClick()
	{
		allButton.click();
	}
	
	public void primeButton() {
		prime.click();
	}
	public void allVideoButton() {
		allVideo.click();
	}
	
	public void signInButton() {
		signIn.click();
	}
	

}
