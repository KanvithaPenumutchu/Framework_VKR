package com.framework.pages;

import org.openqa.selenium.By;

import com.framework.webUtilities.WebActions;

public class MenuInHomePage {
	
	By menu_all=By.xpath("//span[text()='All']//preceding-sibling::i//following-sibling::span/..");
	By Btn_into=By.xpath("//div[@class='nav-sprite hmenu-close-icon']");
	By lnk_Fresh=By.xpath("//a[text()='Fresh']");
	By lnk_BestSellers=By.xpath("//a[text()='Fresh']//following-sibling::a[text()='Best Sellers']");
	By lnk_NewReleases=By.xpath("//a[text()='Fresh']//following-sibling::a[text()='New Releases']");
	By lnk_GiftCards=By.xpath("//a[text()='Gift Cards']");
	By lnk_Books=By.xpath("//a[text()='Books']");
	By lnk_GiftIdeas=By.xpath("//a[text()='Gift Ideas	']");
	By lnk_BuyAgain=By.xpath("//a[text()='Buy Again']");
	By lnk_HomeImprovement=By.xpath("//a[text()='Home Improvement']");
	By lnk_AmazonBasics=By.xpath("//a[text()='AmazonBasics']");
	By lnk_Kindle_eBooks=By.xpath("//a[text()='Kindle eBooks']");
	By lnk_Baby=By.xpath("//a[text()='Baby']");
	By img_Shopping_made_easy_Download_the_app=By.xpath("//div[@class='nav-right']//img");
	
	
	public void menuCheck()
	{
		WebActions.click(menu_all, "All dd in menu bar");
		WebActions.click(Btn_into, "cross");
		WebActions.click(lnk_Fresh, "Fresh");
		WebActions.click(lnk_BestSellers, "Best Sellers");
		WebActions.click(lnk_NewReleases, "New Releases");
		WebActions.click(lnk_GiftCards, "Gift Cards");
		WebActions.click(lnk_Books, "Books");
		WebActions.click(lnk_GiftIdeas, "Gift Ideas");
		WebActions.click(lnk_BuyAgain, "Buy Again");
		WebActions.click(lnk_HomeImprovement, "Home Improvement");
		WebActions.click(lnk_AmazonBasics, "Amazon Basics");
		WebActions.click(lnk_Kindle_eBooks, "Kindle eBooks");
		WebActions.click(lnk_Baby, "Baby");
		WebActions.click(img_Shopping_made_easy_Download_the_app, "Shoppind made easy | Download the app");
	}
	
	

}
