package com.gill.hmrc.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UploadFileTest extends AbstractTest {

	
	@Test
	public void test() {
				
		assertTrue(startPage.clickOnAgreeStartLink()
				.clickSignUp()
				.enterUserName()
				.enterPassword()
				.clickSignIn()
				.enterUserName()
				.enterPassword()
				.clickUploadLink()
				.uploadFile()
				.isFileUploaded());		
	}

}
