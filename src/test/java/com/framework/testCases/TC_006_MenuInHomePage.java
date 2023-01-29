package com.framework.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.MenuInHomePage;

public class TC_006_MenuInHomePage extends BaseClass {
	
	@Test
	public void MenuCheckInHomePage() throws IOException, InterruptedException
	{
		LoginPage loginPage=new LoginPage();
		loginPage.logIn();
		MenuInHomePage menuInHomePage=new MenuInHomePage();
		menuInHomePage.menuCheck();
	}

}
