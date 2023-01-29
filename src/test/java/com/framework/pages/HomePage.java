package com.framework.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.framework.webUtilities.WebActions;

public class HomePage {
	
	By menu_all=By.xpath("//span[text()='All']//preceding-sibling::i");
	By lnk_Best_Sellers=By.xpath("//ul[@class='hmenu hmenu-visible']//a[text()='Best Sellers']");
	By lnk_New_Releases=By.xpath("//ul[@class='hmenu hmenu-visible']//a[text()='New Releases']");
	By lnk_MoversAndShakers=By.xpath("//ul[@class='hmenu hmenu-visible']//a[text()='Movers and Shakers']");
	By lnk_Amazon_miniTV=By.xpath("//a[text()='Amazon miniTV- FREE entertainment']");
	By lnk_EchoAndAlexa=By.xpath("//div[text()='Echo & Alexa']");
	By lnk_MainMenu=By.xpath("//div[text()='main menu']//i[@class='align-items: center;']/..");
	
	
	
	public void homePage() throws InterruptedException
	{
		WebActions.click(menu_all, "All");
		WebActions.click(lnk_Best_Sellers, "Best Sellers");
		/*String actual_title="Amazon.in Bestsellers: The most popular items on Amazon";
		String expected_title=WebActions.get_Title();
		WebActions.checkTitle(actual_title, expected_title);*/
	
		Thread.sleep(3000);
		WebActions.click(menu_all, "All");
		WebActions.click(lnk_New_Releases, "New Releases");
		Thread.sleep(3000);
		WebActions.click(menu_all, "All");
		WebActions.click(lnk_MoversAndShakers, "Movers and Shakers");
		Thread.sleep(3000);
		WebActions.click(menu_all, "All");
		try {
			WebActions.click(lnk_Amazon_miniTV, "Amazon miniTV");
			WebActions.back();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		WebActions.click(lnk_EchoAndAlexa, "Echo & Alexa");
		WebActions.click(lnk_MainMenu, "MAIN MENU");
	
		
		
		
		
	}

}
