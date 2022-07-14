package com.tscout.pages;

import com.tscout.testcases.TC009_InterviewPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends ProjectSpecificMethods {

	public HomePage verifyLoggedName(String data) {
		verifyPartialText(locateElement("xpath", "//a[normalize-space()='Dashboard']"), data);
		return this;
	}

	public HomePage clickCRMSFA() {
		click(locateElement("link", "CRM/SFA"));
		return new HomePage();
	}

	public LoginPage clickLogout() {
		click(locateElement("class", "decorativeSubmit"));
		return new LoginPage();

	}

	@Then("tiscout Dashboard page should be displayed")
	public DashboardPage verifyHomepage() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dashboard.Xpath")));
		return new DashboardPage();
	}
	@Then("tiscout Dashboard page should be displayed for Clients")
	public ClientsPage verifyHomepage_Clients() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dashboard.Xpath")));
		return new ClientsPage();
	}
	@Then("tiscout Dashboard page should be displayed for Job Openings")
	public JobOpenings verifyHomepage_JobOpenings() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dashboard.Xpath")));
		return new JobOpenings();
	}
	@Then("tiscout Dashboard page should be displayed for Candidate")
	public CandidatePage verifyHomepage_Candidate() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dashboard.Xpath")));
		return new CandidatePage();
	}
	@Then("tiscout Dashboard page should be displayed for Interview")
	public Interview verifyHomepage_Interview() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dashboard.Xpath")));
		return new Interview();
	}
	@Then("tiscout Dashboard page should be displayed for Task")
	public Task verifyHomepage_task() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dashboard.Xpath")));
		return new Task();
	}
	@When("Click the Add Client in the Dashboard")
	public HomePage click_AddClient() {
		click(locateElement("XPath", prop.getProperty("Dashboard.AddClient.Xpath")));
		return this;
	}

	@When("Click the Add Job in the Dashboard")
	public HomePage click_AddJob() {
		click(locateElement("XPath", prop.getProperty("Dashboard.AddJob.Xpath")));
		return this;
	}

	/*
	 * //@When("Click the Add Candidates in the Dashboard") public HomePage
	 * click_AddCandidates() { click(locateElement("XPath",
	 * prop.getProperty("Dashboard.AddCandidates.Xpath"))); return this; }
	 */

//	@When("Click the Job Openings Menu in the Dashboard")
//	public HomePage click_JobOpeningsMenu() {
//		click(locateElement("XPath", prop.getProperty("Dashboard.JobOpenings.Xpath")));
//		return this;
//	}

	/*
	 * //@When("Click the Candidates Menu in the Dashboard") public HomePage
	 * click_CandidatesMenu() { click(locateElement("XPath",
	 * prop.getProperty("Dashboard.Candidates.Xpath"))); return this; }
	 */

	@When("Click the Interview Menu in the Dashboard")
	public HomePage click_InterviewMenu() {
		click(locateElement("XPath", prop.getProperty("Dashboard.Interview.Xpath")));
		return this;
	}

	@When("Click the Task Menu in the Dashboard")
	public HomePage click_TaskMenu() {
		click(locateElement("XPath", prop.getProperty("Dashboard.Task.Xpath")));
		return this;
	}

	public Object clickCandidateMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	

		
	}


