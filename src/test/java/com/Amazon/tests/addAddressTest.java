package com.Amazon.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Amazon.pages.addAddress;
import com.relevantcodes.extentreports.LogStatus;

public class addAddressTest extends BaseTest {
	// We will put valid pinCode
	@Test(priority = 1, groups = { "check", "valid" })
	public void addByPin() {
//		log.info("Add correct Pin operation start");
		addAddress addAddress = new addAddress(driver);
		addAddress.openAdressWindow();
		log.info("pin code entered");
		addAddress.enterPincode("689110");
		log.info("click on apply");
		addAddress.clickOnApply();
		extentTest.log(LogStatus.PASS, "test case passed succesfully");
//		log.info("Add correct Pin operation close");


	}

	// We will put valid pinCode after login
	@Test(priority = 2, groups = { "check", "valid" })
	public void througSignIN() {
//		log.info("Add correct Pin operation start");

		addAddress addAddress = new addAddress(driver);
		addAddress.openAdressWindow();
		log.info("adding address using login");
		addAddress.clickOnSignInToSeeYourAddress();
		log.info("clicked on apply");

		addAddress.clickOnApply();
		extentTest.log(LogStatus.PASS, "test case passed succesfully");
		
//		log.info("Add correct Pin operation start");


	}

	// We will put invalid pinCode
	@Test(priority = 3, groups = { "check", "invalid" })
	public void InvalidAddPin() {
//		log.info("Add InvalidAddPin operation start");

		addAddress addAddress = new addAddress(driver);
		addAddress.openAdressWindow();
		log.info("entering invalid pin");

		addAddress.enterPincode("11000078888");
		addAddress.clickOnApply();
		log.info("applying assertion on title");

		Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More");
		log.info("clicking on apply");

		addAddress.clickOnApply();
		extentTest.log(LogStatus.FAIL, "test case failed succesfully");
//		log.info("Add InvalidAddPin operation start");

	}

}
