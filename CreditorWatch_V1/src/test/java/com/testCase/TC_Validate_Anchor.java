package com.testCase;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
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
		
		try{
		Boolean isDisplayed = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/covid19/')]")).isDisplayed();
		Boolean isDisplayed1 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/creditorwatch/')]")).isDisplayed();
		Boolean isDisplayed2 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/experts/')]")).isDisplayed();
		Boolean isDisplayed3 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/ppsr-and-ppsa/')]")).isDisplayed();
		Boolean isDisplayed4 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/risk-management/')]")).isDisplayed();
		Boolean isDisplayed5 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/small-business/')]")).isDisplayed();
		Boolean isDisplayed6 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog')]")).isDisplayed();
//		Boolean isDisplayed17 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/covid19/')]")).isDisplayed();
		
		Boolean isDisplayed18 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/author/paulmead/')]")).isDisplayed();
		Boolean isDisplayed19 = driver.findElement(By.xpath("//a[contains(@href,'https://twitter.com/share?url=https://creditorwatch.com.au/blog/ppsr-to-protect-your-business-in-the-covid19-aftermath/&text=Using%20the%20PPSR%20to%20Protect%20Your%20Business%20in%20the%20COVID-19%20Aftermath')]")).isDisplayed();
		Boolean isDisplayed110 = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/sharer/sharer.php?u=https://creditorwatch.com.au/blog/ppsr-to-protect-your-business-in-the-covid19-aftermath/&display=popup&ref=plugin&src=share_button')]")).isDisplayed();
		Boolean isDisplayed111 = driver.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/shareArticle?mini=true&url=https://creditorwatch.com.au/blog/ppsr-to-protect-your-business-in-the-covid19-aftermath/')]")).isDisplayed();
		Boolean isDisplayed112 = driver.findElement(By.xpath("//a[contains(@href,'https://treasury.gov.au/coronavirus/businesses')]")).isDisplayed();
		Boolean isDisplayed113 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/zombie-companies/')]")).isDisplayed();
//		Boolean isDisplayed114 = driver.findElement(By.xpath("//a[contains(@href,'https://ppsrlogic.com.au/")).isDisplayed();
		Boolean isDisplayed115 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/temporary-restructuring-relief-2021/')]")).isDisplayed();
		
		Boolean isDisplayed116 = driver.findElement(By.xpath("//a[contains(@href,'https://www.ledlinlawyers.com.au/')]")).isDisplayed();
		Boolean isDisplayed117 = driver.findElement(By.xpath("//a[contains(@href,'https://www.ledlinlawyers.com.au/led-check/')]")).isDisplayed();
		Boolean isDisplayed118 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/features/payment-predictor/')]")).isDisplayed();
		Boolean isDisplayed119 = driver.findElement(By.xpath("//a[contains(@href,'https://go.creditorwatch.com.au/l/888193/2020-09-21/2xjb/888193/16521/The_Personal_Property_Securities_Register.pdf')]")).isDisplayed();
//		Boolean isDisplayed120 = driver.findElement(By.xpath("//a[contains(@href,'https://ppsrlogic.com.au/')]")).isDisplayed();
		Boolean isDisplayed121 = driver.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/in/paul-mead-6296144a/')]")).isDisplayed();
		Boolean isDisplayed122 = driver.findElement(By.xpath("//a[contains(@href,'mailto:paul.mead@creditorwatch.com.au')]")).isDisplayed();
//		Boolean isDisplayed123 = driver.findElement(By.xpath("//a[contains(@href,'https://creditorwatch.com.au/blog/category/covid19/')]")).isDisplayed();
		
			System.out.print("Anchor Tag Text Exist");
		}
		catch(NoSuchElementException e){
			System.out.print("Anchor Tag Text Not Exist");
		}
	
	}
	

}
