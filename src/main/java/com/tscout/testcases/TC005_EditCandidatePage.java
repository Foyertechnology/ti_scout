package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.CandidatePage;
import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC005_EditCandidatePage extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues_EditCandidatePage() {
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
		.click_Search_Candidate()
		.click_filter_icon_Candidate()
		.enter_Candidatename_filter("Renu")
		.click_email_filter()
		.clickCandidateList_Candidate()
		.clickEditIcon_Candidate()
		.verifyEditPage_Candidate()
		.verifySalutation_EditCandidate()
		.SelectSalutation_CreateCandidate()
		.verifyFirstname_EditCandidate()
		.enter_Firstname("Renu")
		.verifyLastname_EditCandidate()
		.enter_lastname("Ezhil")
		.verify_Emailid_EditCandidate()
		//.enter_Emailid("issac.abshi799@hotmail.com")
		//.verify_Mobilenumber_EditCandidate()
		.enter_Mobilenumber("7332223312")
		.verify_dateofbirth_Candidate()
		//.Selectdateofbirth_Candidate()
		.verify_place_editcandidate()
		.enter_Place("Chennai")
		.verify_nationality_EditCandidate()
		.Selectnationality_Candidate()
		.verify_address_EditCandidate()
		.enter_Address("JJ Nagar")
		.verify_city_EditCandidate()
		.enter_City("chennai")
		.verify_country_EditCandidate()
		.enter_Country("India")
		.verify_zipcode_EditCandidate()
		.enter_Zipcode("603110")
		.verify_tags_editCandidate()
		.Selecttags_Candidate()
		.verify_experience_Edit_Candidate()
		.enter_experience("1")
		.verify_notes_EditCandidate()
		.enter_notes("QA Automation")
		.Click_CloseIcon()
		.verify_close_Candidate()
		.click_no_popup_Candidate()
		.Clickeditandnextbutton_EditCandidate()
		//Education Details
		//verifyEducationdetails()
		.verifyInstitution_editCandidate()
		.enter_Institution("Joseph University")
		.verify_location_editcandidate()
		.enter_Candidatelocation("Chennai")
		.verify_graduation_editcandidate()
		.enter_CandidateGraduation("2019")
		.verify_startdate_editCandidate()
		.SelectStartDate_Candidate()
		.verify_enddate_editcandidate()
		.SelectEndDate_Candidate()
		.ClickEduAddmore_Candidate()
		// Certification Details
		//.verify_Certificationdetails()
		.verify_CertificationName_EditCandidate()
		.enter_CertificationName("Java")
		.verify_Institution_EditCandidate()
		.enter_InstituteName_Candidate("Vels Technology")
		.verify_Certification_Location_EditCandidate()
		.enter_CertificationLocation("Chennai")
		.verify_Cert_Startdate_EditCandidate()
		.SelectCertStartDate_Candidate() 
		.verify_CertEndDate_EditCandidate()
		.SelectCertEndDate_Candidate()
		//ClickCertAddmore_Candidate() 
		.click_proceed_EditCandidate()
		//Experience
		//.verify_Experiencedetails()
		.verify_Employername_EditCandidate()
		.enter_Employername("ABC")
		.verify_Exp_CandidateLocation_EditCandidate()
		.enter_ExpCandidateLocation("Chennai")
		.verify_ExpCandidate_Jobtitle_EditCandidate()
		.enter_ExpCandidateJobtitle("Software Tester")
		.verify_ExpStartDate_EditCandidate()
		.SelectExpStartDate_Candidate()
		.verify_ExpEndDate_EditCandidate()
		.SelectExpEndDate_Candidate()
		.verify_Responsibilities_EditCandidate()
        .enterResponsibilities_Candidate("QA Automation")
        .click_proceed_EditCandidate()
        //Skills
        //.verifySkillsDetails_CandidatePage()
        .verifySkills_EditCandidate()
        .SelectSkills_Candidate()
        .verify_Proficiency_EditCandidate()
        .SelectProficiency_Candidate()
        .ClickAddSkills_Candidate()
        .click_proceed_EditCandidate()		
		
        //Language
        //.verifyLanguageDetails_CandidatePage()
        .verifyLanguage_EditCandidate()
        .SelectLanguage_Candidate()
        .verify_LangProficiency_EditCandidate()
        .SelectlangProficiency_Candidate()
        .ClickAddLanguage_Candidate()
        .click_proceed_EditCandidate()
		
        //OtherDetails
        //.VerifyOtherDetailsPage_Candidate()
        .verify_EmploymentType_EditCandidate()
        .SelectEmploymentType_Candidate()
        .verify_NoticePeriod_EditCandidate()
        .SelectNoticePeriod_Candidate()
        //.verifyOtherDetailsdays_EditCandidate()
		.enterotherdetailsDays_Candidate("45")
		.verifySalaryBasis_EditCandidate()
		.SelectSalaryBasis_Candidate()
		.verify_CurrentSalary_EditCandidate()
		.enterCurrentSalary_Candidate("34000")
		.verify_ExpectedSalary_EditCandidate()
		.enterExpectedSalary_Candidate("45000")
		.verifyCurrency_EditCandidate()
		.SelectCurrency_Candidate()
		//.verifyvisa_EditCandidate()
		//.Selectvisa_Candidate()
		.verifyother_StartDate_EditCandidate()
		.SelectOtherStartDate_Candidate()
		.verifyother_EndDate_EditCandidate()
		.SelectOtherEndDate_Candidate()
		.verifyRelocation_EditCandidate()
		.SelectRelocation_Candidate()
		.verifyResumeSource_EditCandidate()
		.SelectResumeSource_Candidate()
		.click_proceed_EditCandidate()
		.verifyvalidation_Candidate();
		/*.ClickCandidateconsent_Candidate()
		.verify_CandidateConsentlist()
		.clickEditContact_EditCandidate()
		.verifyEditPage_CandidateConsent()
		.verify_Firstname_EditCandidate()
		.enter_Firstname1("Sam")
		.verify_Lastname_EditCandidate()
		.enter_Lastname("Manu")
		.verify_EmailId_EditCandidate()
		.enter_Emailid1("ma345@gmail.com")
		.verify_Mobilenumber_EditCandidate()
		.enter_Mobilenumber1("7467763212")
		.verify_Source_EditCandidate()
		.enter_source("Naukri")
		.verify_Position_EditCandidate()
		.enter_Position("Software Test Engineer")
		//.Clickchoosefile_Candidate()
		//.Clickeditsavebutton_CandidateConsent()
		//.ClickCancelbutton_Candidate()
		.ClickCancelbutton_Candidate()
		.verifyvalidationmessage_CandidatePage();*/
}

	
	
}