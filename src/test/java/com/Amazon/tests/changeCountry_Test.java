package com.Amazon.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Amazon.pages.change_Country;
import com.relevantcodes.extentreports.LogStatus;

public class changeCountry_Test extends BaseTest{
	
 	@Test(priority=1,groups="valid")
	public void clickOnCountry_Button() throws InterruptedException {
		change_Country action=new change_Country(driver);
		action.firstdropdown();
		action.clickOnCountry();
		action.selectCountry();
		action.selectCountry_fromList();
		action.refreshCountry();
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        Thread.sleep(20000);

        driver.close();
		driver.switchTo().window(parentId);
		
		extentTest.log(LogStatus.PASS,"test case passed succesfully");		
 

	}
}
