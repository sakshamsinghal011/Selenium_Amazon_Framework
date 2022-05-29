package com.Amazon.tests;

import org.testng.annotations.Test;

import com.Amazon.pages.forwardAndBackward_Pic;
import com.relevantcodes.extentreports.LogStatus;

public class forwardAndBackward_Pic_Test extends BaseTest{

	@Test(priority=1,groups="valid")
	public void clickOnImage() throws InterruptedException
	{
		forwardAndBackward_Pic click=new forwardAndBackward_Pic(driver);
		click.clickOnImageBackward();
		Thread.sleep(2000);
		click.clickOnImageForward();
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		

		
	}
}
