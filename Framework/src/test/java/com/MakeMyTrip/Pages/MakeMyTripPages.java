package com.MakeMyTrip.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MakeMyTripPages {
	
	@FindBy (how = How.XPATH, using = "//a[text()='Search']")
	WebElement seachBtn;
	
	@FindBy (how = How.XPATH, using = "//p[contains(text(),'Popular Filters')]")
	WebElement popularFilterTxt;
	
	public void clickOnSearchBtn() {
		
		seachBtn.click();
		
	}

}
