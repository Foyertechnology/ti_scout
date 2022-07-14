package com.tscout.pages;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;

public class LoginPage extends ProjectSpecificMethods {

	@Given("Enter the username as {string}")
	public LoginPage enterUserName(String data) {
		 clearAndType(locateElement("id","username"), data);
		clearAndType(locateElement("XPath", prop.getProperty("UserName.Xpath")), data);
		return this;
	}

	@Given("Enter the Password as {string}")
	public LoginPage enterPassword(String data) {
		 clearAndType(locateElement("id","password"), data);
		clearAndType(locateElement("XPath", prop.getProperty("Password.Xpath")), data);
		return this;
	}

	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(locateElement("XPath", prop.getProperty("LoginBtn.xpath")));
		return new HomePage();
	}

	public LoginPage clickLogInForFailer() {
		click(locateElement("XPath", prop.getProperty("LoginBtn.xpath")));
		return this;
	}

	@Given("Verify the error message (.*)")
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(locateElement("XPath", prop.getProperty("LoginError.Xpath")), data);
		return this;
	}

}
