package com.Amazon.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Amazon.pages.SignUp;
import com.relevantcodes.extentreports.LogStatus;

public class SignUpTest extends BaseTest{
	
	@Test(priority=1,groups={"valid"})
	public void validRegistration() {
		 
		SignUp reg=new SignUp(driver);
		reg.openRegistration();
		reg.enterName("Sangeetha Panciker");
		reg.enterEmail("paniker");
		reg.password("1234");
//		reg.confirmPassword("1234");
 		reg.submit();
		extentTest.log(LogStatus.PASS,"test case passed succesfully");	
		
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(driver.getTitle(), "Amazon Registration");
//		sa.assertEquals(driver.getCurrentUrl(), "");
//		sa.assertAll();
		}
		 
	

}
