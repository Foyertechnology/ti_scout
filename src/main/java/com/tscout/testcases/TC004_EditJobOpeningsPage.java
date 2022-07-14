package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC004_EditJobOpeningsPage extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues_EdiJobOpenings() {
		testCaseName = " Edit Job Openings Module";
		testDescription = "Job Openings Module to Cretae New Clients";
		nodes = "Job Openings";
		authors = "Testing Team";
		category = "Functional Test";
		dataSheetName = "JobOpenings";
	}

	@Test(dataProvider = "fetchData")
	public void Create_JobOpenings(String uName, String pwd, String JobTitle , String JobDescription, String Tags) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage_JobOpenings()
		.click_JobOpeningsMenu()
		.verify_JobOpeningsList()
		.clickJobOpenings_EditjobBtn()
		.verify_CreateANewOpeningsPage()
		.verify_JobTitle()
		.enter_JobTitle(JobTitle)
		//.ClickJobOpening_CopyJDBuilderLink()
		//.verifyJobOpenings_JDPage()
		//.SelectJobOpenings_JDSelectBtn()
		//.enter_JobDescription(JobDescriptin)
		//.verify_ValidationMsg()
	    //.verify_JobDescription()
		.verify_JobOpenings_Tags()
		.ClickJobOpenings_Tags()
		.SelectJobOpenings_Tags()
		.ClickJobOpenings_Tags()
		.ClickclearJobOpenings_Tags()
		//.enterJobOpenings_Tags(Tags)
		.ClickJobOpenings_Tags()
		.SelectJobOpenings_Tags()
		.Verify_JobOpenings_Client()
		.ClickJobOpenings_Client()
		.enterJobOpenings_Client("BTC AG")
		.verifyJobOpening_ClientSearchresult()
		.SelectJobOpenings_Client()
		.verifyJobOpening_ClientContacts()
		.ClickJobOpenings_ClientContacts()
		//.SelectJobOpenings_ClientContacts()
		.SelectJobOpenings_ClientContacts()
		
		.SelectJobOpenings_Edit_NextBtn()
		
		//.verify_CreateANewOpeningsPage()
		.verify_Numberofvancancy()
		.enter_Numberofvancancy()
		.verify_Typesofpriority()
		.click_Typesofpriority("low")
		//.click_Selectpriority()
		.verify_JobCategories()
		.click_JobCategories()
		.click_SelectJobCategories()
		.verify_Recruiter()
		.click_Recruiter1()
		.click_SelectRecruiter()
		.click_SelectRecruiter()
		.click_Outside()
		.verify_Accountowner()
		.click_Accountowner()
		.select_Accountowner()
		.verify_Qualification()
		.click_Qualification()
		.click_SelectQualification()
		.SelectJobOpenings_Edit_NextBtn()
		
		//Other Details
		.verify_JobLocation()
		.enter_JobLocation("Velachery")
		//.verify_JobOpeningdate()
		.click_JobOpeningdate()
		.Select_JobOpeningdate()
		//.verify_SubmissionDuedate()
		.click_SubmissionDuedate()
		.Select_SubmissionDuedate()
		//employement type
		.verify_JobType()
		.click_JobType()
		.Select_JobType()
		.click_StartAsap()
		.verify_SalaryIn()
		.enter_SalaryIn("150000")
		.verify_PermFee()
		.enter_PermFee("150")
		.click_StartAsap()
		.verify_PostingStatus()
		.click_PostingStatus("Internal")
		//.Select_PostingStatus()
		.SelectJobOpenings_Edit_NextBtn()
		.verify_addskills()
		.click_addskills()
		.Select_addskills()
		.verify_SourcingLocation()
		.enter_SourcingLocation("chennai")
		.verify_addLanguage()
		.click_addLanguage()
		.Select_addLanguage()
		.verify_Locationradius()
		.enter_Locationradius("20")
		.click_Locationradius("KM")
		//.Select_Locationradius()
		.verify_Candidatetags()
		.click_Candidatetags()
		.Select_Candidatetags()
		.verify_source()
		.click_source()
		.Select_source()
		.click_Email()
		.verify_noticeperiod()
		.enter_noticeperiod("8")
		.verify_Experience()
		.enter_Experience("8")
		.SelectJobOpenings_Next_NextBtn();
}
}