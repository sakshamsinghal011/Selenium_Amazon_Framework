package com.Amazon.tests;

 import java.util.Iterator;
import java.util.Set;

 import org.testng.annotations.Test;

 import com.Amazon.pages.addToCart;
import com.relevantcodes.extentreports.LogStatus;

public class addToCartTest extends BaseTest{
	
	//Add the item to cart
	@Test(priority=1,groups="valid")
	public void addToCart( ) throws InterruptedException
	{
 
		addToCart text=new addToCart(driver);
		log.info("searching product ");

		text.searchText("mi10pro");
		log.info("click on search button");

		text.clickOnsearchButton();
		log.info("selecting product");

		text.jblClick();
		
		log.info("moving control to child website");

		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        
		log.info("adding to cart");
 		text.addTocart();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parentId);
		extentTest.log(LogStatus.PASS,"addToCart test case passed succesfully");		


 
        
		
	}
	
	 
	
	@Test(priority=2,groups="invalid")
	public void findBlankText()
	{
 
		addToCart text=new addToCart(driver);
		log.info("searching blank product");

 		text.searchText("");
		text.clickOnsearchButton();
		extentTest.log(LogStatus.PASS,"findBlankText test case passed succesfully");		

	}
 	 

}
