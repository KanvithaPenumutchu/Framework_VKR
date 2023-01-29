package com.framework.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;

import coreUtilities.ExtentReportManager;

public class TC_001_AmazonLogin extends BaseClass {
	
	@Test(description="Verify login functionality")
	public static void amazonLogIn() throws IOException, InterruptedException
	{
		LoginPage loginPage=new LoginPage();
		loginPage.logIn();
	}

	
}
