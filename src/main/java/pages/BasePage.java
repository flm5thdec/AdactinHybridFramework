package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest {
	
	public void type(WebElement element,String text)
	{
		waitForElementPresence(element);
		element.sendKeys(text);
	}
	
	private void waitForElementPresence(WebElement element) {
		
		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(configProp.getProperty("explicitWait"))));
		myWait.until(ExpectedConditions.visibilityOf(element));
	}

	public void click(WebElement element)
	{
		waitForElementPresence(element);
		element.click();
	}
	
	public void clickUsingJS(WebElement element)
	{
		//write code by your own
	}
	
	public void selectOptionFromDropdown(WebElement element,String option)
	{
		waitForElementPresence(element);
		new Select(element).selectByVisibleText(option);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
	}
	
	public void verifyTextPresentAsValue(WebElement element,String text)
	{
		
		Assert.assertTrue(element.getAttribute("value").contains(text));
		
	}
	
	public void verifyTitle(String expTitle)
	{
		Assert.assertEquals(getTitle(), expTitle);
	}
	

}
