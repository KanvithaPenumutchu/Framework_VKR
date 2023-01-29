package com.framework.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.framework.testCases.BaseClass;
import com.framework.webUtilities.WebActions;

public class SearchPage extends BaseClass{
	
	By searchbar=By.xpath("//input[@aria-label='Search']");
	By btn_search=By.id("nav-search-submit-button");
	By lnk_product=By.xpath("//span[text()='Oppo Reno8 5G (Shimmer Gold, 128 GB) (8 GB RAM)']");
	By btn_AddToCart=By.xpath("//span[text()='Add to Cart']");
	By lnk_see_more_product_details=By.xpath("//a[text()='See more product details']");
	
	
	
	
	//By dd_all=By.id("searchDropdownBox");
	By dd_all=By.xpath("//select[@name=\"url\"]");
	
	public void searchProduct() throws IOException, InterruptedException
	{
		WebActions.sendKeys(searchbar, "oppo reno 8", "searchbar");
		WebActions.click(btn_search, "search button");
		WebActions.click(lnk_product, "Product");
		List<String> l=WebActions.getWindowHandles();
		String parentWindowID=l.get(0);
		String childWindowID=l.get(1);
		driver.switchTo().window(childWindowID);
		System.out.println("child window title:"+driver.getTitle()); 
		WebActions.click(lnk_see_more_product_details, "see more product details");
		//WebActions.click(btn_AddToCart, "Add to Cart");
	}
	public void searchProduct_AddtoCart() throws IOException, InterruptedException
	{
		WebActions.sendKeys(searchbar, "oppo reno 8", "searchbar");
		WebActions.click(btn_search, "search button");
		WebActions.click(lnk_product, "Product");
		List<String> l=WebActions.getWindowHandles();
		for(String ids:l)
		{
			
		}
		System.out.println("child window title:"+driver.getTitle()); 
		WebActions.click(btn_AddToCart, "Add to Cart");
	}
	
	
	public void dropdownAll() throws InterruptedException
	{
		WebActions.selectByVisibleText(dd_all, "Amazon Devices");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectEachOption(dd_all);
	}
	
	public void ddAll_Search() throws InterruptedException
	{
		WebActions.selectByVisibleText(dd_all, "All Categories");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Alexa Skills");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Amazon Devices");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Amazon Fashion");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Amazon Fresh");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Amazon Pharmacy");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Appliances");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Apps & Games");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Baby");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Beauty");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Books");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Car & Motorbike");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Clothing & Accessories");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Collectibles");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Computers & Accessories");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Deals");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Electronics");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Furniture");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Garden & Outdoors");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Gift Cards");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Grocery & Gourmet Foods");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Health & Personal Care");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Home & Kitchen");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Industrial & Scientific");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Jewellery");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Kindle Store");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Luggage & Bags");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Luxury Beauty");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Movies & TV Shows");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Music");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Musical Instruments");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Office Products");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Pet Supplies");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Prime Video");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Shoes & Handbags");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Software");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Sports, Fitness & Outdoors");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Subscribe & Save");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Tools & Home Improvement");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Video Games");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);
		WebActions.selectByVisibleText(dd_all, "Watches");
		WebActions.sendKeysWithKeys(searchbar, Keys.ENTER);

	}
	

}
