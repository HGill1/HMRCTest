package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {	

	@FindBy(linkText = "Sign up")
	private WebElement signUpLink;	
	
	@FindBy(linkText = "Sign in")
	private WebElement signInLink;
	
	@FindBy(id = "test")
	private WebElement snippetsText;
		
	public HomePage(WebDriver driver) {
		super(driver);			
	}
	
	public SignUpPage clickSignUp(){
		signUpLink.click();
		return PageFactory.initElements(driver, SignUpPage.class);
	}
	
	public void clickSignIn(){
		signInLink.click();
	}
}
