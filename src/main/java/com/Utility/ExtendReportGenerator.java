package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGenerator {
	public static ExtentReports extent;
	
	public static ExtentReports getReport() {
		String reportpath="C:\\Users\\admin\\eclipse-workspace\\Vision_FrameDemo\\Report";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Automation Report-Vision");
		reporter.config().setReportName("Vision System-AutoReport");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Vision project");
		extent.setSystemInfo("Version", "1.4.1");
		extent.setSystemInfo("QA", "XYZ");
		return extent;
	}

}
