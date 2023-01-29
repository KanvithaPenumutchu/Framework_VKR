package com.framework.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.SearchPage;

public class TC_005_DD_All_Search  extends BaseClass {
	
	@Test
	public void dd_With_Search() throws IOException, InterruptedException
	{
		LoginPage loginPage=new LoginPage();
		loginPage.logIn();
		SearchPage searchPage=new SearchPage();
		searchPage.ddAll_Search();
	}

}
