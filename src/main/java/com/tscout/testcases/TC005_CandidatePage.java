package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.CandidatePage;
import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC005_CandidatePage extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues_CandidatePage() {
		testCaseName = "Candidate Module";
		testDescription = "Candidate Module to Cretae New Candidates";
		nodes = "Candidate";
		authors = "Testing Team";
		category = "Functional Test";
		dataSheetName = "Candidate";
	}

	@Test(dataProvider = "fetchData")
	public void Create_Candidate(String uName, String pwd) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage_Candidate()
		.clickCandidateMenu()
		.verify_Candidate()
		.click_filter_icon_Candidate()
		.enter_Candidatename_filter("Umair")
		.click_email_filter()
		//.select_employment_filter_Candidate()
		.select_skills_filter_Candidate()
		.click_icon_skills_filter_candidate()
		.select_tags_filter_Candidate()
		.enter_position_filter_Candidate("Tester")
		.select_language_filter_Candidate()
		.click_Search_Candidate()
		.enter_data_Search_Candidate("test")
		.clickCandidate_AddCandidateBtn()
		.verify_CreateANewCandidatePage()
		//.clickResumename_AddCandidateBtn()
		//.selectfile_AddCandidateBtn()
		//.uploadcv_AddCandidateBtn()
		//.verifycv_uploaded()
		.clickManualfilling_CandidatePage()
		.verifyManual_filling()
		.SelectSalutation_CreateCandidate()
		.enter_Firstname("Naren")
		.enter_lastname("Kojin")
		.enter_Emailid("Thomas343brandly@gmail.com")
		.enter_Mobilenumber("7347783312")
		//.Selectdateofbirth_Candidate()
		.enter_Place("Chennai")
		.Selectnationality_Candidate()
		.enter_Address("JJ Nagar")
		.enter_City("chennai")
		.enter_Country("India")
		.enter_Zipcode("603110")
		//.enter_SocialMedia("LinkedIn")
		.Selecttags_Candidate()
		.enter_experience("1")
		.enter_notes("QA Automation")
		.Click_CloseIcon()
		//click_close_popup_Candidate()
		.verify_close_Candidate()
		.click_no_popup_Candidate()
		.Clicksaveandnextbutton_Candidate()
		//Education Details
		//.verifyEducationdetails()
		.enter_Institution("Madras University")
		.enter_Candidatelocation("Chennai")
		.enter_CandidateGraduation("2018")
		.SelectStartDate_Candidate()
		.SelectEndDate_Candidate()
		.ClickEduAddmore_Candidate()
		// Certification Details
		//.verify_Certificationdetails()
		.enter_CertificationName("Core Java")
		.enter_InstituteName_Candidate("Greens Technology")
		.enter_CertificationLocation("Chennai")
		.SelectCertStartDate_Candidate() 
		.SelectCertEndDate_Candidate()
		//.ClickCertAddmore_Candidate() 
		.click_closepopup_CertCandidate()
		.verify_close_Candidate()
		.click_no_popup_Candidate()
		.ClickCertProceedtbutton_Candidate()
		//Experience
		//.verify_Experiencedetails()
		.enter_Employername("xyz")
		.enter_ExpCandidateLocation("Chennai")
		.enter_ExpCandidateJobtitle("Software Tester")
		.SelectExpStartDate_Candidate()
		.SelectExpEndDate_Candidate()
        .enterResponsibilities_Candidate("QA Automation")
        .click_closepopup_ExpCandidate()
		.verify_close_Candidate()
		.click_no_popup_Candidate()
        .ClickExperiencenextIcon_Candidate()
        //Skills
        //.verifySkillsDetails_CandidatePage()
        .SelectSkills_Candidate()
        .SelectProficiency_Candidate()
        .ClickAddSkills_Candidate()
        .ClickSkillsnextIcon_Candidate()		
		
        //Language
        //.verifyLanguageDetails_CandidatePage()
        .SelectLanguage_Candidate()
        .SelectlangProficiency_Candidate()
        //.ClickAddLanguage_Candidate()
        .click_closepopup_LangCandidate()
		.verify_close_Candidate()
		.click_no_popup_Candidate()
        .ClickLangNextIcon_Candidate()
		
        //OtherDetails
        //.VerifyOtherDetailsPage_Candidate()
        .SelectEmploymentType_Candidate()
        .SelectNoticePeriod_Candidate()
		.enterotherdetailsDays_Candidate("45")
		.SelectSalaryBasis_Candidate()
		.enterCurrentSalary_Candidate("34000")
		.enterExpectedSalary_Candidate("45000")
		.SelectCurrency_Candidate()
		//.Selectvisa_Candidate()
		.SelectOtherStartDate_Candidate()
		.SelectOtherEndDate_Candidate()
		.SelectRelocation_Candidate()
		.SelectResumeSource_Candidate()
		.click_closepopup_otherCandidate()
		.verify_close_Candidate()
		.click_no_popup_Candidate()
		.ClickotherNextIcon_Candidate()
		//.verifyvalidation_Candidate()
		.clickCandidateMenu()
		.click_manage_candidate()
		.verify_manage_candidate_list()
		.click_settingicon_manage_candidate()
		.verify_columns_manage_candidate()
		.click_settingicon_manage_candidate()
		.click_urlicon_manage_candidate()
		.click_archive_button_managecandidate()
		.click_pending_for_unarch_manage_candidate()
		.click_pending_for_deletion_manage_candidate()
		.ClickCandidateconsent_Candidate()
		.ClickCreatecontact_Candidate()
		.verifyCreate_contact()
		.enter_Firstname1("Sam")
		.enter_Lastname("Manu")
		.enter_Emailid1("mayew45@gmail.com")
		.enter_Mobilenumber1("7467763212")
		.enter_source("Naukri")
		.enter_Position("Software Test Engineer")
				/*
				 * .Clickchoosefile_Candidate() .Clicksavebutton_Candidate()
				 */
		.ClickCancelbutton_Candidate()
		.verifyvalidationmessage_CandidatePage();
}

	
	
}