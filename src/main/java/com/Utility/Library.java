package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	public static ExtentTest test;
	public static void custom_sendkeys(WebElement element,String fieldname,String value) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, "Value succesfully Send"+value);
		}catch(Exception e){
//			System.out.println("Unable to send value to"+ fieldname);
			test.log(Status.FAIL, "Value succesfully Send"+e);
		}
	}
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, "Click Succesfully"+fieldname);
		}catch(Exception e) {
//			System.out.println("Unable to click"+fieldname );
			test.log(Status.FAIL, "Unable to Click Succesfully"+e);
		}
	}
	public static void custom_HandleDropDown(WebElement element,String text, String fieldname) {
		try {
			Select s=new Select(element);
			s.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println("Unable to handle Dropdown" +element);
		}
	}

}
