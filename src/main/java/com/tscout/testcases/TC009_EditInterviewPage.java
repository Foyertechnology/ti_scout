package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC009_EditInterviewPage extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues_AddInterview() {
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
		
		//Interview
		.click_Interview()
		.verify_InterviewList()
		.click_Editinterview()
		.verify_companyname()
		.verify_jobtitle()
		.click_jobtitle()
		.select_jobtitle()
		.verify_jobID()
		.click_jobID()
		.verify_interviewlevel()
		.click_interviewlevel()
		.select_interviewlevel()
		.click_saveNext()
		.verify_interviewlevel2()
		.verify_Candidatename()
		//.click_Candidatename()
		//.select_Candidatename()
		//.verify_interviewdatetime()
		//.click_interviewdatetime()
		.select_interviewdatetime()
		.click_okdatebutton()
		.verify_calllink()
		.enter_calllink("https://ust.com/")
		//.verify_datetimeok()
		//.click_datetimeok()
		.verify_interviewtype()
		.click_interviewtype()
		//.select_interviewtype()
		.verify_Location()
		.enter_Location("chennai")
		.verify_Interviewer()
		.enter_Interviewer("Roshan")
		.click_saveNext()
		.verify_Interviewlevel1()
		.click_Interviewlevel1()
		.verify_Interviewlevel1()
		.click_saveNext()
		.verify_companylocation()
		.enter_companylocation("chennai")
		.verify_interviewstatus()
		.click_interviewstatus("Created")
		//.select_interviewstatus()
		.verify_recruitername()
		.enter_recruitername("Meena")
		.verify_companycontact()
		.enter_companycontact("9999988888")
		.verify_remarks()
		.enter_remarks("Good")
		.click_saveNext();
		
}
}