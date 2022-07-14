package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC003_Dashboard extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues_Dashboard() {
		testCaseName = "Dashboard";
		testDescription = "Dashboard testCase";
		nodes = "Dashboard";
		authors = "Testing Team";
		category = "Smoke Test";
		dataSheetName = "Dashboard";
	}

	@Test(dataProvider = "fetchData")
	public void tiscout_Login(String uName, String pwd) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage()
		//.clickDashboard_Menu()
		.verifypastdays_Dasboard()
		.verify_Recently_created_Dashboard()
		.verify_Performance_statistics()
		.select_past60_days_Dashboard()
		.verify_Recently_created_Dashboard()
		.verify_Performance_statistics()
		.select_past90_days_Dashboard()
		.verify_Recently_created_Dashboard()
		.verify_Performance_statistics()
		.select_past180_days_Dashboard()
		.verify_Recently_created_Dashboard()
		.verify_Performance_statistics()
		.select_past365_days_Dashboard()
		.verify_Recently_created_Dashboard()
		.verify_Performance_statistics()
		.click_customdate_Dashboard()
		//.choose_startdate_Dashboard()
		//.choose_endDate_Dashboard()
		.click_submitbutton_Dashboard()
		.verify_Recently_created_Dashboard()
		.verify_Performance_statistics()
		.verify_calendar_icon()
		.click_Job_Dashboard()
		.verify_job_list_Dashboard()
		.click_interview_Dashboard()
		.verify_interview_list_Dashboard()
		.click_Task_Dashboard()
		.verify_task_list_Dashboard()
		.verify_upcoming_interviews()
		.verify_ATS_Dashboard()
		.verify_upcomingdues()
		.click_teamactivities_dashboard()
		.verify_teamactivities_dashboard()
		.click_source_Dashboard()
		.verify_source_Dashboard()
		.click_source_hiredcandidates_Dashboard()
		.verify_source_hiredcandidates_Dashboard()
		.verify_flag_Dashboard()
		.click_flagicon_Dashboard()
		.Select_German_flag_Dashboard()
		.click_flagicon_Dashboard()
		.Select_English_flag_Dashboard()
		.click_notification_icon_Dashboard()
		.verify_notification_icon_Dashboard()
		.click_Reminder_icon_Dashboard()
		.verify_Reminder_icon_Dashboard()
		.click_profile_Dashboard()
		.verify_clientname_Dashboard()
		.click_setting_Dasboard()
		.verify_Settings_Page_Dashboard()
		.click_email_Dashbaord()
		.verify_email_Dashboard()
		.click_Security_menu_Dashboard()
		.verify_security_dashboard()
		.enter_current_pwd_Dashbaord("test123")
		.click_eyeicon_current_Dashboard()
		.verify_current_pwd_Dashboard()
		.click_save_security_dashboard()
		.enter_current_pwd_Dashbaord("test123")
		.click_eyeicon_current_Dashboard()
		.verify_current_pwd_Dashboard()
		.enter_new_pwd_Dashboard("test")
		.click_eyeicon_new_Dashboard()
		.verify_new_pwd_Dashboard()
		.enter_retype_pwd_Dashboard("test1")
		.click_eyeicon_retype_Dashboard()
		.verify_Retype_pwd_Dashboard()
		.click_save_security_dashboard()
		.enter_current_pwd_Dashbaord("test123")
		.click_eyeicon_current_Dashboard()
		.verify_current_pwd_Dashboard()
		.click_save_security_dashboard()
		.enter_new_pwd_Dashboard("test123")
		.click_eyeicon_new_Dashboard()
		.verify_new_pwd_Dashboard()
		.enter_retype_pwd_Dashboard("test123")
		.click_eyeicon_retype_Dashboard()
		.verify_Retype_pwd_Dashboard()
		.click_save_security_dashboard()
		.click_account_menu_dashboard()
		.verify_accountpage_dashboard();
	}
}





