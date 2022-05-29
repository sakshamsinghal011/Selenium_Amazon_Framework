package com.Amazon.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Amazon.pages.SignIn;
import com.Amazon.pages.amazonPrime;
import com.relevantcodes.extentreports.LogStatus;
 
public class amazonPrimeTest extends BaseTest{

	@Parameters({"email","password"})
	@Test(priority=1,groups={"valid","sanity"})
	public void subscription(String email,String pass) {
		 

		amazonPrime action=new amazonPrime(driver);
		action.allButtonClick();
		action.primeButton();
		action.allVideoButton();
		action.signInButton();
		SignIn log = new SignIn(driver);
		log.enterEmail_Id(email); 
		log.enterPassword(pass);
		extentTest.log(LogStatus.PASS,"subscription findBlankText test case passed succesfully");		

	}
	
	
}
