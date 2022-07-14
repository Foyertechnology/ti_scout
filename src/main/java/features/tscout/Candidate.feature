Feature: Candidate Module in the ti-scout Application

Background: Login steps for the Candidate module in tiscout Application


Given Enter the username as "kotla@javaji.de"
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Clients
When Click the  Candidate Menu in the Dashboard
#CreateCandidate
Scenario: Verify Create Candidate Functionality in the ti-scout User Application
Then Verify the Candidate List in the Candidate Page
When Click Search button in the Candidate Page
Given Enter data "Test" in Search Candidate 
When Click Add Candidate Button in the Candidate Page
Then Verify the Create a new Candidate in the Candidate
#When Click Resume name in the Candidate Page
#When select file from the system in the Candidate Page
#When click upload cv in the Candidate Page
#Then verify the Cv uploaded successful in the Candidate Page
When Click Manual filling in the Candidate Page
Then Verify Manual filling in the Candidate Page
When Select Salutation in Candidate Page
Given Enter Firstname "Zura" in Create Candidate
Given Enter Last name "Henry" in Create Candidate
Given Enter EmailId "hqqgsgs@gmail.com" in Create Candidate 
Given Enter Mobilenumber "7762723623" in Create Candidate
When  Select date of birth in Candidate Page
Given Enter Place "Chennai" in Create Candidate
When  Select nationality in Candidate Page 
Given Enter Address "JJNAGAR" in Create Candidate
Given Enter City "Chennai" in Create Candidate
Given Enter Country "India" in Create Candidate
Given Enter Zipcode "603110" in Create Candidate
When  Select tags in Candidate Page 
Given Enter experience "1" in Create Candidate
Given Enter notes "QA Automation Engineer" in Create Candidate
When  Click save and next button in Candidate Page 


#Education

Then Verify the Education details in Candidate Page
Given Enter Institution "MGR" in  Candidate Page
Given Enter Candidate location "Chennai" in  Candidate Page
Given Enter Candidate Graduation "2018" in  Candidate Page
When Select StartDate in Candidate Education Page
When Select EndDate in Candidate Education Page
When click Add more in  Candidate Education Page

#Certification

Then Verify the Certification details in Candidate Page
Given Enter Certification Name "Testing" in  Candidate Page
Given Enter Institute Name "Tutors" in  Candidate Page
Given Enter Certification Location "Chennai" in  Candidate Page
When Select StartDate in Candidate Certification Page
When Select EndDate in Candidate Certification Page
When click Add more in  Candidate Certification Page
When Click Proceed button in Candidate Certification Page

#Experience

Then Verify the Experience details in Candidate Page
Given Enter Candidate Employer name "HCL" in  Candidate Page
Given Enter Experience Candidate location "Chennai" in  Candidate Page
Given Enter Candidate Jobtitle "Test Engineer" in  Candidate Page
When Select StartDate in Candidate Experience Page
When Select EndDate in Candidate Experience Page
Given Enter Responsibilities_Candidate "Tester" in  Candidate Page
When Click Experience next icon in Candidate Page

#Skills

Then Verify Skills Details in Candidate Page
When Select Skills in Candidate Page
When Select Proficiency in Candidate Page
When Click Add Skills in Skills details Page
When Click next icon in Skills details Page
#Language

Then Verify the Language Details in Candidate Page
When Select Language in Candidate Page
When Select Language Proficiency in Candidate Page
When Click Add Language  in Candidate Page
When Click NextIcon in Candidate Page

#Other Details

Then Verify the other details in Candidate Page
When Select employment type in other details Candidate Page
When Select Notice Period in other details Candidate Page
Given Enter Days "45" in Candidate Page
When Select Salary basis in other details Candidate Page
Given Enter Current salary "30000" in Candidate Page
Given Enter Expected salary "40000" in Candidate Page
When Select currency in other details Candidate Page
When Select visa in other details Candidate Page
When Select Start Date in Other Details Candidate Page
When Select End Date in Other Details Candidate Page
When Select Relocation in Other Details Candidate Page
When Select Resume source in Other Details Candidate Page
Given Click next icon in other details Candidate Page
Then Verify the validation message in the Candidate Page

#Candidate Consent

When Click Candidate consent menu  in the Candidate Page
When Click Create contact in the Candidate Page
Then Verify Create contact in the Candidate Page
Given Enter Firstname "Gokul" in Create contact Page
Given Enter Lastname "Raj" in Create contact Page
Given Enter Emailid "meenaselvaraj347@gmail.com" in Create contact Page
Given Enter Mobile number "7876677665" in Create contact Page
Given Enter source "naukri" in Create contact Page
Given Enter Position "Software Test Engineer" in Create contact Page
When Click choose file in Create Contact Page
When Click Save button in Create Contact Page
When Click Cancel button in Create Contact Page
Then Verify validation message in Create Contact Page

