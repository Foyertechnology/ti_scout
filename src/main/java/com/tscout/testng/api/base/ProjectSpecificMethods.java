package com.tscout.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.tscout.selenium.api.base.SeleniumBase;

import utils.DataLibrary;


public class ProjectSpecificMethods extends SeleniumBase {

	public String dataSheetName;		

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(dataSheetName);
	}	
	@BeforeMethod
	public void PreCondition() {
		driver = startApp(prop.getProperty("Browser.Run"), prop.getProperty("Application.URL"));
		node = test.createNode(testCaseName);
	}
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	@AfterMethod
	public void afterMethod() {
		close();
	}













}
