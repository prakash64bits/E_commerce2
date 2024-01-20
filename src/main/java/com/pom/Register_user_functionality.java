package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_user_functionality {

	@FindBy(name="f_name")
	WebElement firstname;
	
	@FindBy(name="l_name")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(name="password")
	WebElement passwrd;
	
	@FindBy(name="con_password")
	WebElement con_passward;
	
	@FindBy(id="inputCheckd")
	WebElement checkbox;
	
	@FindBy(id="sign-up")
	WebElement signupbutton;
	
	public Register_user_functionality (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Register_user_functionality(String fname,String lname,String mail,String ph_ph,String pass_ward,String conpaswad, String Checkbox, String sgnupbutton ) {
	
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		Email.sendKeys( mail);
		Phone.sendKeys( ph_ph);
		passwrd.sendKeys( pass_ward);
		con_passward.click();
		 
		checkbox.click();
		signupbutton.click();
	}

}


