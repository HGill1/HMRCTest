package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

	protected WebDriver driver;
		
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public StartPage navigateToTestSite() {

		driver.navigate().to("https://google-gruyere.appspot.com/start");
		return PageFactory.initElements(driver, StartPage.class);
	}
}
