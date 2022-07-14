package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC009_InterviewPage extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues_EditInterview() {
		testCaseName = "Interview Module";
		testDescription = "Interview";
		nodes = "Interview";
		authors = "Testing Team";
		category = "Functional Test";
		dataSheetName = "Interview";
	}

	@Test(dataProvider = "fetchData")
	public void Create_JobOpenings(String uName, String pwd) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage_Interview()
		//job Opening
		//.click_JobOpeningsMenu()
		//.verify_JobOpeningsList()
		//.click_firstuser()
		//.click_Addcandidate()
		//.click_headercandidatecheckbox()
		//.click_headercandidatecheckbox()
		//.click_candidatecheckbox()
		//.click_candidatecheckbox1()
		//.click_Addselectedcandidate()
		//.verify_ATSstatus()
		//.drag_candidate()
		//.click_savebutton()
		//.drag_candidate1()
		//.click_okbutton()
		//.drag_candidate2()
		//.click_okbutton()
		//.drag_candidate3()
		//.click_okbutton()
		//.drag_candidate4()
		//.click_okbutton()
		
		//Interview
		.click_Interview()
		.verify_InterviewList()
		.click_createinterview()
		.click_companyname()
		.click_Searchoption()
		.enter_SourcingLocation("ADASTRA")
		.click_searchedcompany()
		.click_jobtitle()
		.select_jobtitle()
		//.click_jobID()
		.click_interviewlevel()
		.select_interviewlevel()
		.click_saveNext()
		.click_Candidatename()
		.select_Candidatename()
		.click_interviewdatetime()
		.select_interviewdatetime()
		.enter_calllink("https://ust.com/")
		.click_datetimeok()
		.click_interviewtype()
		//.select_interviewtype()
		.enter_Location("chennai")
		.enter_Interviewer("Roshan")
		.click_saveNext()
		.click_Interviewlevel1()
		.verify_Interviewlevel1()
		.click_saveNext()
		.enter_companylocation("chennai")
		.click_interviewstatus("Created")
		.select_interviewstatus()
		.enter_recruitername("Meena")
		.enter_companycontact("9999988888")
		.enter_remarks("Good")
		.click_saveNext();
		
}
}