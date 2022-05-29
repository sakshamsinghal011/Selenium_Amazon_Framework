package com.Amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.excel.libs.util.Xls_Reader;

public class SignIn {
	
	WebDriver driver;
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//span[@class='nav-action-inner']")
	public WebElement signInButton;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ap_email']")
	public WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='continue']")
	public WebElement continueButton;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(how = How.XPATH, using = "//input[@id='signInSubmit']")
	public WebElement sigInSubmit;
	
	public void dropdown() {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"))).build().perform();
	}
	public void excel() {
		Xls_Reader reader= new Xls_Reader("/Amazon_Assignment3/src/main/java/com/excel/libs/util");
		String sheetname="TestData";
		int rowCount=reader.getRowCount(sheetname);
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			String emails=reader.getCellData(sheetname,"email",rowNum);
			String pass=reader.getCellData(sheetname,"password",rowNum);
	        email.sendKeys(emails);
	        continueButton.click();
			password.sendKeys(pass);
		}
	}
	public void signInButtonClick()
	{
		signInButton.click();
	}
	public void enterEmail_Id(String emails)
	{
		email.sendKeys(emails);
	}
	public void continueButtone()
	{
		continueButton.click();
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void signInsubmit()
	{
		sigInSubmit.click();
	}

}
