Feature: Clients Module in the ti-scout Application

Background: Login steps for the Client Module in tiscout Application

Given Enter the username as 'kotla@javaji.d'
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Interview
When Click the Job Openings Menu in the Dashboard

#interview
When Click the Interview Menu in the Job Openings Page
Then Verify the Interview List in the Interview Page
When Click the Edit interview in the Interview Page
Then verify the company name in the Interview Page
When Click the company name in the Interview Page
When Click the Search option in the Interview Page
Then verify Sourcing Location
Given Enter Sourcing Location In 'HCL GmbH'
Then verify the job title in the Interview Page
When Click the job title in the Interview Page
When select the job title in the Interview Page
Then verify the job ID Menu in the Interview Page
When Click the job ID Menu in the Interview Page
Then verify the interview level in the Interview Page
When Click the interview levelin the Interview Page
When select the interview levelin the Interview Page
When Click the save Next Button in the Interview Page
Then verify the interview level2 in the Interview Page
Then verify the Candidate name in the Interview Page
When Click the Candidate name in the Interview Page
When select the Candidate name in the Interview Page
Then verify interview date time in the Interview Page
When Click interview date time in the Interview Page
When select interview date time in the Interview Page
Then verify call link
Given Enter call link In 'https://ust.com/'
Then verify the Job Openings Menu in the Interview Page
When Click the Job Openings Menu in the Interview Page
Then verify the interview type in the Interview Page
When Click the interview type in the Interview Page
When select the interview type in the Interview Page
Then verify Location
Given Enter Location In 'chennai'
Then verify Interviewer
Given Enter Interviewer In 'Roshan'
When Click the save Next Button in the Interview Page
When Click the Interview level1 in the Interview Page
Then Verify the Interview level1 in the Interview Page
When Click the save Next Button in the Interview Page
Then verify company location
Given Enter company location In 'chennai'
Then verify the interview status in the Interview Page
When Click the interview status in the Interview Page
When select the interview status in the Interview Page
Then verify recruiter name
Given Enter recruiter name In 'Meena'
Then verify company contact
Given Enter company contact In '7777778888'
Then verify remarks
Given Enter remarks In 'Good'
When Click the save Next Button in the Interview Page

















