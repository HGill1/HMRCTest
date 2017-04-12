package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountConfirmationPage extends AbstractPage {	

	@FindBy(css = ".message")
	private WebElement AccountCreatedMsg;
	

	@FindBy(linkText = "Sign in")
	private WebElement signInLink;
		
		
	public AccountConfirmationPage(WebDriver driver) {
		super(driver);			
	}
	
	public boolean IsAccountCreated(){
		return AccountCreatedMsg.getText().contains("Account created.");
	}
	
	public SignInPage clickSignIn(){
		signInLink.click();
		return PageFactory.initElements(driver, SignInPage.class);
	}
}
