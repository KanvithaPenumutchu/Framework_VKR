package com.framework.testCases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.SearchPage;



public class TC_003_AllDropdown extends BaseClass {
	
	@Test(description="Verify all dropdowns options")
	public void check_dropdown_All() throws IOException, InterruptedException
	{

		LoginPage loginPage=new LoginPage();
		loginPage.logIn();
		SearchPage searchPage=new SearchPage();
		Thread.sleep(5000);
		searchPage.dropdownAll();
	
		
	}

}
