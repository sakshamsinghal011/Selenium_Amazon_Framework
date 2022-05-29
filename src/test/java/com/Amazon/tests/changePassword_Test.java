package com.Amazon.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Amazon.pages.SignIn;
import com.Amazon.pages.changePassword;
import com.relevantcodes.extentreports.LogStatus;

public class changePassword_Test extends BaseTest {

	@Parameters({"email"})
	@Test(priority=1,groups="valid")
	public void pass(String email)
	{
		changePassword test=new changePassword(driver);
		SignIn login=new SignIn(driver);
		login.dropdown();
		login.signInButtonClick();
		login.enterEmail_Id(email);
		login.continueButtone();
		test.forgotPassword();
//		login.continueButtone();
//		test.Otp();
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		

		}
}
