package com.testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetupBrowser {

	public WebDriver driver;
	
	public String driverPath = new String("C:\\Users\\Crystal Soriente\\Documents\\EdwardSelenium\\CreditorWatch_V1\\Drivers\\chromedriver.exe");
	
	@BeforeClass
	public void invokeBrowser()	
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize()					;
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://creditorwatch.com.au");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
