package com.gill.hmrc.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UpdateProfile extends AbstractTest {

	
	@Test
	public void test() {
		
		String newUsername = "Tester";
				
		assertTrue(startPage.clickOnAgreeStartLink()
				.clickSignUp()
				.enterUserName()
				.enterPassword()
				.clickSignIn()
				.enterUserName()
				.enterPassword()
				.clickProfileLink()
				.enterUserName(newUsername)
				.isUsernameChanged(newUsername));		
	}

}
