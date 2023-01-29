package com.framework.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.framework.webUtilities.WebActions;

import coreUtilities.ConfiguratorReader;

public class LoginPage
{
	By clk_helloSignIn=By.xpath("//a[@data-nav-role='signin' and @data-csa-c-type='link']");
	By txt_email_or_phone=By.xpath("//input[@name='email']");
	By btn_continue=By.xpath("//input[@class='a-button-input']");
	By txt_password=By.xpath("//input[@name='password']");
	By btn_signin=By.xpath("//input[@id='signInSubmit']");
	
	public void logIn() throws IOException, InterruptedException
	{
		WebActions.enterURL(ConfiguratorReader.getConfigValue("url"));
		Thread.sleep(5000);
		WebActions.click(clk_helloSignIn, "Hellow, sign in Accounts & Lists");
		//WebActions.waitForClickable(clk_helloSignIn);
		WebActions.sendKeys(txt_email_or_phone, "7997990616", "Email or mobile phone number");
		WebActions.click(btn_continue, "continue");
		WebActions.sendKeys(txt_password, "RamAmazon@55", "Password");
		WebActions.click(btn_signin, "Sign in");
		System.out.println("Login is successfull");
	}

}
