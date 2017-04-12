package com.gill.hmrc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadfilePage extends AbstractPage {	

	@FindBy(name = "upload_file")
	private WebElement fileUpload;	
	
	@FindBy(tagName = "body")
	private WebElement bodyTag;
	
	public UploadfilePage(WebDriver driver) {
		super(driver);			
	}
	
	public UploadfilePage uploadFile(){
		String filePath = System.getProperty("user.dir");
		fileUpload.sendKeys(filePath + "/files/relax.jpg");
		fileUpload.submit();
		return PageFactory.initElements(driver, UploadfilePage.class);
	}
	
	public boolean isFileUploaded(){
		return bodyTag.getText().contains("File uploaded!");
	}
	
}
