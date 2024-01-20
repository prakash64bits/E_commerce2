package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginFunctionality {
	
//Web elements address 
	@FindBy(name="user_id")                             // find by method by selenium
	WebElement userid;
	
	@FindBy(name="password")
	WebElement passward;
	
	@FindBy(xpath="//button[text()=\'Sign in\']")
	WebElement submit;

	public LoginFunctionality(WebDriver driver) {

		PageFactory.initElements(driver, this); // these 2 lines r 4-9 lines submission wise

	}

	public Homepage doLogin() {                  //void replace we given home page
		//userid.sendKeys(prop.getProperty("username"));
		//passward.sendKeys(prop.getProperty("password"));
		submit.click();
		
		return Homepage();//when i give click , so i created Home page class. 
		
	}

	private Homepage Homepage() {
	
		return null;
	}

	
}
	

	



