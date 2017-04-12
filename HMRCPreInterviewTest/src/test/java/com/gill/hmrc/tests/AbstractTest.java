package com.gill.hmrc.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gill.hmrc.pageobject.StartPage;


public class AbstractTest {
	protected static WebDriver driver;
	protected StartPage startPage;

	@Before
	public void testSet() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    //capabilities.setCapability("marionette", true);
	    //driver = new FirefoxDriver(capabilities);
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);
				
		startPage = new StartPage(driver);
		startPage = startPage.navigateToTestSite();
	}

	@After
	public void CloseBrowser() throws Exception {
		driver.close();
	}
	

}
