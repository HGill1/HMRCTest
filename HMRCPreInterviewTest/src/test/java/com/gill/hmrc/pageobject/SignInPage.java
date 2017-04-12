package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends AbstractPage {	

	@FindBy(name = "uid")
	private WebElement userName;	
	
	@FindBy(name = "pw")
	private WebElement password;	
		
	public SignInPage(WebDriver driver) {
		super(driver);			
	}
	
	public SignInPage enterUserName(){
		userName.sendKeys("Test");
		return PageFactory.initElements(driver, SignInPage.class);
	}
	
	public UserHomePage enterPassword(){
		password.sendKeys("Test");
		password.submit();
		return PageFactory.initElements(driver, UserHomePage.class);
	}
	
}
