package com.gill.hmrc.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CreateSnippetTest extends AbstractTest {

	
	@Test
	public void test() {
		String snippet = "This is test snippet";
		
		assertTrue(startPage.clickOnAgreeStartLink()
				.clickSignUp()
				.enterUserName()
				.enterPassword()
				.clickSignIn()
				.enterUserName()
				.enterPassword()
				.clickOnNewSnippet()
				.enterSnippet(snippet)
				.isSnippetExist(snippet));		
	}

}
