Feature: Task Module in the ti-scout Application

  Background: Login steps for the tiscout Application
    Given Enter the username as 'consdemo@gmail.com'
    And Enter the Password as 'test123'
    When Click on the Login
    Then tiscout Dashboard page should be displayed for Task
    When Click the Task Menu from Dashboard
    Then Verify the Task List View
    
  Scenario: Edit Task from Task Module
  
    When Click Edit icon in task page
    Then  Verify the Edit task Page
    Then  Verify title field in Edit Task Page
    Given Enter the title as 'Ms' of the Task
    Then  Verify assign to field in Edit Task Page
    Given Select the 'Rebeca Moore' from the assign to field
    Given Select the 'Cons User' from the assign to field
    Then Verify department field in Edit Task Page
    When Select the 'adidas11' from the department field
    Then Verify Contact field in Edit Task Page
    When Select the 'Rashid Khan Kahan' from the Contact
    Then Verify Job opening field in Edit Task Page
    When Select the 'Job#615 : Demo Account(m/f/x)' from the Job Opening
    Then Verify reminder type in Edit Task Page
    When Select the 'The day before' from the Reminder Type
    Then Verify  type in Edit Task Page
    When Select the 'Call' from the Type
    Then Verify  due date in Edit Task Page
    When Click the calender icon and select date from due date
    Then Verify  time in Edit Task Page
    When Click the Time from Time field
   Then  Verify  Comments in Edit Task Page
    Given Enter Comments as 'Task Entered' in Task
    When Click save button in Edit task page
    Then Verify the Task List View
    
    
