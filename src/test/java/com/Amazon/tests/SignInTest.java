package com.Amazon.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Amazon.pages.SignIn;
import com.relevantcodes.extentreports.LogStatus;

public class SignInTest extends BaseTest{

	@Parameters({"invalidEmail","invalidPassword"})
	@Test(priority=1,groups="invalid")
	public void invaildLogin(String email,String pass)
	{
		SignIn login= new SignIn(driver);
		login.dropdown();
		login.signInButtonClick();
		login.enterEmail_Id(email);
		login.continueButtone();
//		login.enterPassword(pass);
//		login.signInsubmit();
		extentTest.log(LogStatus.FAIL,"invaildLogin test case failed succesfully");		

	}
	

	@Parameters({"email","password"})
	@Test(priority=1,groups={"valid"})
	public static void validLogin(String email,String pass)
	{
		SignIn login= new SignIn(driver);
		login.dropdown();
		login.signInButtonClick();
		login.enterEmail_Id(email);
		login.continueButtone();
//		login.enterPassword(pass);
//		login.signInsubmit();
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		

		
	}
	
	
	

}
