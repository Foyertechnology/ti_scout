package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC002_LoginForFailure extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues_LoginFailure() {

		testCaseName = "Login(Negative)";
		testDescription = "Login for Failure(Negative testCase)";
		nodes = "Leads";
		authors = "Hari";
		category = "Smoke";
		dataSheetName = "TC002";

	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd, String errMsg) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogInForFailer()
		.verifyErrorMsg(errMsg);
	}


}





