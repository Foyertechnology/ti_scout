package com.tscout.pages;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Task extends ProjectSpecificMethods {
	
	
	
	@When("Click the Task Menu from Dashboard")
	public Task click_the_task_menu_from_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Task.Menu.Xpath")));
		return this;

	}
	@Then("Verify the Task List View")
	public Task verifyTask_ListView() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Task.ListView.Xpath")));
		return this;
	}
	@When("Click Search button in task list view")
	public Task click_Search_Task() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.click.searchbutton.Xpath")));
		return this;

	}
	@Given("Enter value in search field")
	public Task enter_value_task_Search(String data) throws InterruptedException {
		Thread.sleep(1000);
		clearAndType(locateElement("XPath", prop.getProperty("Task.enter.searchvalue.Xpath")), data);
		return this;
	}
	@When("Click Add new task from Task")
	public Task click_add_new_from_task() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Task.addnew.Xpath")));
		return this;
	}
	
	@Then("Verify Add New Task Page")
	public Task verifyaddnew_Task() throws InterruptedException{
	Thread.sleep(2000);
	verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.addnewtask.Xpath")));
	return this;
		
	}

	@Given("Enter the title as {string} of the Task")
	public Task enter_title_task(String data) throws InterruptedException {
		Thread.sleep(1000);
		clearAndType(locateElement("XPath", prop.getProperty("Task.title.Xpath")), data);
		return this;
	}
	
	@When("Click assign to field in Task Page")
	public Task Click_assign_to_field() {
		click(locateElement("XPath", prop.getProperty("Task.ClickAssigntofield.Xpath")));
		return this;
	}

	@When("Select assign to field in Task Page")
	public Task select_the_from_the_assign_to_field() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("Task.select.Assigntofield.Xpath")));
		Thread.sleep(1000);
		return this;
	}
	@When("Click the BlankPage in the Task Page")
	public Task Click_BlankPage() {
		click(locateElement("XPath", prop.getProperty("Task.ClickBlankPage.Xpath")));
		return this;
	}
	
	@When("Select the from the department field")
	public Task select_the_from_the_department_field() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.Click.departmentfield.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.deptsel.Xpath")));
		return this;
	}

	
	@When("Select  from the Contact")
	public Task select_the_from_the_contact() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.Click.contactfield.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.consel.Xpath")));
		return this;
	}
	
	@When("Select Job Opening")
	public Task select_the_from_the_job_opening() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.Click.Jobopening.field.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.jbsel.Xpath")));
		return this;
	}
	
	@When("Select  Reminder Type")
	public Task select_the_from_the_reminder_type() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.Click.remindertype.field.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.select.remindertype.field.Xpath")));
		return this;
	}
	
	@When("Select Type")
	public Task select_the_from_the_type() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.Click.type.field.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Task.select.type.Xpath")));
		return this;
	}

	@When("Click the calender icon and select date from due date")
	public Task click_the_calender_icon_and_select_date_from_due_date() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Task.duedate.Xpath"));
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Task.Select.duedate.Xpath"));
		return this;
	}

	@When("Click the Time from Time field")
	public Task click_the_time_from_time_field() throws InterruptedException {
		Thread.sleep(2000);
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Task.Time.Xpath"));
		//setExplicitWaitClickByXpathusingJS(prop.getProperty("Task.dtnxt.Xpath"));
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Task.Time.ok.Xpath"));
		Thread.sleep(2000);
		return this;
	}
	@Given("Enter Comments as {string} in Task")
	public Task enter_the_TaskComments(String data) throws InterruptedException {
		Thread.sleep(2000);
		clearAndType(locateElement("XPath", prop.getProperty("Task.Comments.Xpath")), data);
		return this;
	}
	@When("Click the save button in Task")
	public Task click_the_save_button() throws InterruptedException {
		setExplicitWaitClickByXpathusingJS(prop.getProperty("Task.SaveBtn.Xpath"));
		Thread.sleep(2000);
		return this;
	}
	@Then("Verify validation message in create task Page")
	public Task verify_validationmessage_Task() throws InterruptedException{
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.validationmessage.Xpath")));
		return this;
		

}
	
		//Edit Task
		@When("Click Edit icon in task page")
		public Task clickEditIcon_task() throws InterruptedException {
			setExplicitWaitClickByXpathusingJS(prop.getProperty("Task.click.EditIcon.Xpath"));
			Thread.sleep(2000);
			return this;
		
		}
		
		@Then("Verify the Edit task Page")
		public Task VerifyEditTaskPage() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.EditTaskPage.Xpath")));
			return this;
			

}
		@Then("Verify title field in Edit Task Page")
		public Task Verify_title_Edittask() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.title.edit.Xpath")));
			return this;
			

}
		@Then("Verify assign to field in Edit Task Page")
		public Task Verify_assign_to_field() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.assignto.edit.Xpath")));
			return this;
			

}
		@Then("Verify department field in Edit Task Page")
		public Task Verify_department_field_editTask() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.department.edit.Xpath")));
			return this;
			

}
		@Then("Verify Contact field in Edit Task Page")
		public Task Verify_contact_edit_Task() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.contact.edit.Xpath")));
			return this;	
		

}
		@Then("Verify Job opening field in Edit Task Page")
		public Task verify_jobopening_editTask() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.jobopening.edit.Xpath")));
			return this;	
		

}	
		@Then("Verify reminder type in Edit Task Page")
		public Task verify_reminder_type_edit_task() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.remindertype.edit.Xpath")));
			return this;	
		

}			
		@Then("Verify  type in Edit Task Page")
		public Task verify_type_edit_task() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.type.edit.Xpath")));
			return this;	
		

}
		@Then("Verify  due date in Edit Task Page")
		public Task verify_duedate_EditTask() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.duedate.edit.Xpath")));
			return this;	
		

}
		@Then("Verify  time in Edit Task Page")
		public Task verify_time_EditTask() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.time.edit.Xpath")));
			return this;	
		

}
		@Then("Verify  Comments in Edit Task Page")
		public Task verify_Comments_EditTask() throws InterruptedException{
			Thread.sleep(2000);
			verifyDisplayed(locateElement("XPath", prop.getProperty("Task.Verify.Comments.edit.Xpath")));
			return this;	
		

}@When("Click save button in Edit task page")
public Task click_the_save_button_EditTask() throws InterruptedException {
	Thread.sleep(2000);
	click(locateElement("XPath", prop.getProperty("EditTask.click.savebutton.Xpath")));
	return this;

}	
		}
