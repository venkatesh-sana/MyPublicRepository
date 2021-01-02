/**
 * 
 */
package com.WordPress.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author win10
 *
 */
public class Utilities {
	
	static ITestResult result;
	
	public static WebDriver OpenBrowser(String browserName)
	{
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Python Videos\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			
		}	
		
		return driver;
	}
	
	public static void captureScreenshot(WebDriver driver, String screenShotName) throws IOException
	{
		EventFiringWebDriver eventFire = new EventFiringWebDriver(driver);
		File src = eventFire.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./Screenshots/" + screenShotName +".png");
		FileUtils.copyFile(src, dstFile);
	}
	
	public static ExtentTest ExtentReport()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/detailedHTMLReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.out.println(ITestResult.class.getName());
		
		//ITestResult.class.getName();
		//ExtentTest dd =new ExtentTest(extent, null, null);
		//ExtentTest logger = extent.createTest(result.getName());
		ExtentTest logger = extent.createTest(ITestResult.class.getName());
		System.out.println(logger);
		return logger;
	}

}
