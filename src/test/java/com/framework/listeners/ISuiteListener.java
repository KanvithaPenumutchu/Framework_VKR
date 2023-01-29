package com.framework.listeners;

import org.testng.IExecutionListener;
import org.testng.ISuite;

import coreUtilities.ExtentReportManager;

public class ISuiteListener implements org.testng.ISuiteListener,IExecutionListener {

	public void onStart(ISuite suite) {
		System.out.println("on suite start");
		ExtentReportManager.startReport();
		
	}

	public void onFinish(ISuite suite) {
		System.out.println("on suite finish");
		ExtentReportManager.stopReport();
		
	}

	public void onExecutionStart() {
		// TODO Auto-generated method stub
		
	}

	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		
	}

	
	

}
