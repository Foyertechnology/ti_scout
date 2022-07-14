package com.tscout.pages;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CandidatePage extends ProjectSpecificMethods {
	@When("Click the  Candidate Menu in the Dashboard")
	public CandidatePage clickCandidateMenu() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Dashboard.Candidate.Xpath")));
		return this;
	}
	@Then("Verify the Candidate List in the Candidate Page")
	public CandidatePage verify_Candidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.List.Xpath")));
		return this;

	}
	@When("Click Search button in the Candidate Page")
	public CandidatePage click_Search_Candidate() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Candidate.Click.search.button.Xpath")));
		return this;
		
	}
	@When("Click filter icon in the Candidate Page")
	public CandidatePage click_filter_icon_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.Click.filter.icon.Xpath")));
		return this;
		
	}
	@Given("Enter candidate name {string} in filter Candidate")
	public CandidatePage enter_Candidatename_filter(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.candidatename.filter.Xpath")), data);
		return this;
	}
	@When("Click email fieldin filter page")
	public CandidatePage click_email_filter() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.Click.email.filter.Xpath")));
		return this;
		
	}
	@Given("Enter data {string} in Search Candidate")
	public CandidatePage enter_data_Search_Candidate(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.search.Xpath")), data);
		return this;
	}
	@When("Click Add Candidate Button in the Candidate Page")
	public CandidatePage clickCandidate_AddCandidateBtn() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Candidate.AddCandidate.Xpath")));
		return this;
	}

	@Then("Verify the Create a new Candidate in the Candidate")
	public CandidatePage verify_CreateANewCandidatePage() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verifynewCandidate.Xpath")));
		return this;

	}
	@When("Click Resume name in the Candidate Page")
	public CandidatePage clickResumename_AddCandidateBtn() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Candidate.Resumename.Xpath")));
		return this;
		
	}
	@When("select file from the system in the Candidate Page")
	public CandidatePage selectfile_AddCandidateBtn() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Candidate.selectfile.Xpath")));
		return this;
	}
	@When("click upload cv in the Candidate Page")
	public CandidatePage uploadcv_AddCandidateBtn() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.uploadcv.Xpath")));
		return this;
	}
	@Then("verify the Cv uploaded successful in the Candidate Page")
			
	public CandidatePage verifycv_uploaded() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.Cvuploaded.Xpath")));
		return this;
	}
		@When("Click Manual filling in the Candidate Page")
		public CandidatePage clickManualfilling_CandidatePage() throws InterruptedException {
			Thread.sleep(2000);
			click(locateElement("XPath", prop.getProperty("Candidate.click.Manualfilling.Xpath")));
			return this;
		}
		@Then("Verify Manual filling in the Candidate Page")
		
		public CandidatePage verifyManual_filling() throws InterruptedException {
			verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.manualfilling.Xpath")));
			return this;
		}
		@When("Select Salutation in Candidate Page")
		public CandidatePage SelectSalutation_CreateCandidate() throws InterruptedException {
			Thread.sleep(1000);
			click(locateElement("XPath", prop.getProperty("Candidate.click.salutation.Xpath")));
			Thread.sleep(1000);
			click(locateElement("XPath", prop.getProperty("Candidate.SelectSalutation.Xpath")));
			return this;
		}
	@Given("Enter Firstname {string} in Create Candidate")
	public CandidatePage enter_Firstname(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Firstname.Xpath")), data);
		return this;
	}
	@Given("Enter Last name {string} in Create Candidate")
	public CandidatePage enter_lastname(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateCandidate.enter.Lastname.Xpath")), data);
		return this;
	}
	@Given("Enter EmailId {string} in Create Candidate")
	public CandidatePage enter_Emailid(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.EmailId.Xpath")), data);
		return this;
	}
	@Given("Enter Mobilenumber {string} in Create Candidate")
	public CandidatePage enter_Mobilenumber(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Mobilenumber.Xpath")), data);
		return this;
	}
	@When("Select date of birth in Candidate Page")
	public CandidatePage Selectdateofbirth_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.dateofbirth.Xpath")));
		System.out.println("Date icon is clicked");
		Thread.sleep(5000);
		click(locateElement("XPath", prop.getProperty("Candidate.Select.dateofbirth.Xpath")));
		System.out.println("Date is seleccted");
		return this;
	}
	
	@Given("Enter Place {string} in Create Candidate")
	public CandidatePage enter_Place(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Place.Xpath")), data);
		return this;
	}
	@When("Select nationality in Candidate Page")
	public CandidatePage Selectnationality_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.nationality.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.Select.nationality.Xpath")));
		return this;
	}
	
	@Given("Enter Address {string} in Create Candidate")
	public CandidatePage enter_Address(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Address.Xpath")), data);
		return this;
	}
	
	@Given("Enter City {string} in Create Candidate")
	public CandidatePage enter_City(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.City.Xpath")), data);
		return this;
	}
	
	@Given("Enter Country {string} in Create Candidate")
	public CandidatePage enter_Country(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Country.Xpath")), data);
		return this;
	}
	
	@Given("Enter Zipcode {string} in Create Candidate")
	public CandidatePage enter_Zipcode(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Zipcode.Xpath")), data);
		return this;
	}
	
	@When("Select tags in Candidate Page")
	public CandidatePage Selecttags_Candidate() throws InterruptedException {
		Thread.sleep(500);
		click(locateElement("XPath", prop.getProperty("Candidate.click.tags.Xpath")));
		Thread.sleep(500);
		click(locateElement("XPath", prop.getProperty("Candidate.Select.tags.Xpath")));
		return this;
	}
	@Given("Enter Social Media {string} in  Candidate Page")
	public CandidatePage enter_SocialMedia(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.SocialMedia.Xpath")), data);
		return this;
	}
	@Given("Enter experience {string} in Create Candidate")
	public CandidatePage enter_experience(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.experience.Xpath")), data);
		return this;
	}
	@Given("Enter notes {string} in Create Candidate")
	public CandidatePage enter_notes(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.notes.Xpath")), data);
		return this;
	}
	@When("Click the Close Icon in the Create Candidate Page")
	public CandidatePage Click_CloseIcon() {
		click(locateElement("XPath", prop.getProperty("CreateCandidate.PopupCloseIcon.Xpath")));
		return this;
	}
	@When("Click the Close Icon in the Create Candidate Page")
	public CandidatePage click_closepopup_CertCandidate() {
		click(locateElement("XPath", prop.getProperty("CreateCandidate.CertPopupCloseIcon.Xpath")));
		return this;
	}
	@When("Click the Close Icon in the Create Candidate Page")
	public CandidatePage click_closepopup_ExpCandidate() {
		click(locateElement("XPath", prop.getProperty("CreateCandidate.ExpPopupCloseIcon.Xpath")));
		return this;
	}
	@When("Click the Close Icon in the Create Candidate Page")
	public CandidatePage click_closepopup_otherCandidate() {
		click(locateElement("XPath", prop.getProperty("CreateCandidate.otherPopupCloseIcon.Xpath")));
		return this;
	}
	@When("Click the Close Icon in the Create Candidate Page")
	public CandidatePage click_closepopup_LangCandidate() {
		click(locateElement("XPath", prop.getProperty("CreateCandidate.LangPopupCloseIcon.Xpath")));
		return this;
	}
	/*
	 * @When("Click the Close Icon in the Popup") public CandidatePage
	 * click_close_popup_Candidate() { click(locateElement("XPath",
	 * prop.getProperty("CreateCandidate.PopupCloseIcon.Xpath"))); return this; }
	 */

	@Then("Verify the Displayed Popup")
	public CandidatePage verify_close_Candidate() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("CreateCandidate.verifyPopup.Xpath")));
		return this;
	}

	@When("Click Yes Button in  Are you sure popup")
	public CandidatePage ClickCandidate_YesButton() {
		click(locateElement("XPath", prop.getProperty("CreateCandidate.Popup.YesBtn.Xpath")));
		return this;
	}

	@When("Click No Button in  Are you sure popup")
	public CandidatePage click_no_popup_Candidate() {
		click(locateElement("XPath", prop.getProperty("CreateCandidate.Popup.NoBtn.Xpath")));
		return this;
	}

	@When("Click save and next button in Candidate Page")
	public CandidatePage Clicksaveandnextbutton_Candidate() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.saveandnextbutton.Xpath"));
		return this;
	}
	//Education Details
	@Then("Verify the Education details in Candidate Page")
	
	public CandidatePage verifyEducationdetails() throws InterruptedException {
		Thread.sleep(7000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.Educationdetails.Xpath")));
		return this;
	}
	@Given("Enter Institution {string} in  Candidate Page")
	public CandidatePage enter_Institution(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Institution.Xpath")), data);
		return this;
	}
	@Given("Enter Candidate location {string} in  Candidate Page")
	public CandidatePage enter_Candidatelocation(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Candidatelocation.Xpath")), data);
		return this;
	}
	@Given("Enter Candidate Graduation {string} in  Candidate Page")
	public CandidatePage enter_CandidateGraduation(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Graduation.Xpath")), data);
		return this;
	}
	@When("Select StartDate in Candidate Education Page")
	public CandidatePage SelectStartDate_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.StartDate.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.Select.StartDate.Xpath")));
		return this;
	}
	@When("Select EndDate in Candidate Education Page")
	public CandidatePage SelectEndDate_Candidate() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("Candidate.click.EndDate.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.Select.EndDate.Xpath")));
		return this;
	}
	@When("click Add more in  Candidate Education Page")
	public CandidatePage ClickEduAddmore_Candidate() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.eduAddmore.Xpath"));
		return this;
	}
	
	@When("Select employment type in Candidate Page")
	public CandidatePage select_employment_filter_Candidate() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.employment.filter.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.select.employment.filter.Xpath")));
		return this;
	}
	@When("Select skills in Candidate Page")
	public CandidatePage select_skills_filter_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.skills.filter.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.select.skills.filter.Xpath")));
		return this;
	}
	@When("Select language in Candidate Page")
	public CandidatePage select_language_filter_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.language.filter.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.select.language.filter.Xpath")));
		return this;
	}
	@Given("Enter data {string} in position field  Candidate")
	public CandidatePage enter_position_filter_Candidate(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.position.filter.Xpath")), data);
		return this;
	}
	@When("Click manage candidate  in the Candidate Page")
public CandidatePage click_manage_candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.managecandidate.Xpath"));
	return this;
}@Then("Verify the manage candidate list in the Candidate Page")
public CandidatePage verify_manage_candidate_list() throws InterruptedException {
	Thread.sleep(1000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.managecandidatelist.Xpath")));
	return this;

}
@When("Click setting icon  in the Candidate Page")
public CandidatePage click_settingicon_manage_candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.settingicon.managecand.Xpath"));
	return this;
}@Then("Verify the archival column list in the Candidate Page")
public CandidatePage verify_columns_manage_candidate() throws InterruptedException {
	Thread.sleep(1000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.archivalcolumn.Xpath")));
	return this;

}@When("Click url icon  in the Candidate Page")
public CandidatePage click_urlicon_manage_candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.urlicon.managecand.Xpath"));
	return this;
}@When("Click archive icon  in the Candidate Page")
public CandidatePage click_archive_button_managecandidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.archive.managecand.Xpath"));
	return this;
}@When("Click pending for unarchival icon  in the Candidate Page")
public CandidatePage click_pending_for_unarch_manage_candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.pendingforarch.managecand.Xpath"));
	return this;
}@When("Click pending for deletion icon  in the Candidate Page")
public CandidatePage click_pending_for_deletion_manage_candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.pendingfordeletion.managecand.Xpath"));
	return this;
}
	@When("Select tags in Candidate Page")
	public CandidatePage select_tags_filter_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.click.tags.filter.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Candidate.select.tags.filter.Xpath")));
		return this;
	}
	@When("Click the  filter icon in the Dashboard")
	public CandidatePage click_icon_skills_filter_candidate() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Dashboard.click.icon.skills.Xpath")));
		return this;
	}
	//Certification Details
@Then("Verify the Certification details in Candidate Page")
	
	public CandidatePage verify_Certificationdetails() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.Certification.details.Xpath")));
		return this;
	}
@Given("Enter Certification Name {string} in  Candidate Page")
public CandidatePage enter_CertificationName(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.CertificationName.Xpath")), data);
	return this;
}
@Given("Enter Institute Name {string} in  Candidate Page")
public CandidatePage enter_InstituteName_Candidate(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.InstitutionName1.Xpath")), data);
	return this;
}
@Given("Enter Certification Location {string} in  Candidate Page")
public CandidatePage enter_CertificationLocation(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Certification.Location.Xpath")), data);
	return this;
}
@When("Select StartDate in Candidate Certification Page")
public CandidatePage SelectCertStartDate_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.CertStartDate.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.select.CertStartDate.Xpath")));
	return this;
}
@When("Select EndDate in Candidate Certification Page")
public CandidatePage SelectCertEndDate_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.CertEndDate.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.CertEndDate.Xpath")));
	return this;
}
@When("click Add more in  Candidate Certification Page")
public CandidatePage ClickCertAddmore_Candidate() throws InterruptedException {
	click(locateElement("XPath", prop.getProperty("Candidate.click.CertAddmore.Xpath")));
	return this;
}
@When("Click Proceed button in Candidate Certification Page")
public CandidatePage ClickCertProceedtbutton_Candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.CertProceed.Xpath"));
	return this;
}
//Experience Details
@Then("Verify the Experience details in Candidate Page")

public CandidatePage verify_Experiencedetails() throws InterruptedException {
	Thread.sleep(4000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.Experience.details.Xpath")));
	return this;
}
@Given("Enter Candidate Employer name {string} in  Candidate Page")
public CandidatePage enter_Employername(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Employername.Xpath")), data);
	return this;
}
@Given("Enter Experience Candidate location {string} in  Candidate Page")
public CandidatePage enter_ExpCandidateLocation(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.CandidateLocation.Xpath")), data);
	return this;
}
@Given("Enter Candidate Jobtitle {string} in  Candidate Page")
public CandidatePage enter_ExpCandidateJobtitle(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.CandidateJobtitle.Xpath")), data);
	return this;
}
@When("Select StartDate in Candidate Experience Page")
public CandidatePage SelectExpStartDate_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.ExpStartDate.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.select.ExpStartDate.Xpath")));
	return this;
}
@When("Select EndDate in Candidate Experience Page")
public CandidatePage SelectExpEndDate_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.ExpEndDate.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.ExpEndDate.Xpath")));
	return this;
}
@Given("Enter Responsibilities_Candidate {string} in  Candidate Page")
public CandidatePage enterResponsibilities_Candidate(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.CandidateJobtitle.Xpath")), data);
	return this;
}
@When("Click Experience next icon in Candidate Page")
public CandidatePage ClickExperiencenextIcon_Candidate() throws InterruptedException {
	click(locateElement("XPath", prop.getProperty("Candidate.click.ExperiencenextIcon.Xpath")));
	return this;
}
//Skill Details
@Then("Verify Skills Details in Candidate Page")
public CandidatePage verifySkillsDetails_CandidatePage() throws InterruptedException {
	Thread.sleep(3000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verifySkills.Candidate.Xpath")));
	return this;

}
@When("Select Skills in Candidate Page")
public CandidatePage SelectSkills_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.skills.Xpath")));
	click(locateElement("XPath", prop.getProperty("Candidate.Select.skills.Xpath")));
	return this;
}
@When("Select Proficiency in Candidate Page")
public CandidatePage SelectProficiency_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.Proficiency.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.Proficiency.Xpath")));
	return this;
}
@When("Click Add Skills in Skills details Page")
public CandidatePage ClickAddSkills_Candidate() throws InterruptedException {
	click(locateElement("XPath", prop.getProperty("Candidate.click.AddSkills.Xpath")));
	return this;
}
@When("Click next icon in Skills details Page")
public CandidatePage ClickSkillsnextIcon_Candidate() throws InterruptedException {
	click(locateElement("XPath", prop.getProperty("Candidate.click.Skills.nextIcon.Xpath")));
	return this;
}

//Language Details
@Then("Verify the Language Details in Candidate Page")
public CandidatePage verifyLanguageDetails_CandidatePage() throws InterruptedException {
	Thread.sleep(3000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verifyLanguageDetails.Candidate.Xpath")));
	return this;
}
@When("Select Language in Candidate Page")
public CandidatePage SelectLanguage_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.Language.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.Language.Xpath")));
	return this;
}
@When("Select Language Proficiency in Candidate Page")
public CandidatePage SelectlangProficiency_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.LanguageProficiency.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.LanguageProficiency.Xpath")));
	return this;

}
@When("Click Add Language  in Candidate Page")
public CandidatePage ClickAddLanguage_Candidate() throws InterruptedException {
	click(locateElement("XPath", prop.getProperty("Candidate.click.AddLanguage.Xpath")));
	return this;
}
@When("Click NextIcon in Candidate Page")
public CandidatePage ClickLangNextIcon_Candidate() throws InterruptedException {
	click(locateElement("XPath", prop.getProperty("Candidate.click.LangNextIcon.Xpath")));
	return this;
}
//Other Details Page
@Then("Verify the other details in Candidate Page")
public CandidatePage VerifyOtherDetailsPage_Candidate() throws InterruptedException {
	Thread.sleep(3000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verifyOtherDetailsPage.Xpath")));
	return this;

}
@When("Select employment type in other details Candidate Page")
public CandidatePage SelectEmploymentType_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.EmploymentType.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.EmploymentType.Xpath")));
	return this;
}@When("Select Notice Period in other details Candidate Page")
public CandidatePage SelectNoticePeriod_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.NoticePeriod.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.NoticePeriod.Xpath")));
	return this;
}
@Given("Enter Days {string} in Candidate Page")
public CandidatePage enterotherdetailsDays_Candidate(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Days.Xpath")), data);
	return this;
}
@When("Select Salary basis in other details Candidate Page")
public CandidatePage SelectSalaryBasis_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.SalaryBasis.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.SalaryBasis.Xpath")));
	return this;
}
@Given("Enter Current salary {string} in Candidate Page")
public CandidatePage enterCurrentSalary_Candidate(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.CurrentSalary.Xpath")), data);
	return this;
}
@Given("Enter Expected salary {string} in Candidate Page")
public CandidatePage enterExpectedSalary_Candidate(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.ExpectedSalary.Xpath")), data);
	return this;
}
@When("Select currency in other details Candidate Page")
public CandidatePage SelectCurrency_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.currency.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.currency.Xpath")));
	return this;
}
@When("Select visa in other details Candidate Page")
public CandidatePage Selectvisa_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Click.visa.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.visa.Xpath")));
	return this;
}
@When("Select Start Date in Other Details Candidate Page")
public CandidatePage SelectOtherStartDate_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.OtherStartDate.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.OtherStartDate.Xpath")));
	return this;
}
@When("Select End Date in Other Details Candidate Page")
public CandidatePage SelectOtherEndDate_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.OtherEndDate.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.OtherEndDate.Xpath")));
	return this;
}
@When("Select Relocation in Other Details Candidate Page")
public CandidatePage SelectRelocation_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.Relocation.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.Relocation.Xpath")));
	return this;
}
@When("Select Resume source in Other Details Candidate Page")
public CandidatePage SelectResumeSource_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.click.ResumeSource.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Candidate.Select.ResumeSource.Xpath")));
	return this;
}
@When("Click next icon in other details Candidate Page")
public CandidatePage ClickotherNextIcon_Candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.Click.otherNextIcon.Xpath"));
	return this;
}
@Then("Verify the validation message in the Candidate Page")
public CandidatePage verifyvalidation_Candidate() throws InterruptedException {
	Thread.sleep(1000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.validation.Xpath")));
	return this;

}

	//Create Contact Page
@When("Click Candidate consent menu  in the Candidate Page")
public CandidatePage ClickCandidateconsent_Candidate() throws InterruptedException {
	setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.candidateconsent.Xpath"));
	return this;
}

	
	@When("Click Create contact in the Candidate Page")
	public CandidatePage ClickCreatecontact_Candidate() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.Createcontact.Xpath"));
		return this;
	}
	
	@Then("Verify Create contact in the Candidate Page")
	
	public CandidatePage verifyCreate_contact() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verify.CreateContact.Xpath")));
		return this;
	}	
	@Given("Enter Firstname {string} in Create contact Page")
	public CandidatePage enter_Firstname1(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Firstname1.Xpath")), data);
		return this;
	}
	@Given("Enter Lastname {string} in Create contact Page")
	public CandidatePage enter_Lastname(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Lastname.Xpath")), data);
		return this;
	}
	@Given("Enter Emailid {string} in Create contact Page")
	public CandidatePage enter_Emailid1(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Emailid1.Xpath")), data);
		return this;
	}
	@Given("Enter Mobile number {string} in Create contact Page")
	public CandidatePage enter_Mobilenumber1(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Mobilenumber1.Xpath")), data);
		return this;
	}
	@Given("Enter source {string} in Create contact Page")
	public CandidatePage enter_source(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.source.Xpath")), data);
		return this;
	}
	@Given("Enter Position {string} in Create contact Page")
	public CandidatePage enter_Position(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Candidate.enter.Position.Xpath")), data);
		return this;
	}
	@When("Click choose file in Create Contact Page")
	public CandidatePage Clickchoosefile_Candidate() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.choosefile.Xpath"));
		return this;
	}
	@When("Click Save button in Create Contact Page")
	public CandidatePage Clicksavebutton_Candidate() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.savebutton.Xpath"));
		return this;
	}
	@When("Click Cancel button in Create Contact Page")
	public CandidatePage ClickCancelbutton_Candidate() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Candidate.click.Cancelbutton.Xpath"));
		return this;
	}

	@Then("Verify validation message in Create Contact Page")
	public CandidatePage verifyvalidationmessage_CandidatePage() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Candidate.verifyvalidationmessage.Xpath")));
		return this;

	}
	//Edit Candidate Page
	@When("click candidate in candidate list")
	public CandidatePage clickCandidateList_Candidate() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("EditCandidate.click.CandidateList.Xpath")));
		return this;
	}
	@When("click Edit icon in Edit Candidate Page")
	public CandidatePage clickEditIcon_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("EditCandidate.click.EditIcon.Xpath")));
		return this;
	}
	@Then("Verify Edit Candidate Page")
	public CandidatePage verifyEditPage_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.EditCandidatePage.Xpath")));
		return this;
	}
	
	@Then("Verify Salutation field in Edit Candidate Page")
	public CandidatePage verifySalutation_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Salutationfield.Xpath")));
		return this;
	}
	
	@Then("Verify First name  field in Edit Candidate Page")
	public CandidatePage verifyFirstname_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.firstname.Xpath")));
		return this;
	}
	@Then("Verify Last name  field in Edit Candidate Page")
	public CandidatePage verifyLastname_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Lastname.Xpath")));
		return this;
	}
	
	@Then("Verify Email id field in Edit Candidate Page")
	public CandidatePage verify_Emailid_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Emailid.Xpath")));
		return this;
	}
	@Then("Verify Mobile number field in Edit Candidate Page")
	public CandidatePage verify_Mobilenumber_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Mobilenumber.Xpath")));
		return this;
	}
	@Then("Verify date of birth in Edit Candidate Page")
	public CandidatePage verify_dateofbirth_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Dateofbirth.Xpath")));
		return this;
	}
	@Then("Verify place in Edit Candidate Page")
	public CandidatePage verify_place_editcandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.place.Xpath")));
		return this;
	}
	@Then("Verify nationality field in Edit Candidate Page")
	public CandidatePage verify_nationality_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.nationality.Xpath")));
		return this;
	}	
	@Then("Verify Address field in Edit Candidate Page")
	public CandidatePage verify_address_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.address.Xpath")));
		return this;
	}
	@Then("Verify City field in Edit Candidate Page")
	public CandidatePage verify_city_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.City.Xpath")));
		return this;
	}
	@Then("Verify Country field in Edit Candidate Page")
	public CandidatePage verify_country_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Country.Xpath")));
		return this;
	}
	@Then("Verify Zipcode field in Edit Candidate Page")
	public CandidatePage verify_zipcode_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.zipcode.Xpath")));
		return this;
	}
	@Then("Verify tags field in Edit Candidate Page")
	public CandidatePage verify_tags_editCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.tags.Xpath")));
		return this;
	}
	
	@Then("Verify experience field in Edit Candidate Page")
	public CandidatePage verify_experience_Edit_Candidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.experience.Xpath")));
		return this;
	}
	@Then("Verify notes field in Edit Candidate Page")
	public CandidatePage verify_notes_EditCandidate() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.notes.Xpath")));
		return this;
	}
	@When("Click Edit and next button in Candidate Page")
	public CandidatePage Clickeditandnextbutton_EditCandidate() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("EditCandidate.click.Editandnext.Xpath")));
		return this;
	}
	@Then("Verify Institution field in Edit Candidate Page")
	public CandidatePage verifyInstitution_editCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.institution.Xpath")));
		return this;
	}
	@Then("Verify Location field in Edit Candidate Page")
	public CandidatePage verify_location_editcandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Location.Xpath")));
		return this;
	}
	@Then("Verify Graduation field in Edit Candidate Page")
	public CandidatePage verify_graduation_editcandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Graduation.Xpath")));
		return this;
	}
	@Then("Verify Start date field in Edit Candidate Page")
	public CandidatePage verify_startdate_editCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.startdate.Xpath")));
		return this;
	}
	@Then("Verify End date field in Edit Candidate Page")
	public CandidatePage verify_enddate_editcandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.enddate.Xpath")));
		return this;
	}
	@Then("Verify Certification name field in Edit Candidate Page")
	public CandidatePage verify_CertificationName_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.certificationname.Xpath")));
		return this;
	}
	@Then("Verify Institution name field in Edit Candidate Page")
	public CandidatePage verify_Institution_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Institutionname.Xpath")));
		return this;
	}
	@Then("Verify Certification Location field in Edit Candidate Page")
	public CandidatePage verify_Certification_Location_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.CertificateLocation.Xpath")));
		return this;
	}
	@Then("Verify Certification start date field in Edit Candidate Page")
	public CandidatePage verify_Cert_Startdate_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Certificate.Startdate.Xpath")));
		return this;
	}
	@Then("Verify Certification End date field in Edit Candidate Page")
	public CandidatePage verify_CertEndDate_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Certificate.Enddate.Xpath")));
		return this;
	}
	@When("Click proceed button in  Edit Candidate Page")
	public CandidatePage click_proceed_EditCandidate() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("EditCandidate.click.Proceedbutton.Xpath"));
		return this;
	}
	@Then("Verify Employer name field in Edit Candidate Page")
	public CandidatePage verify_Employername_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Experience.Employername.Xpath")));
		return this;
	}
	@Then("Verify Candidate Location field in Edit Candidate Page")
	public CandidatePage verify_Exp_CandidateLocation_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Experience.CandidateLocation.Xpath")));
		return this;
	}
	@Then("Verify Candidate Jobtitle field in Edit Candidate Page")
	public CandidatePage verify_ExpCandidate_Jobtitle_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Experience.Jobtitle.Xpath")));
		return this;
	}
	@Then("Verify Experience start date in Edit Candidate Page")
	public CandidatePage verify_ExpStartDate_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Experience.StartDate.Xpath")));
		return this;
	}
	@Then("Verify Experience End date in Edit Candidate Page")
	public CandidatePage verify_ExpEndDate_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Experience.EndDate.Xpath")));
		return this;
	}
	
	@Then("Verify Skills in Edit Candidate Page")
	public CandidatePage verifySkills_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Skills.Xpath")));
		return this;
	}
	@Then("Verify Proficiency in Edit Candidate Page")
	public CandidatePage verify_Proficiency_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Proficiency.Xpath")));
		return this;
	}
	@Then("Verify Language in Edit Candidate Page")
	public CandidatePage verifyLanguage_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Language.Xpath")));
		return this;
	}
	@Then("Verify Language Proficency in Edit Candidate Page")
	public CandidatePage verify_LangProficiency_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Language.Proficiency.Xpath")));
		return this;
	}
	
	@Then("Verify Employee type in Edit Candidate Page")
	public CandidatePage verify_EmploymentType_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.EmploymentType.Xpath")));
		return this;
	}
	@Then("Verify Notice Period in Edit Candidate Page")
	public CandidatePage verify_NoticePeriod_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.NoticePeriod.Xpath")));
		return this;
	}
	
	@Then("Verify Other Details days in Edit Candidate Page")
	public CandidatePage verifyOtherDetailsdays_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.days.Xpath")));
		return this;
	}
	@Then("Verify Salary basis in Edit Candidate Page")
	public CandidatePage verifySalaryBasis_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.SalaryBasis.Xpath")));
		return this;
	}
	@Then("Verify Current Salary in Edit Candidate Page")
	public CandidatePage verify_CurrentSalary_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.CurrentSalary.Xpath")));
		return this;
	}
	
	@Then("Verify Expected Salary in Edit Candidate Page")
	public CandidatePage verify_ExpectedSalary_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.ExpectedSalary.Xpath")));
		return this;
	}
	@Then("Verify Currency in Edit Candidate Page")
	public CandidatePage verifyCurrency_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.Currency.Xpath")));
		return this;
	}
	@Then("Verify Visa in Edit Candidate Page")
	public CandidatePage verifyvisa_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.Visa.Xpath")));
		return this;
	}
	@Then("Verify other start date in Edit Candidate Page")
	public CandidatePage verifyother_StartDate_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.StartDate.Xpath")));
		return this;
	}
	@Then("Verify other End date in Edit Candidate Page")
	public CandidatePage verifyother_EndDate_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.EndDate.Xpath")));
		return this;
	}
	@Then("Verify Relocation in Edit Candidate Page")
	public CandidatePage verifyRelocation_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.Relocation.Xpath")));
		return this;
	}
	@Then("Verify Resume source in Edit Candidate Page")
	public CandidatePage verifyResumeSource_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.otherDetails.ResumeSource.Xpath")));
		return this;
	}
	@Then("Verify Firstname in Edit Candidate Page")
	public CandidatePage verify_Firstname_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.CandidateConsent.Firstname1.Xpath")));
		return this;
	}
	@Then("Verify Lastname in Edit Candidate Page")
	public CandidatePage verify_Lastname_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.CandidateConsent.Lastname1.Xpath")));
		return this;
	}
	@Then("Verify Emailid in Edit Candidate Page")
	public CandidatePage verify_EmailId_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.CandidateConsent.EmailId.Xpath")));
		return this;
	}
	@Then("Verify Source in Edit Candidate Page")
	public CandidatePage verify_Source_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.CandidateConsent.Source.Xpath")));
		return this;
	}
	@Then("Verify Position in Edit Candidate Page")
	public CandidatePage verify_Position_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.CandidateConsent.Position.Xpath")));
		return this;
	}
	@Then("Verify Responsibilities in Edit Candidate Page")
	public CandidatePage verify_Responsibilities_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Responsibilities.Xpath")));
		return this;
	}
	@Then("Verify Candidate consent in Candidate consent list")
	public CandidatePage verify_CandidateConsentlist() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.Candidateconsent.list.Xpath")));
		return this;
	}
	@Then("Verify Edit contact in Edit Candidate Page")
	public CandidatePage clickEditContact_EditCandidate() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.EditContact.Consent.Xpath")));
		return this;
	}
	@Then("Verify Edit Page in  Candidate Consent Page")
	public CandidatePage verifyEditPage_CandidateConsent() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditCandidate.verify.EditPage.Consent.Xpath")));
		return this;
	}
	@When("click edit save button in Edit Candidate Consent Page")
	public CandidatePage Clickeditsavebutton_CandidateConsent() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("EditCandidate.click.CandidateConsent.editsavebutton.Xpath")));
		return this;
	}
}

