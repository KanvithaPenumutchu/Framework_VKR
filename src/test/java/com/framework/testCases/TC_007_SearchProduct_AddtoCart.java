package com.framework.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.SearchPage;

public class TC_007_SearchProduct_AddtoCart extends BaseClass {
	@Test
	public void searchProduct_AddtoCart() throws IOException, InterruptedException
	{
		
		LoginPage loginPage=new LoginPage();
		loginPage.logIn();
		SearchPage searchPage=new SearchPage();
		searchPage.searchProduct_AddtoCart();
		
	}

}
