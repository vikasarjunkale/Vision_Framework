package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	//Encpsulation---->data hiding+ abstraction
	//this----> current class instance variable refer
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement EmailId;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement LogIn;
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getEmailId() {
		return EmailId;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getLogIn() {
		return LogIn;
	}
	
	

}
