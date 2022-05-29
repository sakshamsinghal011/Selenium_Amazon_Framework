package com.Amazon.tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Amazon.pages.SignIn;
import com.Amazon.pages.YourAccountSection;
import com.relevantcodes.extentreports.LogStatus;

public class YourAccountSection_Test extends BaseTest{

	 
	@Test(groups={"valid"})

	@Parameters({"email","password"})
	public void yourOrder(String email,String pass) {
		SignIn login = new SignIn(driver);
		login.dropdown();
		
		YourAccountSection click = new YourAccountSection(driver);
		click.yourAccount();
		click.yourOrder();
		
		SignIn login1= new SignIn(driver);

		login1.enterEmail_Id(email);
		login1.continueButtone();
//		login1.enterPassword(pass);
//		login1.signInsubmit();
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		


	}

	@Parameters({"email","password"})
	@Test(groups={"valid"})

	public void payementOption(String email,String pass) {
		SignIn login = new SignIn(driver);
		login.dropdown();
		
		YourAccountSection click = new YourAccountSection(driver);
		click.yourAccount();
		click.payementOption();
		
		SignIn login1= new SignIn(driver);

		login1.enterEmail_Id(email);
		login1.continueButtone();
//		login1.enterPassword(pass);
//		login1.signInsubmit();
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		

		 
	}

	@Parameters({"email","password"})
	@Test(groups={"valid"})

	public void signInandSecurity(String email,String pass) {
		SignIn login = new SignIn(driver);
		login.dropdown();
		
		YourAccountSection click = new YourAccountSection(driver);
		click.yourAccount();
		click.signInandSecurity();
		
		SignIn login1= new SignIn(driver);

		login1.enterEmail_Id(email);
		login1.continueButtone();
//		login1.enterPassword(pass);
//		login1.signInsubmit();
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		

	}
	
	 
}
