package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC008_TaskPage extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues_AddTask() {
		testCaseName = "Task Module";
		testDescription = "Task Module to Create New Task";
		nodes = "Task";
		authors = "Testing Team";
		category = "Functional Test";
		dataSheetName = "Task";
	}

	@Test(dataProvider = "fetchData")
	public void ADD_Clients(String uName, String pwd) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage_task()
		.click_the_task_menu_from_dashboard()
		.verifyTask_ListView()
		.click_Search_Task()
		.enter_value_task_Search("test")
        .click_add_new_from_task()
		.verifyaddnew_Task()
		.enter_title_task("Mr")
		.Click_assign_to_field() 
		.select_the_from_the_assign_to_field()
		//click_department_field_Task()
		.select_the_from_the_department_field()
		//click_contact_field_Task()
		.select_the_from_the_contact()
		//.click_Jobopening_Task()
		.select_the_from_the_job_opening()
		//.click_reminder_type_Task()
		.select_the_from_the_reminder_type()
		//.click_type_task()
		.select_the_from_the_type()
		.click_the_calender_icon_and_select_date_from_due_date()
		.click_the_time_from_time_field()
		.enter_the_TaskComments("Data")
		.click_the_save_button()
		.verify_validationmessage_Task();
		
}

	
}