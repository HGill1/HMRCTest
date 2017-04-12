package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends AbstractPage {	

	@FindBy(name = "uid")
	private WebElement userName;	
	
	@FindBy(name = "pw")
	private WebElement password;	
	
	public SignUpPage(WebDriver driver) {
		super(driver);			
	}
	
	public SignUpPage enterUserName(){
		userName.sendKeys("Test");
		return PageFactory.initElements(driver, SignUpPage.class);
	}
	
	public AccountConfirmationPage enterPassword(){
		password.sendKeys("Test");
		password.submit();
		return PageFactory.initElements(driver, AccountConfirmationPage.class);
	}	
}
