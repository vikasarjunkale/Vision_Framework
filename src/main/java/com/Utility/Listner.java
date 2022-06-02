package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listner extends BaseClass implements ITestListener{
	
	ExtentReports extent=ExtendReportGenerator.getReport();
	
	ThreadLocal<ExtentTest> extentest=new ThreadLocal<ExtentTest>();
	

	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getClass().getName() +"=="+result.getMethod().getMethodName());
		extentest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extentest.get().log(Status.PASS, "Test Case Pass");
	}

	public void onTestFailure(ITestResult result) {
		extentest.get().log(Status.FAIL, "Test Case Failed");
		extentest.get().addScreenCaptureFromBase64String(getScreen());
	}

	public void onTestSkipped(ITestResult result) {
		extentest.get().log(Status.SKIP, "Test Case Skiped");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	public String getScreen() {
		String file=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return file;
	}


}
