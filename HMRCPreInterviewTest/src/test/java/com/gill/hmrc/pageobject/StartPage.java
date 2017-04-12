package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends AbstractPage {	

	@FindBy(linkText = "Agree & Start")
	private WebElement startLink;	
		
	public StartPage(WebDriver driver) {
		super(driver);			
	}
	
	public HomePage clickOnAgreeStartLink(){
		startLink.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
}
