Feature: Clients Module in the ti-scout Application

Background: Login steps for the Client Module in tiscout Application

Given Enter the username as 'kotla@javaji.d'
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Interview
When Click the Job Openings Menu in the Dashboard

#JobOpenings
Scenario: Verify Create Job Openings Functionality in the ti-scout User Application
Then Verify the Job Openings List in the Job Openings Page
When Click first user in the Listview in the Job Openings Page
When Click Add candidate in the Job Openings Page
When Click candidate checkbox in the Job Openings Page
When Click candidate checkbox1 in the Job Openings Page
When Click Add selected candidate in the Job Openings Page
Then Verify ATS status in the Job Openings Page
When Click drag and drop candidate1 in the ATS Job Openings Page
When Click ok button in the ATS Job Openings Page
When Click drag and drop candidate1 in the ATS Job Openings Page
When Click ok button in the ATS Job Openings Page
When Click drag and drop candidate2 in the ATS Job Openings Page
When Click ok button in the ATS Job Openings Page
When Click drag and drop candidate3 in the ATS Job Openings Page
When Click ok button in the ATS Job Openings Page
When Click drag and drop candidate4 in the ATS Job Openings Page
When Click ok button in the ATS Job Openings Page

#interview
When Click the Interview Menu in the Job Openings Page
Then Verify the Interview List in the Interview Page
When Click the create interview Button in the Interview Page
When Click the company name in the Interview Page
When Click the Search option in the Interview Page
Given Enter Sourcing Location In 'HCL GmbH'
When Click the job title in the Interview Page
When select the job title in the Interview Page
When Click the job ID Menu in the Interview Page
When Click the interview levelin the Interview Page
When select the interview levelin the Interview Page
When Click the save Next Button in the Interview Page
When Click the Candidate name in the Interview Page
When select the Candidate name in the Interview Page
When Click interview date time in the Interview Page
When select interview date time in the Interview Page
Given Enter call link In 'https://ust.com/'
When Click the Job Openings Menu in the Interview Page
When Click the interview type in the Interview Page
When select the interview type in the Interview Page
Given Enter Location In 'chennai'
Given Enter Interviewer In 'Roshan'
When Click the save Next Button in the Interview Page
When Click the Interview level1 in the Interview Page
Then Verify the Interview level1 in the Interview Page
When Click the save Next Button in the Interview Page
Given Enter company location In 'chennai'
When Click the interview status in the Interview Page
When select the interview status in the Interview Page
Given Enter recruiter name In 'Meena'
Given Enter company contact In '7777778888'
Given Enter remarks In 'Good'
When Click the save Next Button in the Interview Page

















