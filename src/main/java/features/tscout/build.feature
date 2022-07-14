Feature: Clients Module in the ti-scout Application

Background: Login steps for the Client Module in tiscout Application

Given Enter the username as 'consdemo@gmail.com'
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Job Openings
When Click the Job Openings Menu in the Dashboard

Scenario: Task module
Given Enter the Job location in the field
When Click the calender icon and select date from job opening date
When Click the Calender icon and select date from submission date
Given Enter the Employment type
Given Enter the Job type
Given Enter the Position as 'Public'