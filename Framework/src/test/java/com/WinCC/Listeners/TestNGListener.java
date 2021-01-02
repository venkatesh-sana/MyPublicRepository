package com.WinCC.Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.WordPress.TestScripts.LoginTestPageFactory;
import com.WordPress.utilities.Utilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
//import com.WordPress.utilities.*;

public class TestNGListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		EventFiringWebDriver eventFire = new EventFiringWebDriver(LoginTestPageFactory.driver);
		File src = eventFire.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./Screenshots/" + result.getName() +".png");
		ExtentTest logger = Utilities.ExtentReport();

		try {
			FileUtils.copyFile(src, dstFile);
			//logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath("./Screenshots/" + result.getName() +".png").build());
		System.out.println(logger.toString());
		System.out.println(result.getThrowable().getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}	
	

}
