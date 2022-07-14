package com.tscout.pages;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardPage extends ProjectSpecificMethods {

	@When("Click the dashboard menu")
	public DashboardPage clickDashboard_Menu() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("click.Dashboard.Xpath")));
		return this;
	}

	@Then("Verify past days in dashboard page")
	public DashboardPage verifypastdays_Dasboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.pastdays.Xpath")));
		return this;

	}
	@Then("Verify Recently created openings in dashboard page")
	public DashboardPage verify_Recently_created_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.recentlycreated.Xpath")));
		return this;

	}
	@Then("Verify performance statistics in dashboard page")
	public DashboardPage verify_Performance_statistics() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.statistics.Xpath")));
		return this;

	}
	
	@When("select past 60 days in calendar list")
	public DashboardPage select_past60_days_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.past60days.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.past60days.Xpath")));
		return this;
	}
	@When("select past 90 days in calendar list")
	public DashboardPage select_past90_days_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.past90days.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.past90days.Xpath")));
		return this;
	}
	@When("select past 180 days in calendar list")
	public DashboardPage select_past180_days_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.past180days.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.past180days.Xpath")));
		return this;
	}
	@When("select past 365 days in calendar list")
	public DashboardPage select_past365_days_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.past365days.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.past365days.Xpath")));
		return this;
	}
	@When("select custom date in calendar list")
	public DashboardPage click_customdate_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.days.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.customdate.Xpath")));
		return this;
	}
	@When("select start date in calendar list")
	public DashboardPage choose_startdate_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.startdate.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.startdate.Xpath")));
		return this;
	}
	@When("select End date in calendar list")
	public DashboardPage choose_endDate_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.EndDate.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.EndDate.Xpath")));
		return this;
	}
	
	@When("click Submit button in date")
	public DashboardPage click_submitbutton_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.submitbutton.Xpath")));
		return this;
	}
	@Then("Verify calendar icon in dashboard page")
	public DashboardPage verify_calendar_icon() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.calendaricon.Xpath")));
		return this;

	}
	@When("click job board in dashboard")
	public DashboardPage click_Job_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.jobboard.Xpath")));
		return this;
	}
	@Then("Verify Job board in dashboard page")
	public DashboardPage verify_job_list_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.Jobboard.Xpath")));
		return this;

	}
	@When("click interview board in dashboard")
	public DashboardPage click_interview_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.interviewboard.Xpath")));
		return this;
	}
	@Then("Verify interview board in dashboard page")
	public DashboardPage verify_interview_list_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.Interviewboard.Xpath")));
		return this;

	}
	@When("click Task board in dashboard")
	public DashboardPage click_Task_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.taskboard.Xpath")));
		return this;
	}
	@Then("Verify task board in dashboard page")
	public DashboardPage verify_task_list_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.taskboard.Xpath")));
		return this;

	}
	@Then("Verify upcoming interviews in dashboard page")
	public DashboardPage verify_upcoming_interviews() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.upcominginterview.Xpath")));
		return this;

	}
	@Then("Verify ATS board in dashboard page")
	public DashboardPage verify_ATS_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.atsboard.Xpath")));
		return this;

	}
	@Then("Verify upcoming dues  in dashboard page")
	public DashboardPage verify_upcomingdues() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.upcomingdues.Xpath")));
		return this;

	}
	@When("click team activities board in dashboard")
	public DashboardPage click_teamactivities_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.teamactivities.Xpath")));
		return this;
	}
	@Then("Verify team activities  in dashboard page")
	public DashboardPage verify_teamactivities_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.teamactivities.Xpath")));
		return this;

	}
	@When("click source board in dashboard")
	public DashboardPage click_source_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.sourceboard.Xpath")));
		return this;
	}
	@Then("Verify source board  in dashboard page")
	public DashboardPage verify_source_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.sourceboard.Xpath")));
		return this;

	}
	@When("click source hired candidate in dashboard")
	public DashboardPage click_source_hiredcandidates_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.source.hired.Xpath")));
		return this;
	}
	@Then("Verify source hired  in dashboard page")
	public DashboardPage verify_source_hiredcandidates_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.source.hired.Xpath")));
		return this;

	}
	@Then("Verify flag  in dashboard page")
	public DashboardPage verify_flag_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.flag.Xpath")));
		return this;

	}
	@When("click flag icon in dashboard")
	public DashboardPage click_flagicon_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.flagicon.Xpath")));
		return this;
	}
	@When("click flag icon in dashboard")
	public DashboardPage Select_German_flag_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.german.flagicon.Xpath")));
		return this;
	}
	@When("click flag icon in dashboard")
	public DashboardPage Select_English_flag_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.select.english.flagicon.Xpath")));
		return this;
	}
	@When("click notification icon in dashboard")
	public DashboardPage click_notification_icon_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.notificationicon.Xpath")));
		return this;
	}
	@Then("Verify notification icon  in dashboard page")
	public DashboardPage verify_notification_icon_Dashboard() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.notificationicon.Xpath")));
		return this;

	}
	@When("click Reminder icon in dashboard")
	public DashboardPage click_Reminder_icon_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.Remindericon.Xpath")));
		return this;
	}
	@Then("Verify Reminder icon  in dashboard page")
	public DashboardPage verify_Reminder_icon_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.Remindericon.Xpath")));
		return this;

	}
	@When("click Profile in dashboard")
	public DashboardPage click_profile_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.Profileicon.Xpath")));
		return this;
	}
	@Then("Verify Reminder icon  in dashboard page")
	public DashboardPage verify_clientname_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.clientname.Xpath")));
		return this;

	}
	@When("click Profile in dashboard")
	public DashboardPage click_setting_Dasboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.settingsprofile.Xpath")));
		return this;
	}
	@Then("Verify Reminder icon  in dashboard page")
	public DashboardPage verify_Settings_Page_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.settingspage.Xpath")));
		return this;

	}
	@When("click Profile in dashboard")
	public DashboardPage click_email_Dashbaord() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.email.security.Xpath")));
		return this;
	}
	@Then("Verify Reminder icon  in dashboard page")
	public DashboardPage verify_email_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.email.security.Xpath")));
		return this;

	}
	@When("click Profile in dashboard")
	public DashboardPage click_Security_menu_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.security.menu.Xpath")));
		return this;
	}
	@Then("Verify Reminder icon  in dashboard page")
	public DashboardPage verify_security_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.security.Xpath")));
		return this;

	}
	@Given("Enter the Password as {string}")
	public DashboardPage enter_current_pwd_Dashbaord(String data) {
		 //clearAndType(locateElement("id","password"), data);
		clearAndType(locateElement("XPath", prop.getProperty("Dasboard.enter.currentpwd.Xpath")), data);
		return this;
	}
	@When("click eyeicon in dashboard")
	public DashboardPage click_eyeicon_current_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.eyeicon.current.Xpath")));
		return this;
	}
	@Then("Verify current password  in dashboard page")
	public DashboardPage verify_current_pwd_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.currentpwd.Xpath")));
		return this;

	}
	@Given("Enter the Password as {string}")
	public DashboardPage enter_new_pwd_Dashboard(String data) {
		 //clearAndType(locateElement("id","password"), data);
		clearAndType(locateElement("XPath", prop.getProperty("Dasboard.enter.newpwd.Xpath")), data);
		return this;
	}
	@When("click eyeicon in dashboard")
	public DashboardPage click_eyeicon_new_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.eyeicon.newpwd.Xpath")));
		return this;
	}
	@Then("Verify new password  in dashboard page")
	public DashboardPage verify_new_pwd_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.newpwd.Xpath")));
		return this;

	}
	@Given("Enter the Password as {string}")
	public DashboardPage enter_retype_pwd_Dashboard(String data) throws InterruptedException {
		 //clearAndType(locateElement("id","password"), data);
		clearAndType(locateElement("XPath", prop.getProperty("Dasboard.enter.retype.Xpath")), data);
		return this;
	}
	@When("click eyeicon in dashboard")
	public DashboardPage click_eyeicon_retype_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.eyeicon.retype.Xpath")));
		return this;
	}
	@Then("Verify new password  in dashboard page")
	public DashboardPage verify_Retype_pwd_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.retype.Xpath")));
		return this;

	}
	@When("click save and security in dashboard")
	public DashboardPage click_save_security_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.savesecurity.retype.Xpath")));
		return this;
	}
	@When("click account menu in dashboard")
	public DashboardPage click_account_menu_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Dasboard.click.accountmenu.retype.Xpath")));
		return this;
	}
	@Then("Verify account page in dashboard page")
	public DashboardPage verify_accountpage_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Dasboard.verify.accountmenu.Xpath")));
		return this;

	}
}