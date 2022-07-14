package com.tscout.pages;

import org.openqa.selenium.WebElement;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Interview extends ProjectSpecificMethods {
	@When("Click the Job Openings Menu in the Dashboard")
	public Interview click_JobOpeningsMenu() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Dashboard.JobOpenings.Xpath")));
		return this;
	}
	
	@Then("Verify the Job Openings List in the Job Openings Page")
	public Interview verify_JobOpeningsList() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("JobOpenings.List.Xpath")));
		return this;

	}
	@When("Click first user in the Listview in the Job Openings Page")
	public Interview click_firstuser() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.firstuser.Xpath")));
		return this;
	}
	@When("Click Add candidate in the Job Openings Page")
	public Interview click_Addcandidate() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.Addcandidate.Xpath")));
		return this;
	}
	@When("Click candidate checkbox in the Job Openings Page")
	public Interview click_headercandidatecheckbox() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.headercandidatecheckbox.Xpath")));
		return this;
	}
	@When("Click candidate checkbox in the Job Openings Page")
	public Interview click_candidatecheckbox() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.candidatecheckbox.Xpath")));
		return this;
	}
	@When("Click candidate checkbox1 in the Job Openings Page")
	public Interview click_candidatecheckbox1() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.candidatecheckbox1.Xpath")));
		return this;
	}
	@When("Click Add selected candidate in the Job Openings Page")
	public Interview click_Addselectedcandidate() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.Addselectedcandidate.Xpath")));
		return this;
	}
	@Then("Verify ATS status in the Job Openings Page")
	public Interview verify_ATSstatus() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.ATSstatus.Xpath")));
		return this;

	}

	@When("Click drag and drop candidate in the ATS Job Openings Page")
	public Interview drag_candidate() throws InterruptedException {
		Thread.sleep(4000);
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview. dragcandidate.Xpath")));
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview. dropcandidate.Xpath")));
		return this;
		

	}
	@When("Click drag and drop candidate1 in the ATS Job Openings Page")
	public Interview drag_candidate1() throws InterruptedException {
		Thread.sleep(4000);
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dragcandidate1.Xpath")));
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dropcandidate1.Xpath")));
		return this;
		

	}
	@When("Click drag and drop candidate2 in the ATS Job Openings Page")
	public Interview drag_candidate2() throws InterruptedException {
		Thread.sleep(4000);
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dragcandidate2.Xpath")));
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dropcandidate2.Xpath")));
		return this;
		

	}
	@When("Click drag and drop candidate3 in the ATS Job Openings Page")
	public Interview drag_candidate3() throws InterruptedException {
		Thread.sleep(4000);
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dragcandidate3.Xpath")));
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dropcandidate3.Xpath")));
		return this;
		

	}
	@When("Click drag and drop candidate4 in the ATS Job Openings Page")
	public Interview drag_candidate4() throws InterruptedException {
		Thread.sleep(4000);
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dragcandidate4.Xpath")));
		clickWithdraganddrop(locateElement("XPath", prop.getProperty("Interview.dropcandidate4.Xpath")));
		return this;
		

	}

	private void clickWithdraganddrop(WebElement locateElement) {
		// TODO Auto-generated method stub
		
	}
	@When("Click ok button in the ATS Job Openings Page")
	public Interview click_okbutton() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.okbutton.Xpath")));
		return this;
	}

	@When("Click ok button in the ATS Job Openings Page")
	public Interview click_savebutton() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Interview.savebutton.Xpath")));
		return this;
	}

@When("Click the Interview Menu in the Job Openings Page")
public Interview click_Interview() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.Interview.Xpath")));
	return this;
}

@Then("Verify the Interview List in the Interview Page")
public Interview verify_InterviewList() throws InterruptedException {
	Thread.sleep(4000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.List.Xpath")));
	return this;

}
@When("Click the create interview Button in the Interview Page")
public Interview click_createinterview() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.createinterview.Xpath")));
	return this;
}
@When("Click the company name in the Interview Page")
public Interview click_company()throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.company.Xpath")));
	return this;
}
@When("Click the company name in the Interview Page")
public Interview click_companyname()throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.companyname.Xpath")));
	return this;
}
@When("Click the Search option in the Interview Page")
public Interview click_Searchoption() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.Searchoption.Xpath")));
	return this;
}
@Given("Enter Sourcing Location In {string}")
public Interview enter_SourcingLocation(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.SourcingLocation.Xpath")), data);
	return this;
}
@When("Click the company name in the Interview Page")
public Interview click_searchedcompany()throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.searchedcompany.Xpath")));
	return this;
}
@When("Click the job title in the Interview Page")
public Interview click_jobtitle() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.jobtitle.Xpath")));
	return this;
}
@When("select the job title in the Interview Page")
public Interview select_jobtitle() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.selectjobtitle.Xpath")));
	return this;
}
@When("Click the job ID Menu in the Interview Page")
public Interview click_jobID() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.jobID.Xpath")));
	return this;
}
@When("Click the interview levelin the Interview Page")
public Interview click_interviewlevel() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.interviewlevel.Xpath")));
	return this;
}
@When("select the interview levelin the Interview Page")
public Interview select_interviewlevel() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.selectinterviewlevel.Xpath")));
	return this;
}
@When("Click the save Next Button in the Interview Page")
public Interview click_saveNext() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.saveNext.Xpath")));
	return this;
}
@When("Click the interview type in the Interview Page")
public Interview click_interviewtype() throws InterruptedException {
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Interview.interviewtype.Xpath")));
	Thread.sleep(1000);
	click(locateElement("XPath", prop.getProperty("Interview.selectinterviewtype.Xpath")));
	return this;
}
@When("Click the Candidate name in the Interview Page")
public Interview click_Candidatename() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.Candidatename.Xpath")));
	return this;
}
@When("select the Candidate name in the Interview Page")
public Interview select_Candidatename() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.selectCandidatename.Xpath")));
	return this;
}
@Given("Enter Location In {string}")
public Interview enter_Location(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.SourcingLocation.Xpath")), data);
	return this;
}
@When("Click interview date time in the Interview Page")
public Interview click_interviewdatetime() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.interviewdatetime.Xpath")));
	return this;
}
@When("select interview date time in the Interview Page")
public Interview select_interviewdatetime() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.selectdatetime.Xpath")));
	return this;
}
@When("select interview date time in the Interview Page")
public Interview click_okdatebutton() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.okdatebutton.Xpath")));
	return this;
}
@When("Click the Job Openings Menu in the Interview Page")
public Interview click_datetimeok() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.datetimeok.Xpath")));
	return this;
}
@Given("Enter call link In {string}")
public Interview enter_calllink(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.calllink.Xpath")), data);
	return this;
}
@Given("Enter Interviewer In {string}")
public Interview enter_Interviewer(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.Interviewer.Xpath")), data);
	return this;
}
@When("Click the Interview level1 in the Interview Page")
public Interview click_Interviewlevel1() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.Interviewlevel1.Xpath")));
	return this;
}
@Then("Verify the Interview level1 in the Interview Page")
public Interview verify_Interviewlevel1() throws InterruptedException {
	Thread.sleep(4000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.Interviewlevel1List.Xpath")));
	return this;

}
@Given("Enter company location In {string}")
public Interview enter_companylocation(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.companylocation.Xpath")), data);
	return this;
}
@When("Click the interview status in the Interview Page")
public Interview click_interviewstatus(String data) throws InterruptedException {
	Thread.sleep(2000);
	selectDropDownUsingVisibleText(prop.getProperty("Interview.interviewstatus.Xpath"),data );
	return this;
}
@When("select the interview status in the Interview Page")
public Interview select_interviewstatus() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.selectinterviewstatus.Xpath")));
	return this;
}
@Given("Enter recruiter name In {string}")
public Interview enter_recruitername(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.recruitername.Xpath")), data);
	return this;
}
@Given("Enter company contact In {string}")
public Interview enter_companycontact(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.companycontact.Xpath")), data);
	return this;
}
@Given("Enter remarks In {string}")
public Interview enter_remarks(String data) {
	clearAndType(locateElement("XPath", prop.getProperty("Interview.remarks.Xpath")), data);
	return this;
}
//Edit Interviews
@When("Click the Edit interview in the Interview Page")
public Interview click_Editinterview() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("Interview.Editinterview.Xpath")));
	return this;
}
@Then("verify the company name in the Interview Page")
public Interview verify_companyname() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.verifycompanyname.Xpath")));
	return this;
}
@Then("verify Sourcing Location")
public Interview verify_SourcingLocation() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.SourcingLocation.Xpath")) );
	return this;
}
@Then("verify the job title in the Interview Page")
public Interview verify_jobtitle() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.jobtitle.Xpath")));
	return this;
}
@Then("verify the job ID Menu in the Interview Page")
public Interview verify_jobID() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.jobID.Xpath")));
	return this;
}
@Then("verify the interview level in the Interview Page")
public Interview verify_interviewlevel() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.interviewlevel.Xpath")));
	return this;
}
@Then("verify the interview level2 in the Interview Page")
public Interview verify_interviewlevel2() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.interviewlevel1.Xpath")));
	return this;
}
@Then("verify the Candidate name in the Interview Page")
public Interview verify_Candidatename() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.Candidatename.Xpath")));
	return this;
}
@Then("verify interview date time in the Interview Page")
public Interview verify_interviewdatetime() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.interviewdatetime.Xpath")));
	return this;
}
@Then("verify call link")
public Interview verify_calllink() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.calllink.Xpath")));
	return this;
}
@Then("verify the Job Openings Menu in the Interview Page")
public Interview verify_datetimeok() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.datetimeok.Xpath")));
	return this;
}
@Then("verify the interview type in the Interview Page")
public Interview verify_interviewtype() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.interviewtype.Xpath")));
	return this;
}
@Then("verify Location")
public Interview verify_Location() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.SourcingLocation.Xpath")));
	return this;
}
@Then("verify Interviewer")
public Interview verify_Interviewer() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.Interviewer.Xpath")));
	return this;
}
@Then("verify company location")
public Interview verify_companylocation() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.companylocation.Xpath")));
	return this;
}
@Then("verify the interview status in the Interview Page")
public Interview verify_interviewstatus() throws InterruptedException {
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.interviewstatus.Xpath")));
	return this;
}
@Then("verify recruiter name")
public Interview verify_recruitername() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.recruitername.Xpath")) );
	return this;
}
@Then("verify company contact")
public Interview verify_companycontact() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.companycontact.Xpath")) );
	return this;
}
@Then("verify remarks")
public Interview verify_remarks() {
	verifyDisplayed(locateElement("XPath", prop.getProperty("Interview.remarks.Xpath")) );
	return this;
}
}
