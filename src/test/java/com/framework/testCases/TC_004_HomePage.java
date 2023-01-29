package com.framework.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.HomePage;
import com.framework.pages.LoginPage;

public class TC_004_HomePage extends BaseClass {
	
	@Test
	public void homePage() throws IOException, InterruptedException
	{
		LoginPage loginPage=new LoginPage();
		loginPage.logIn();
		
		HomePage homePage=new HomePage();
		homePage.homePage();
	}

}
