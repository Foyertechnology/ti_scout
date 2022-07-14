package com.tscout.testcases;

import org.testng.annotations.BeforeTest;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/tscout/Task.feature", 
glue = "com.tscout.pages", 
monochrome = true, 
publish = true)

public class TscoutCucumberRunner extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "Tscout User Application";
		testDescription = "Tscout_User testCase using positive data from feature file";
		nodes = "Foyer Tech - User Module";
		authors = "Testing Team";
		category = "Functional";

	}

}
