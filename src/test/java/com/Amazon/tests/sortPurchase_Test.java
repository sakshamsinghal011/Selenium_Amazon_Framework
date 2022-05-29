package com.Amazon.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Amazon.pages.addToCart;
import com.Amazon.pages.sortPurchase;
import com.relevantcodes.extentreports.LogStatus;

public class sortPurchase_Test extends BaseTest{

	@Test(priority=1,groups={"valid"})
	public void sorting() throws InterruptedException {
		
		addToCart text=new addToCart(driver);
		text.searchText("jbl");
		text.clickOnsearchButton();
		 
		
		sortPurchase sort=new sortPurchase(driver);
		Actions a = new Actions(driver);
		sort.sortBy() ;
		sort.highToLow() ;
		 
		Thread.sleep(2000);
 		sort.getItByTomorrow() ;
 		sort.rating() ;
 		Thread.sleep(2000);
		
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		

		 
	}
}
