package com.WordPress.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;

import com.WordPress.Pages.LoginPageNew;
import com.WordPress.utilities.Utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//@Listeners(com.WinCC.Listeners.TestNGListener.class)
public class LoginTestPageFactory {
	public static WebDriver driver;
	/*
	@Test
	// public static void main(String [] args) {
	public void loginTest() throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest logger = extent.createTest("loginTest");
		logger.info("this is info");
		logger.pass("details");
		logger.log(Status.PASS, "status.PASS Detailss");
		logger.fail("I am Fail");
		logger.debug("I am Debug point");
		logger.addScreenCaptureFromPath("‪/Users/win10/Desktop/Sample.png");
		logger.fail("Failed",
				MediaEntityBuilder.createScreenCaptureFromPath("‪/Users/win10/Desktop/Sample.png").build());
		extent.flush();

		driver = Utilities.OpenBrowser("Chrome");
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPageNew loginPage = PageFactory.initElements(driver, LoginPageNew.class);
		loginPage.loginToApplication("admin", "demo123");
	} */

	@Test
	public void TakeScreenshotOnFailure() {
		ExtentTest logger = Utilities.ExtentReport();
		driver = Utilities.OpenBrowser("Chrome");
		logger.debug("Chrome Got Opened");
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPageNew loginPage = PageFactory.initElements(driver, LoginPageNew.class);
		loginPage.loginToApplication("admin", "demo123");
		logger.debug("UserNaem and Password");
		logger.info("I am a INfo");
		WebElement element = driver.findElement(By.id("sdfsdf"));
	}
/*
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		
		if (ITestResult.FAILURE == result.getStatus())
		{
			Utilities.captureScreenshot(driver, result.getName());
		} 
		if(ITestResult.SUCCESS == result.getStatus())
		{
			Utilities.captureScreenshot(driver, result.getName());
		} 
	} */

}
