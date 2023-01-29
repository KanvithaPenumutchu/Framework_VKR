package com.framework.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.SearchPage;

import coreUtilities.ExtentReportManager;

public class TC_002_SearchProduct extends BaseClass {
	
	@Test(description="verify search functionality")
	public void searchProduct() throws IOException, InterruptedException
	{
		
		LoginPage loginPage=new LoginPage();
		loginPage.logIn();
		SearchPage searchPage=new SearchPage();
		searchPage.searchProduct();
		
	}

}
