package com.makemytrip.pageobjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.utility.Action;

public class FlightsFromNewDehliToBengaluruPage {
	
	Action action=new Action();
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='bookbutton-RKEY:19839d3e-7bcb-40eb-8a0b-8660f711f828:50_0']")
	private WebElement viewprice;
	
	@FindBy(xpath="(//button[.='Book Now'])[1]")
	private WebElement booknow;
	
	public FlightsFromNewDehliToBengaluruPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnViewPrice() throws InterruptedException {
		
		action.waitAndClick(viewprice);		
	}
	
	public CompleteYourBooking clickOnBooknow() throws InterruptedException {
		action.waitAndClick(booknow);
		return new CompleteYourBooking(driver);
	}

}
