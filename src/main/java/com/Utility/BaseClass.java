package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	@BeforeSuite
	public void  BS() throws Exception {
		excel= new ExcelDataProvider ();
		config=new ConfigDataProvider();
	}
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setUp(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();	
		}
		else if (BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
