Feature: Task Module in the ti-scout Application

  Background: Login steps for the tiscout Application
    Given Enter the username as 'consdemo@gmail.com'
    And Enter the Password as 'test123'
    When Click on the Login
    Then tiscout Dashboard page should be displayed for Task
    When Click the Task Menu from Dashboard
    Then Verify the Task List View
    When Click Add new task from Task

  Scenario: Create a the Task from Task Module
    Given Enter the title as 'Ms' of the Task
    When Click Assign To Field in Add Task
    Given Select the 'Rebeca Moore' from the assign to field
    Given Select the 'Cons User' from the assign to field
    When Select the 'adidas11' from the department field
    When Select the 'Rashid Khan Kahan' from the Contact
    When Select the 'Job#615 : Demo Account(m/f/x)' from the Job Opening
    When Select the 'The day before' from the Reminder Type
    When Select the 'Call' from the Type
    When Click the calender icon and select date from due date
    When Click the Time from Time field
    Given Enter Comments as 'Task Entered' in Task
    When Click the save button in Task
    Then Verify the Task List View
    
    
