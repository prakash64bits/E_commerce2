package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//web element address

public class SearchFunctionality {

	@FindBy(xpath = "//input[@placeholder='Search here ...']")
	WebElement Search;
	@FindBy(xpath = "//input[@class='form-control appended-form-control search-bar-input']")
	WebElement i_phone;

	public SearchFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SearchFunctionality(String search, String phone) {
		 Search.click();
		i_phone.click();
	}

}
