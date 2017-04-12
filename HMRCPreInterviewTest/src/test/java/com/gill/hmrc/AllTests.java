package com.gill.hmrc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.gill.hmrc.tests.CreateSnippetTest;
import com.gill.hmrc.tests.NewAccountSignUpTest;
import com.gill.hmrc.tests.UpdateProfile;
import com.gill.hmrc.tests.UploadFileTest;

@RunWith(Suite.class)
@SuiteClasses({ NewAccountSignUpTest.class, CreateSnippetTest.class, UploadFileTest.class, UpdateProfile.class })
public class AllTests {

}
