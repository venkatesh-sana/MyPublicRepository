/**
 * 
 */
package com.WordPress.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.WordPress.Pages.LoginPage;

/**
 * @author win10
 *
 */
public class Login {

@Test
public void loginTest()
{
		
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "E:\\Python Videos\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.get("http://demosite.center/wordpress/wp-login.php?redirect_to=http%3A%2F%2Fdemosite.center%2Fwordpress%2Fwp-admin%2F&reauth=1");
	Reporter.log("Url opened");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.loginToApplication("admin", "demo123");
	
}
	
}
