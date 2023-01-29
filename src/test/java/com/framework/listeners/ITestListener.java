package com.framework.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import com.framework.testCases.BaseClass;

import coreUtilities.ExtentReportManager;


public class ITestListener implements org.testng.ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
		//ExtentReportManager.extent.createTest(result.getMethod().getMethodName());
		ExtentReportManager.startTest(result.getMethod().getMethodName(), result.getMethod().getDescription(), "Smoke");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
		ExtentReportManager.logPass(result.getMethod().getMethodName()+" Test Case passed successfully");
		/*try {
			Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(BaseClass.takeScreenShot()).build();
			ExtentReportManager.logScreenshot(mediaModel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
		ExtentReportManager.logFail(result.getThrowable().getMessage());
		
		try {
			Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(BaseClass.takeScreenShot()).build();
			ExtentReportManager.logScreenshot(mediaModel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//getCurrentTest().info("", mediaModel);
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Failed But With in SuccessPercentage");
			
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
		
	}
	
	

}
