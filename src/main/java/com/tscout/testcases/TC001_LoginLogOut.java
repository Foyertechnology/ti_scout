package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC001_LoginLogOut extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues_Login() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase";
		nodes = "Login";
		authors = "Testing Team";
		category = "Smoke Test";
		dataSheetName = "Login";
	}

	@Test(dataProvider = "fetchData")
	public void tiscout_Login(String uName, String pwd) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage();
		//.clickLogout();		
	}


}





