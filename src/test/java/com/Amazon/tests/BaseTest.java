package com.Amazon.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Amazon.utils.Screenshot;
import com.excel.libs.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	
	
	
	static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;

	static Logger log = Logger.getLogger(BaseTest.class);
	static File file = new File("./Resources/Config.properties");

	static FileInputStream fis = null;
	static Properties prop = new Properties();


	
	static {

		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

//Extend  Report
	@BeforeSuite(groups = { "valid", "invalid", "check" })
	public void setExtent() {
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}

	//Logger configuration
	@BeforeSuite(groups = { "valid", "invalid", "check" })
	public void logTest() {
		PropertyConfigurator.configure("./Resources/log4j.properties");
	}

	// Extend Report
	@AfterSuite(groups = { "valid", "invalid", "check" })
	public void endExtent() {
		extent.flush();
		extent.close();
	}

	// Extend Report
	@BeforeMethod(groups = { "valid", "invalid", "check" })
	public void startTest(Method method) {
		String testName = method.getName();
		extentTest = extent.startTest(testName);
		
//		logger started
		log.info("operation " + testName + " has started");

	}

	// Extend Report
	@AfterMethod(groups = { "valid", "invalid", "check" })
	public void endTest() {
		extent.endTest(extentTest);

	}
//Logger ended
	@AfterMethod(groups = { "valid", "invalid", "check" })
	public void endLog(Method method) {
		String testName = method.getName();
 		log.info("operation" + testName + " has ended");

	}

//ScreenShots
	@AfterMethod(groups = { "valid", "invalid", "check" })
	public void screenshot(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String scrpath = Screenshot.captureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(scrpath));
		}
	}

	@BeforeSuite(groups = { "valid", "invalid", "check" })
	public static void inializeWebDriver() {
		log.info("browser open");

		
		
//Running selected browser using if else
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty(prop.getProperty("chromedriverProperty"), prop.getProperty("chromedriverPath"));
			driver = new ChromeDriver();

		} 
		else if (browserName.equals("edge")) {

			System.setProperty(prop.getProperty("edgedriverProperty"), prop.getProperty("edgedriverPath"));
			driver = new EdgeDriver();
		} 
		else if (browserName.equals("headless")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window_size=1400,800");
			options.addArguments("Headless");
			driver = new ChromeDriver(options);

		} 
		else if (browserName.equals("firefox")) {
			System.setProperty("firefoxdriverProperty", "firefoxdriverPath");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("no browser value given");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		Integer stringtoInteger = Integer.parseInt(prop.getProperty("wait"));
		int stringInt = stringtoInteger.intValue();
		driver.manage().timeouts().implicitlyWait(stringInt, TimeUnit.SECONDS);

	}

	 
	
	
	
	@BeforeMethod(groups = { "valid", "invalid", "check" })
	public static void openBrowser() {
		log.info("amazon page open");
		driver.get(prop.getProperty("url"));
	}

	@AfterSuite(groups = { "valid", "invalid", "check" })
	public static void closeBrowser() {
		driver.close();
		log.info("browser close");
//		driver.quit();
//		log.info("All operation quit");

	}

}
