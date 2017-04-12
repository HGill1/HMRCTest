package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage extends AbstractPage {	

	@FindBy(linkText = "New Snippet")
	private WebElement newSnippet;	
	
	@FindBy(name = "snippet")
	private WebElement snippetTextArea;	
	
	@FindBy(linkText = "My Snippets")
	private WebElement mySnippets;	
	
	@FindBy(linkText = "Upload")
	private WebElement FileUploadLink;
	
	@FindBy(linkText = "Profile")
	private WebElement profileLink;
	
	@FindBy(tagName = "body")
	private WebElement snippets;	
		
	public UserHomePage(WebDriver driver) {
		super(driver);			
	}
	
	public UserHomePage clickOnNewSnippet(){
		newSnippet.click();
		return PageFactory.initElements(driver, UserHomePage.class);
	}
	
	public void clickOnMySnippets(){
		mySnippets.click();
	}
	
	public UserHomePage enterSnippet(String snippet){
		snippetTextArea.sendKeys(snippet);
		snippetTextArea.submit();
		return PageFactory.initElements(driver, UserHomePage.class);
	}
	
	public boolean isSnippetExist(String snippet){
		return snippets.getText().contains(snippet);
	}
	
	public UploadfilePage clickUploadLink(){
		FileUploadLink.click();
		return PageFactory.initElements(driver, UploadfilePage.class);
	}
	
	public ProfilePage clickProfileLink(){
		profileLink.click();
		return PageFactory.initElements(driver, ProfilePage.class);
	}
}
