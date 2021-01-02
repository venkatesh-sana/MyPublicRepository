package com.WordPress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;	
  By userName = By.id("user_login");
  By password = By.name("pwd");
  By loginBtn = By.xpath("//input[@value = 'Log In']");
  
  public LoginPage(WebDriver driver)
  {
	  this.driver = driver; 
  }
  
  
  public void loginToApplication(String usernameTxt, String passwordTxt)
  {
	  driver.findElement(userName).sendKeys(usernameTxt);
	  driver.findElement(password).sendKeys(passwordTxt);
	  driver.findElement(loginBtn).click();
	  
  }
  
  
  
  
}
