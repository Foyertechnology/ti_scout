Feature: Clients Module in the ti-scout Application

Background: Login steps for the Client Module in tiscout Application

Given Enter the username as 'kotla@javaji.d'
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Job Openings
When Click the Job Openings Menu in the Dashboard

#JobOpenings
Scenario: Verify Create Job Openings Functionality in the ti-scout User Application
Then Verify the Job Openings List in the Job Openings Page
When Click Edit Add Job Button in the Job Openings Page
Then Verify the Create a new opening in the Job Openings
Then Verify the Job Title
Given Enter Job Title as  in Create a new opening 'Software Test Engineer'
#When Click the Copy a JD from JDBuilder in Create a new opening
#Then Verify the My Job Description Page 
#When Click the My Job Description Select Button
#Given Enter Job Description as 'Responsible for evaluating software using automated or manual testing methods and analyzing the results' in Create a new opening
#Then Verify the Validation Message in Job Openings Page
#Then Verify the Create a new opening in the Job Openings
Then Verify the Create a new opening in the Job Openings
When Click the Tags field in Create a new opening page
When Select Tags from the Tag DropDown List
When Click clear Tags field in Create a new opening page
When Click the Tags field in Create a new opening page
When Select Tags from the Tag DropDown List
Then Verify the client in the Job Openings


#Given Enter the Tags Name in the Tags Search field
#When Select Tags from the Tag DropDown List
#Then Verify the Search result in the Tags Field

When Click the Client  field in Create a new opening page
Given Enter the Client Name in the Client Search field as 'Adidas11'
Then Verify the Search result in the Client Field
When Select Client from the Client DropDown List
Then Verify the Client Contacts in the Job Openings

When Click the Client Contacts field in Create a new opening page
When Select Contacts from the Client Contacts DropDown List
When Click the Save and Next Button in the Create a new opening page

#Then Verify the Job Details
Then Verify Number of vancancy in the Job Openings
Given Enter Number of vacancy '4'
Then Verify Types of priority in the Job Openings
When Click the Types of priority 'Low'
#When Click the select Types of priority
Then Verify Job Categories in the Job Openings
When Click the Types of Job Categories
When Click the Types of select Job Categories
Then Verify Recruiter in the Job Openings
When Click the Types of Recruiter1
#When select Types of Recruiter
#Then Verify Account owner in the Job Openings
#When Click the Account owner
#When select Types of Account owne
Then Verify Qualification in the Job Openings
When Click the Qualification
When select the Qualification
When Click the Save and Next Button in the Create a new opening page

#other Details
Then Verify Job Location in the Job Openings
Given Enter the Job Location 'Velacherys'
#Then Verify Job Opening date in the Job Openings
When Click the Job Opening Date
When Select the Job Opening Date
#Then Verify Submission Due date in the Job Openings
When Click the Submission Due Date
When Select the Submission Due Date
Then Verify Job Typein the Job Openings
When Click the Job Type
When Select the Job Type
When Click the Start Asap
Then Verify Salary In in the Job Openings
Given Enter Salary '200000'
Then Verify Perm Fee in the Job Openings
Given Enter Perm Fee '99'
Then Verify Posting Status in the Job Openings
When Click the Posting Status 'Internal'
#When Select the Posting Status
When Click the Save and Next Button in the Create a new opening page
Then Verify add skills in the Job Openings
When Click the Add Skills
When Select the Add Skills
Then Verify Sourcing Location in the Job Openings
Given Enter Sourcing Location In 'chennai'
Then Verify add Language in the Job Openings
When Click the Add Language
When Select the Add Language
Then Verify Location radius in the Job Openings
Given Enter Location radius '20'
When Click the Location radius 'KM'
#When Select the Location radius
Then Verify Candidate tagsin the Job Openings
When Click the Candidate tags
When Select the Candidate tags
Then Verify source in the Job Openings
When Click the source
When Select the source
When Click the Email
Then Verify notice period in the Job Openings
Given Enter Notice period '8'
Then Verify Experience in the Job Openings
Given Enter Location radius '8'
When Click the Save and Next Button in the Create a new opening page
#When Click the Job details Save and Next Button in the Create a new opening page




















