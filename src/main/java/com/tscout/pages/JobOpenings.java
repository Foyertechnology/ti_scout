package com.tscout.pages;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobOpenings extends ProjectSpecificMethods {
	@When("Click the Job Openings Menu in the Dashboard")
	public JobOpenings click_JobOpeningsMenu() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Dashboard.JobOpenings.Xpath")));
		return this;
	}
	
	@Then("Verify the Job Openings List in the Job Openings Page")
	public JobOpenings verify_JobOpeningsList() throws InterruptedException {
		Thread.sleep(6000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.List.Xpath")));
		return this;

	}

	@When("Click Add Job Button in the Job Openings Page")
	public JobOpenings clickJobOpenings_AddJobBtn() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("JobOpenings.AddJob.Xpath")));
		return this;
	}
	

	@Then("Verify the Create a new opening in the Job Openings")
	public JobOpenings verify_CreateANewOpeningsPage() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifynewOpenings.Xpath")));
		return this;

	}

	@Given("Enter Job Title as  in Create a new opening {string}")
	public JobOpenings enter_JobTitle(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.JobTitle.Xpath")), data);
		return this;
	}

	@When("Click the Copy a JD from JDBuilder in Create a new opening")
	public JobOpenings ClickJobOpening_CopyJDBuilderLink() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.CopyJDLink.Xpath"));
		return this;
	}

	@Then("Verify the My Job Description Page")
	public JobOpenings verifyJobOpenings_JDPage() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJD.Xpath")));
		return this;

	}

	@When("Click the My Job Description Select Button")
	public JobOpenings SelectJobOpenings_JDSelectBtn() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.JDSelect.Xpath"));
		return this;
	}

	@Given("Enter Job Description as {string} in Create a new opening")
	public JobOpenings enter_JobDescription(String data) throws InterruptedException {
		Thread.sleep(2000);
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.JobDesc.Xpath")), data);
		return this;
	}

	@When("Click the Tags field in Create a new opening page")
	public JobOpenings ClickJobOpenings_Tags() throws InterruptedException {
		// setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.ClickTags.Xpath"));
		scrollPageViewElement(prop.getProperty("JobOpenings.ClickTags.Xpath"));
		click(locateElement("XPath", prop.getProperty("JobOpenings.ClickTags.Xpath")));
		return this;
	}
	@When("Click clear Tags field in Create a new opening page")
	public JobOpenings ClickclearJobOpenings_Tags() throws InterruptedException {
		// setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.ClickTags.Xpath"));
		scrollPageViewElement(prop.getProperty("clearJobOpenings.ClickTags.Xpath"));
		click(locateElement("XPath", prop.getProperty("clearJobOpenings.ClickTags.Xpath")));
		return this;
	}

	@When("Select Tags from the Tag DropDown List")
	public JobOpenings SelectJobOpenings_Tags() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.SelectTags.Xpath"));
		return this;
	}

	@Then("Verify the Validation Message in Job Openings Page")
	public JobOpenings verify_ValidationMsg() {
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.Validation.Xpath")));
		return this;
	}

	@Given("Enter the TagclearAndTypes Name in the Tags Search field")
	public JobOpenings enterJobOpenings_Tags(String data) throws InterruptedException {
		Thread.sleep(2000);
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.search-text.Xpath")), data);
		return this;
	}

	@Then("Verify the Search result in the Tags Field")
	public JobOpenings verifyJobOpenings_Tagsresult() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.SelectTags.Xpath")));
		return this;

	}

	@When("Click the Client  field in Create a new opening page")
	public JobOpenings ClickJobOpenings_Client() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.ClickClient.Xpath"));
		return this;
	}

	@When("Select Client from the Client DropDown List")
	public JobOpenings SelectJobOpenings_Client() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Client.Xpath"));
		return this;
	}

	@When("Click the Client Contacts field in Create a new opening page")
	public JobOpenings ClickJobOpenings_ClientContacts() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.ClientContacts.Xpath"));
		return this;
	}

	@Given("Enter the Client Name in the Client Search field as {string}")
	public JobOpenings enterJobOpenings_Client(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.search-text.Xpath")), data);
		return this;
	}

	@Then("Verify the Search result in the Client Field")
	public JobOpenings verifyJobOpening_ClientSearchresult() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.Client.Xpath")));
		return this;
	}

	@When("Select Contacts from the Client Contacts DropDown List")
	public JobOpenings SelectJobOpenings_ClientContacts() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.ClientContacts1.Xpath"));
		return this;
	}
	
	@When("Click the Save and Next Button in the Create a new opening page")
	public JobOpenings SelectJobOpenings_Save_NextBtn() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Nextone.Xpath"));
		return this;
	}
	
	@When("Click the Save and Next Button in the Create a new opening page")
	public JobOpenings SelectJobOpenings_Edit_NextBtn() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Edit.Xpath"));
		return this;
	}
	@When("Click the Save and Next Button in the Create a new opening page")
	public JobOpenings SelectJobOpenings_Next_NextBtn() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.NextBtn.Xpath"));
		return this;
	}
	@Then("Verify the Job Details")
	public JobOpenings verify_JobDetails() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobDetails.Xpath")));
		return this;

	}

	@Given("Enter Number of vacancy {string}")
	public JobOpenings enter_Numberofvancancy() {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.Numberofvancancy.Xpath")), "5");
		return this;
	}
	@When("Click the Types of priority {string}")
	public JobOpenings click_Typesofpriority(String data) throws InterruptedException {
		Thread.sleep(4000);
		selectDropDownUsingVisibleText(prop.getProperty("JobOpenings.Typesofpriority.Xpath"),data );
		return this;
	}
	@When("Click the select Types of priority")
	public JobOpenings click_Selectpriority() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Selectpriority.Xpath"));
		return this;
	}
	@When("Click the Types of Job Categories")
	public JobOpenings click_JobCategories() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.JobCategories.Xpath"));
		return this;
	}
	@When("Click the Types of select Job Categories")
	public JobOpenings click_SelectJobCategories() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.SelectJobCategories.Xpath"));
		return this;
	}
	@When("Click the Types of Recruiter")
	public JobOpenings click_Recruiter() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Recruiter.Xpath"));
		return this;
	}
	@When("Click the Types of Recruiter1")
	public JobOpenings click_Recruiter1() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Recruiter1.Xpath"));
		return this;
	}
	@When("select Types of Recruiter")
	public JobOpenings click_SelectRecruiter() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.SelectRecruiter.Xpath"));
		return this;
	}
	
	@When("Click the Account owner")
	public JobOpenings click_Accountowner() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Accountowner.Xpath"));
		return this;
	}
	@When("select Types of Account owne")
	public JobOpenings select_Accountowner() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.SelectAccountowner.Xpath"));
		return this;
	}
	@When("Click outside the field")
	public JobOpenings click_Outside() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Outside.Xpath"));
		return this;
	}
	@When("Click the Types of Job Position")
	public JobOpenings click_JobPosition() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Position.Xpath"));
		return this;
	}
	@When("Click the select Job Position")
	public JobOpenings click_SelectJobPosition() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.SelectJobPosition.Xpath"));
		return this;
	}
	@When("Click the Qualification")
	public JobOpenings click_Qualification() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Qualification.Xpath"));
		return this;
	}
	@When("select the Qualification")
	public JobOpenings click_SelectQualification() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.SelectQualification.Xpath"));
		return this;
	}
	@Given("Enter the Job Location {string}")
	public JobOpenings enter_JobLocation(String data) throws InterruptedException {
		Thread.sleep(2000);
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.JobLocation.Xpath")), data);
		return this;
	}
	@When("Click the Job Opening Date")
	public JobOpenings click_joblocations() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.joblocations.Xpath"));
		return this;
	}
	@When("Click the Job Opening Date")
	public JobOpenings click_JobOpeningdate() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.JobOpeningdate.Xpath"));
		return this;
	}
	@When("Select the Job Opening Date")
	public JobOpenings Select_JobOpeningdate() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectJobOpeningdate.Xpath"));
		return this;
	}
	@When("Click the Submission Due Date")
	public JobOpenings click_SubmissionDuedate() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.SubmissionDuedate.Xpath"));
		return this;
	}
	@When("Select the Submission Due Date")
	public JobOpenings Select_SubmissionDuedate() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectSubmissionDuedate.Xpath"));
		return this;
	}
	@When("Click the Job Type")
	public JobOpenings click_JobType() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.JobType.Xpath"));
		return this;
	}
	@When("Select the Job Type")
	public JobOpenings Select_JobType() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectJobType.Xpath"));
		return this;
	}
	@When("Click the Start Asap")
	public JobOpenings click_StartAsap() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.StartAsap.Xpath"));
		return this;
	}
	@When("Click the Start Asap")
	public JobOpenings click_StartAsap1() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.StartAsap1.Xpath"));
		return this;
	}
	@Given("Enter Salary {string}")
	public JobOpenings enter_SalaryIn(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.enterSalaryIn.Xpath")), data);
		return this;
	}
	@Given("Enter Perm Fee {string}")
	public JobOpenings enter_PermFee(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.enterPermFee.Xpath")), data);
		return this;
	}
	@When("Click the Posting Status {string}")
	public JobOpenings click_PostingStatus(String data) throws InterruptedException {
		Thread.sleep(2000);
		selectDropDownUsingVisibleText(prop.getProperty("JobOpenings.PostingStatus.Xpath"),data);
		return this;
	}
	@When("Select the Posting Status")
	public JobOpenings Select_PostingStatus() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectPostingStatus.Xpath"));
		return this;
	}
	@When("Click the Add Skills")
	public JobOpenings click_addskills() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.addskills.Xpath"));
		return this;
	}
	@When("Select the Add Skills")
	public JobOpenings Select_addskills() throws InterruptedException {
		Thread.sleep(3000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectaddskills.Xpath"));
		return this;
	}
	@Given("Enter Sourcing Location In {string}")
	public JobOpenings enter_SourcingLocation(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.SourcingLocation.Xpath")), data);
		return this;
	}
	@When("Click the Add Language")
	public JobOpenings click_addLanguage() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.addLanguage.Xpath"));
		return this;
	}
	@When("Select the Add Language")
	public JobOpenings Select_addLanguage() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectaddLanguage.Xpath"));
		return this;
	}
	@Given("Enter Location radius {string}")
	public JobOpenings enter_Locationradius(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.Locationradius.Xpath")), data);
		return this;
	}
	@When("Click the Location radius {string}")
	public JobOpenings click_Locationradius(String data) throws InterruptedException {
		Thread.sleep(2000);
		selectDropDownUsingVisibleText(prop.getProperty("JobOpenings.Locationradius1.Xpath"),data);
		return this;
	}
	@When("Select the Location radius")
	public JobOpenings Select_Locationradius() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectLocationradius.Xpath"));
		return this;
	}
	@When("Click the Candidate tags")
	public JobOpenings click_Candidatetags() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Candidatetags.Xpath"));
		return this;
	}
	@When("Select the Candidate tags")
	public JobOpenings Select_Candidatetags() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectCandidatetags.Xpath"));
		return this;
	}
	@When("Click the source")
	public JobOpenings click_source() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.source.Xpath"));
		return this;
	}
	@When("Select the source")
	public JobOpenings Select_source() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.selectsource.Xpath"));
		return this;
	}
	@When("Click the Email")
	public JobOpenings click_Email() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Email.Xpath"));
		return this;
	}
	@Given("Enter Notice period {string}")
	public JobOpenings enter_noticeperiod(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.noticeperiod.Xpath")), data);
		return this;
	}
	@Given("Enter Experience {string}")
	public JobOpenings enter_Experience(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("JobOpenings.Experience.Xpath")), data);
		return this;
	}
	@When("Click the Save and Next Button in the Create a new opening page")
	public JobOpenings SelectJobOpenings_NextBtn() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("SelectJobOpenings.Nextone.Xpath"));
		return this;
	}
	@When("Click the Job details Save and Next Button in the Create a new opening page")
	public JobOpenings SelectJobOpenings_Save_NextBtn_two() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpenings.Nexttwo.Xpath"));
		return this;
	}

	
	@When("Click the Job details page Save and Next Button in the Create a new opening page")
	public JobOpenings SelectJobOpenings_Save_NextBtn_three() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("JobOpening.Nextthree.Xpath"));
		return this;
	}
	//Edit job openings
	@When("Click Edit Add Job Button in the Job Openings Page")
	public JobOpenings clickJobOpenings_EditjobBtn() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("JobOpenings.EditjobBtn.Xpath")));
		return this;
	}
	
	@Then("Verify the Job Title")
	public JobOpenings verify_JobTitle() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobTitle.Xpath")));
		return this;

	}
	@Then("Verify the Create a new opening in the Job Openings")
	public JobOpenings verify_JobDescription() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobOpenings_JobDescription.Xpath")));
		return this;

	}
	@Then("Verify the Create a new opening in the Job Openings")
	public JobOpenings verify_JobOpenings_Tags() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobOpenings_Tags.Xpath")));
		return this;

	}
	@Then("Verify the client in the Job Openings")
	public JobOpenings Verify_JobOpenings_Client() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobOpenings_Client.Xpath")));
		return this;

	}
	@Then("Verify the Client Contacts in the Job Openings")
	public JobOpenings verifyJobOpening_ClientContacts() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobOpenings_ClientContacts.Xpath")));
		return this;

	}
	@Then("Verify Number of vancancy in the Job Openings")
	public JobOpenings verify_Numberofvancancy() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.Numberofvancancy.Xpath")));
		return this;

	}
	@Then("Verify Types of priority in the Job Openings")
	public JobOpenings verify_Typesofpriority() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.Numberofvancancy.Xpath")));
		return this;

	}
	@Then("Verify Job Categories in the Job Openings")
	public JobOpenings verify_JobCategories() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobCategories.Xpath")));
		return this;

	}
	@Then("Verify Recruiter in the Job Openings")
	public JobOpenings verify_Recruiter() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyRecruiter.Xpath")));
		return this;

	}
	@Then("Verify Account owner in the Job Openings")
	public JobOpenings verify_Accountowner() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyAccountowner.Xpath")));
		return this;

	}
	@Then("Verify Qualification in the Job Openings")
	public JobOpenings verify_Qualification() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyQualification.Xpath")));
		return this;

	}
	@Then("Verify Job Location in the Job Openings")
	public JobOpenings verify_JobLocation() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobLocation.Xpath")));
		return this;

	}
	@Then("Verify Job Opening date in the Job Openings")
	public JobOpenings verify_JobOpeningdate() throws InterruptedException {
		Thread.sleep(2000);
		getTypedText(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobOpeningdate.Xpath")));
		return this;

	}
	@Then("Verify Submission Due date in the Job Openings")
	public JobOpenings verify_SubmissionDuedate() throws InterruptedException {
		Thread.sleep(2000);
		getTypedText(locateElement("XPath", prop.getProperty("JobOpenings.verifySubmissionDuedate.Xpath")));
		return this;

	}
	@Then("Verify Job Typein the Job Openings")
	public JobOpenings verify_JobType() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyJobType.Xpath")));
		return this;

	}
	@Then("Verify Salary In in the Job Openings")
	public JobOpenings verify_SalaryIn() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifySalaryIn.Xpath")));
		return this;

	}
	@Then("Verify Perm Fee in the Job Openings")
	public JobOpenings verify_PermFee() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyPermFee.Xpath")));
		return this;

	}
	@Then("Verify Posting Status in the Job Openings")
	public JobOpenings verify_PostingStatus() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyPostingStatus.Xpath")));
		return this;

	}
	@Then("Verify add skills in the Job Openings")
	public JobOpenings verify_addskills() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyaddskills.Xpath")));
		return this;

	}
	@Then("Verify Sourcing Location in the Job Openings")
	public JobOpenings verify_SourcingLocation() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifySourcingLocation.Xpath")));
		return this;

	}
	@Then("Verify add Language in the Job Openings")
	public JobOpenings verify_addLanguage() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyaddLanguage.Xpath")));
		return this;

	}
	@Then("Verify Location radius in the Job Openings")
	public JobOpenings verify_Locationradius() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyLocationradius.Xpath")));
		return this;

	}
	@Then("Verify Candidate tagsin the Job Openings")
	public JobOpenings verify_Candidatetags() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyCandidatetags.Xpath")));
		return this;

	}
	@Then("Verify source in the Job Openings")
	public JobOpenings verify_source() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifysource.Xpath")));
		return this;

	}
	@Then("Verify notice period in the Job Openings")
	public JobOpenings verify_noticeperiod() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifynoticeperiod.Xpath")));
		return this;

	}
	@Then("Verify Experience in the Job Openings")
	public JobOpenings verify_Experience() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.verifyExperience.Xpath")));
		return this;

	}
}
