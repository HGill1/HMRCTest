package com.gill.hmrc.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NewAccountSignUpTest extends AbstractTest {

	@Test
	public void test() {
		
		assertTrue(startPage
		.clickOnAgreeStartLink()
		.clickSignUp()
		.enterUserName()
		.enterPassword().
		IsAccountCreated());
	}


}
