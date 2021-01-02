package com.MakeMyTrip.Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WordPress.utilities.Utilities;

import bsh.commands.dir;

public class MakeMyTrip {
	
	static WebDriver driver;
	
	
	public static void main(String [] args)
	{	
			
		
		driver = Utilities.OpenBrowser("Chrome");
		driver.navigate().to("https://makemytrip.com");
		
		MakeMyTripPages makeTrip = PageFactory.initElements(driver, MakeMyTripPages.class);
		makeTrip.clickOnSearchBtn();
		
		WebElement txt = makeTrip.popularFilterTxt;
		if (txt.isDisplayed()) 
		{
			System.out.println("Object found");
		}
		else
		{
			System.out.println("Object not found");
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement flightNO = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'6E-2011 | 6E-583')]")));
		if (flightNO.isEnabled())
		{
			System.out.println("Flight is enabled");
		}
		else
		{
			System.out.println("FLight not enabled");
		}
		
		
	}
	
	

}
