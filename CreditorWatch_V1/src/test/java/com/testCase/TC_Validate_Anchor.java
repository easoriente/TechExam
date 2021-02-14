package com.testCase;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_Validate_Anchor extends SetupBrowser
{	
	@Test
	public void validateAnchor()
	{	
		driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog')]")).click();
		Select drpCategories = new Select(driver.findElement(By.name("cat")));
		drpCategories.selectByVisibleText("Risk Management");
		driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/ppsr-to-protect-your-business-in-the-covid19-aftermath/')]")).click();
			
		List<WebElement> objLinks = driver.findElements(By.tagName("a"));
		
		for (WebElement objCurrentLink : objLinks)
		{
			String strLinkText = objCurrentLink.getText();
			
			System.out.println(strLinkText);
		}
	
	}
	

}
