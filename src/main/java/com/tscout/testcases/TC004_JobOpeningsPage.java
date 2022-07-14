package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC004_JobOpeningsPage extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues_JobOpenings() {
		testCaseName = " Job Openings Module";
		testDescription = "Job Openings Module to Edit Existing Clients";
		nodes = "Job Openings";
		authors = "Testing Team";
		category = "Functional Test";
		dataSheetName = "JobOpenings";
	}

	@Test(dataProvider = "fetchData")
	public void Create_JobOpenings(String uName, String pwd, String JobTitle, String JobDescription, String Tags) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage_JobOpenings()
		.click_JobOpeningsMenu()
		.verify_JobOpeningsList()
		.clickJobOpenings_AddJobBtn()
		.verify_CreateANewOpeningsPage()
		.enter_JobTitle(JobTitle)
		.ClickJobOpening_CopyJDBuilderLink()
		.verifyJobOpenings_JDPage()
		.SelectJobOpenings_JDSelectBtn()
		//.enter_JobDescription(JobDescription)
		//.verify_ValidationMsg()
		.ClickJobOpenings_Tags()
		.SelectJobOpenings_Tags()
		.ClickJobOpenings_Tags()
		.ClickclearJobOpenings_Tags()
		//.enterJobOpenings_Tags(Tags)
		.ClickJobOpenings_Tags()
		.SelectJobOpenings_Tags()
		.ClickJobOpenings_Client()
		.enterJobOpenings_Client("1 &1 Internet")
		.verifyJobOpening_ClientSearchresult()
		.SelectJobOpenings_Client()
		.ClickJobOpenings_ClientContacts()
		.SelectJobOpenings_ClientContacts()
		.SelectJobOpenings_Save_NextBtn()
		
		//.verify_CreateANewOpeningsPage()
		.enter_Numberofvancancy()
		.click_Typesofpriority("Low")
		//.click_Selectpriority()
		.click_JobCategories()
		.click_SelectJobCategories()
		.click_Recruiter()
		.click_SelectRecruiter()
		.click_Accountowner()
		.select_Accountowner()
		.click_Outside()
		//.click_JobPosition()
		//.click_SelectJobPosition()
		.click_Qualification()
		.click_SelectQualification()
		.SelectJobOpenings_Save_NextBtn()
		
		//Other Details
		.enter_JobLocation("Chennai, Tamil Nadu, India ")
		//.click_joblocations()
		.click_JobOpeningdate()
		.Select_JobOpeningdate()
		.click_SubmissionDuedate()
		.Select_SubmissionDuedate()
		//employement type
		.click_JobType()
		.Select_JobType()
		.click_StartAsap()
		.enter_SalaryIn("150000")
		.enter_PermFee("150")
		.click_PostingStatus("Internal")
		//.Select_PostingStatus()
		.SelectJobOpenings_Save_NextBtn()
		.click_addskills()
		.Select_addskills()
		.enter_SourcingLocation("chennai")
		.click_addLanguage()
		.Select_addLanguage()
		.enter_Locationradius("20")
		.click_Locationradius("KM")
		//.Select_Locationradius()
		.click_Candidatetags()
		.Select_Candidatetags()
		.click_source()
		.Select_source()
		.click_Email()
		.enter_noticeperiod("8")
		.enter_Experience("8")
		.SelectJobOpenings_NextBtn();
}
}