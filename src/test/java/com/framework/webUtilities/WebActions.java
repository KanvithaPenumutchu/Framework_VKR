package com.framework.webUtilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.framework.testCases.BaseClass;



public class WebActions extends BaseClass{
	
	public static int time=60;
	public static Alert alert;
	public static Select s;
	public static Actions act;
	
	//open application
		public static void enterURL(String url)
		{
			driver.get(url);
			//ExtentReportManager.logInfo("Successfully entered URL "+url);
			//ExtentReportManager.extent.
		}
		
		//clear() method
		public static void clear(By locator, String info)
		{
			WebElement e=waitForVisibility(locator);
			e.clear();
		//	ExtentReportManager.logInfo("Successfully cleared the text from "+ info + "input box");
			System.out.println("Successfully cleared the text from "+ info + "input box");
		}
		
		//click() method
		public static void click(By locator, String info) {
			// driver.findElement(locator).click();
			WebElement e = waitForVisibility(locator);
			e.click();
			//ExtentReportManager.logInfo("Successfully clicked on :"+ info);
			System.out.println("Successfully clicked on :"+ info);
		}
		
		//sendKeys() method
		public static void sendKeys(By locator, String text, String info)
		{
			WebElement e=waitForVisibility(locator);
			e.sendKeys(text);
			//ExtentReportManager.logInfo("Successfully entered :"+text+" into "+ info);
			System.out.println("Successfully entered :"+text+" into "+ info);
		}
		
		//sendKeys() method using Keys class 
		public static void sendKeysWithKeys(By locator, Keys keys)
		{
			WebElement e=waitForVisibility(locator);
			e.sendKeys(keys);
			
		}
		
		//getText() method
		public static String getText(By locator, String  info)
		{
			WebElement e=waitForVisibility(locator);
			String value_of_gettext=e.getText();
			System.out.println("successfully got the text from : "+info);
		//	ExtentReportManager.logInfo("successfully got the text from : "+info);
			return value_of_gettext;
		}
		
		//getAttribute() method
		public static String getAttribute(By locator, String attributename, String info)
		{
			WebElement e=waitForVisibility(locator);
			String value_of_getattribute=e.getAttribute(attributename);
			System.out.println("successfully got the value of : "+info+" attribute");
			return value_of_getattribute;
		}
		
		//getTitle() method
		public static String get_Title()
		{
			String title=driver.getTitle();
		//	System.out.println("successfully got the title of : " +info+ " page");
			return title;
		}
		
		//isDisplayed() method
		public static boolean isDisplayed(By locator, String info)
		{
			WebElement e=waitForVisibility(locator);
			boolean displayed_status=e.isDisplayed();
			if(displayed_status==true)
			{
				System.out.println("successfully displayed the : " +info+ " in the web page");
			}else {
				System.out.println("Unsuccessfully displayed the : " +info+ " in the web page");
			}
			
			return displayed_status;
		}
		
		//isEnabled() method
		public static boolean isEnabled(By locator, String info)
		{
			WebElement e=waitForVisibility(locator);
			boolean enabled_status=e.isEnabled();
			if(enabled_status==true)
			{
				System.out.println("successfully enabled the : " +info+ " in the web page");
			}else {
				System.out.println("Unsuccessfully enabled the : " +info+ " in the web page");
			}
			return enabled_status;
		}
		
		//isSelected() method
		public static boolean isSelected(By locator)
		{
			WebElement e=waitForClickable(locator);
			boolean selected_status=e.isSelected();
			return selected_status;
		}
		
		//getWindowHandle() method
		public static String getWindowHandle(String info)
		{
			String windowID=driver.getWindowHandle();
			System.out.println("successfully return the current window Id of "+info);
			return windowID;
		}
		
		//getWindowHandles() method
		public static List<String> getWindowHandles()
		{
			Set<String> windowIDs=driver.getWindowHandles();
			List<String >windowIDslist=new ArrayList(windowIDs); // covert Set ---> List
			/*String parentWindowID=windowIDslist.get(0);
			String childWindowID=windowIDslist.get(1);
			driver.switchTo().window(childWindowID);
			System.out.println("child window title:"+driver.getTitle()); 
			*/
			return windowIDslist;
		}
		
		//maximize screen
		public static void maximize_Browser()
		{
			driver.manage().window().maximize();
		}
		
		//minimize screen
		public static void minimize_Browser()
		{
			driver.manage().window().minimize();
		}
		
		//refresh method
		public static void refresh()
		{
			driver.navigate().refresh();
		}
		
		//forward method
		public static void forward()
		{
			driver.navigate().forward();
		}
		
		//backward method
		public static void back()
		{
			driver.navigate().back();
		}

		
		//waitForVisibility() method
		public static WebElement waitForVisibility(By locator)
		{
			WebElement element = new WebDriverWait(driver, Duration.ofSeconds(time))
			        .until(ExpectedConditions.visibilityOfElementLocated(locator));
				return element;
		}
		
		//waitForClickable() method
		public static WebElement waitForClickable( By locator)
		{
			WebElement element=new WebDriverWait(driver,Duration.ofSeconds(time))
					.until(ExpectedConditions.elementToBeClickable(locator));
			return element;
		}
		
		//waitForSelected() method
		public static Boolean waitForSelectable_status(By locator)
		{
			Boolean status=new WebDriverWait(driver,Duration.ofSeconds(time))
					.until(ExpectedConditions.elementToBeSelected(locator));
			return status;
		}
		
		
		
		
		//checkbox
		public static void checkBox_click(By locator)
		{
			WebElement e=waitForClickable(locator);
			e.click();
		}
		
		//waitForClickable_multiple() method
		public static List<WebElement> waitForClickable_multiple(By locator)
		{
			List<WebElement> elements=new WebDriverWait(driver,Duration.ofSeconds(time))
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
			for(WebElement element:elements)
			{
				element.click();
			}
			return elements;
		}
		
		//No of checkboxes
		public static void checkBoxes(By locator)
		{
			List<WebElement> checkboxes=waitForClickable_multiple(locator);
			//List<WebElement> checkboxes=driver.findElements(locator);
			for(WebElement checkbox:checkboxes)
			{
				checkbox.click();
			}
		}
		
		//switching to alert window
		public static void switchToAlert()
		{
			alert=driver.switchTo().alert();
		}
		
		//accept alert handling
		public static void accept_alert()
		{
			alert.accept();
		}
		
		//dismiss alert handling
		public static void dismiss_alert()
		{
			alert.dismiss();
		}
		
		//sending text to alert
		public static void sendKeys_alert(String text)
		{
			alert.sendKeys(text);
		}
		
		//getting text from the alert
		public static String getText_alert()
		{
			String textFromAlert=alert.getText();
			return textFromAlert;
		}
		
		
		
		//select option from dropdown by using select by index method
		public static void selectByIndex(By locator, int index)
		{
			WebElement e=waitForClickable(locator);
			s=new Select(e);
			s.selectByIndex(index);
		}
		
		//select option from dropdown by using select by value method
		public static void selectByValue(By locator, String value)
		{
			WebElement e=waitForVisibility(locator);
			s=new Select(e);
			s.selectByValue(value);
		}
		
		//select option from dropdown by using selectByVisibleText() method
		public static void selectByVisibleText(By locator, String text)
		{
			/*boolean isSelectable=waitForSelectable_status(locator);
			if(isSelectable)
			{
				s=new Select(driver.findElement(locator));
				s.selectByVisibleText(text);
			}*/
			/*WebElement e=driver.findElement(locator);
			//WebElement e=waitForVisibility(locator);
			e.click();*/
			
			s=new Select(driver.findElement(locator));
			s.selectByVisibleText(text);
			
			
		}
		
		//select all options from dropdown using getoptions method
		public static List<WebElement> getOptions(By locator)
		{
			WebElement e=waitForClickable(locator);
			s=new Select(e);
			List<WebElement> options=s.getOptions();
			for(WebElement option:options)
			{
				String text_option=option.getText();
				System.out.println(text_option);
			}System.out.println("Test Completed");
			return options;
		}
		
		//select each value in dropdown
		public static void selectEachOption(By locator) throws InterruptedException
		{
			//WebElement e=waitForClickable(locator);
			s=new Select(driver.findElement(locator));
			List<WebElement> options=s.getOptions();
			System.out.println("size of the dropdown values "+options.size());
			
			for(WebElement option:options)
			{
				System.out.println(option.getText());
				option.click();
				System.out.println("successfully clicked on :"+ option.getText());
				Thread.sleep(2000);
			}
			
		}
		
		public static void checkTitle(String actual, String expected)
		{
			Assert.assertEquals(actual, expected);
			System.out.println("both title are equal");
		}
		
		
		public static void actionClick(WebElement element)
		{
			act=new Actions(driver);
			act.moveToElement(element).click();
		}
		
		//Control+a using actions class
		public static void keyBoardActionCtrlA()
		{
			act=new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		}
		//delete opration
		public static void keyBoardActionCtrlA_Delete(WebElement element)
		{
			act=new Actions(driver);
			act.click(element).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		}

		
		


}
