package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends AbstractPage {	

	@FindBy(name = "name")
	private WebElement userName;	
	
	@FindBy(tagName = "body")
	private WebElement body;
	
	public ProfilePage(WebDriver driver) {
		super(driver);			
	}
	
	public ProfilePage enterUserName(String name){
		userName.clear();
		userName.sendKeys(name);
		userName.submit();
		return PageFactory.initElements(driver, ProfilePage.class);
	}
	
	public boolean isUsernameChanged(String name){
		return body.getText().contains(name);
	}
	
}
