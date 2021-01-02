/**
 * 
 */
package com.WordPress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author win10
 *
 */
public class LoginPageNew {
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy (id = "ddfdf") 
	WebElement userNameold;
	
	@FindBy (how = How.CSS, using = "#user_login" )
	WebElement userName;
	
	@FindBy (how = How.CSS, using = "#user_pass")
	WebElement password;
	
	@FindBy (how = How.XPATH, using = "//input[@id='wp-submit']")
	@CacheLookup
	WebElement loginBtn;
	
	public void loginToApplication(String usernametxt, String passwordtxt)
	{
		userName.sendKeys(usernametxt);
		password.sendKeys(passwordtxt);
		loginBtn.click();
	}

}
