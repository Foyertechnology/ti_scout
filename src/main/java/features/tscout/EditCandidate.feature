Feature: Candidate Module in the ti-scout Application

Background: Login steps for the Candidate module in tiscout Application


Given Enter the username as "kotla@javaji.de"
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Clients
When Click the  Candidate Menu in the Dashboard

#EditCandidate
Scenario: Verify Edit Candidate Functionality in the ti-scout User Application
Then Verify the Candidate List in the Candidate Page
When click three dots icon in Edit Candidate Page
When click Edit icon in Edit Candidate Page
Then Verify Edit Candidate Page
Then Verify Salutation field in Edit Candidate Page
When Select Salutation in Candidate Page
Then Verify First name  field in Edit Candidate Page
Given Enter Firstname "Zura" in Create Candidate
Then Verify Last name  field in Edit Candidate Page
Given Enter Last name "Henry" in Create Candidate
Then Verify Email id field in Edit Candidate Page
Given Enter EmailId "hqqgsgs@gmail.com" in Create Candidate 
Then Verify Mobile number field in Edit Candidate Page
Given Enter Mobilenumber "7762723623" in Create Candidate
Then Verify date of birth in Edit Candidate Page
When  Select date of birth in Candidate Page
Then Verify place in Edit Candidate Page
Given Enter Place "Chennai" in Create Candidate
Then Verify nationality field in Edit Candidate Page
When  Select nationality in Candidate Page 
Then Verify Address field in Edit Candidate Page
Given Enter Address "JJNAGAR" in Create Candidate
Then Verify City field in Edit Candidate Page
Given Enter City "Chennai" in Create Candidate
Then Verify Country field in Edit Candidate Page
Given Enter Country "India" in Create Candidate
Then Verify Zipcode field in Edit Candidate Page
Given Enter Zipcode "603110" in Create Candidate
Then Verify tags field in Edit Candidate Page
When  Select tags in Candidate Page 
Then Verify experience field in Edit Candidate Page
Given Enter experience "1" in Create Candidate
Then Verify notes field in Edit Candidate Page
Given Enter notes "QA Automation Engineer" in Create Candidate
When Click Edit and next button in Candidate Page 


#Education

Then Verify the Education details in Candidate Page
Then Verify Institution field in Edit Candidate Page
Given Enter Institution "MGR" in  Candidate Page
Then Verify Location field in Edit Candidate Page
Given Enter Candidate location "Chennai" in  Candidate Page
Then Verify Graduation field in Edit Candidate Page
Given Enter Candidate Graduation "2018" in  Candidate Page
Then Verify Start date field in Edit Candidate Page
When Select StartDate in Candidate Education Page
Then Verify End date field in Edit Candidate Page
When Select EndDate in Candidate Education Page
When click Add more in  Candidate Education Page

#Certification

Then Verify the Certification details in Candidate Page
Then Verify Certification name field in Edit Candidate Page
Given Enter Certification Name "Testing" in  Candidate Page
Then Verify Institution name field in Edit Candidate Page
Given Enter Institute Name "Tutors" in  Candidate Page
Then Verify Certification Location field in Edit Candidate Page
Given Enter Certification Location "Chennai" in  Candidate Page
Then Verify Certification start date field in Edit Candidate Page
When Select StartDate in Candidate Certification Page
Then Verify Certification End date field in Edit Candidate Page
When Select EndDate in Candidate Certification Page
When click Add more in  Candidate Certification Page
When Click proceed button in  Edit Candidate Page

#Experience

Then Verify the Experience details in Candidate Page
Then Verify Employer name field in Edit Candidate Page
Given Enter Candidate Employer name "HCL" in  Candidate Page
Then Verify Candidate Location field in Edit Candidate Page
Given Enter Candidate location "Chennai" in  Candidate Page
Then Verify Candidate Jobtitle field in Edit Candidate Page
Given Enter Candidate Jobtitle "Developer" in  Candidate Page
Then Verify Experience start date in Edit Candidate Page
When Select StartDate in Candidate Experience Page
Then Verify Experience End date in Edit Candidate Page
When Select EndDate in Candidate Experience Page
Then Verify Responsibilities in Edit Candidate Page
Given Enter Responsibilities_Candidate "Tester" in  Candidate Page
When Click proceed button in  Edit Candidate Page

#Skills

Then Verify Skills Details in Candidate Page
Then Verify Skills in Edit Candidate Page
When Select Skills in Candidate Page
Then Verify Proficiency in Edit Candidate Page
When Select Proficiency in Candidate Page
When Click Add Skills in Skills details Page
When Click proceed button in  Edit Candidate Page
#Language

Then Verify the Language Details in Candidate Page
Then Verify Language in Edit Candidate Page
When Select Language in Candidate Page
Then Verify Language Proficency in Edit Candidate Page
When Select Proficiency in Candidate Page
When Click Add Language  in Candidate Page
When Click proceed button in  Edit Candidate Page

#Other Details

Then Verify the other details in Candidate Page
Then Verify Employee type in Edit Candidate Page
When Select employment type in other details Candidate Page
Then Verify Notice Period in Edit Candidate Page
When Select Notice Period in other details Candidate Page
Then Verify Other Details days in Edit Candidate Page
Given Enter Days "45" in Candidate Page
Then Verify Salary basis in Edit Candidate Page
When Select Salary basis in other details Candidate Page
Then Verify Current Salary in Edit Candidate Page
Given Enter Current salary "30000" in Candidate Page
Then Verify Expected Salary in Edit Candidate Page
Given Enter Expected salary "40000" in Candidate Page
Then Verify Currency in Edit Candidate Page
When Select currency in other details Candidate Page
Then Verify Visa in Edit Candidate Page
When Select visa in other details Candidate Page
Then Verify other start date in Edit Candidate Page
When Select Start Date in Other Details Candidate Page
Then Verify other End date in Edit Candidate Page
When Select End Date in Other Details Candidate Page
Then Verify Relocation in Edit Candidate Page
When Select Relocation in Other Details Candidate Page
Then Verify Resume source in Edit Candidate Page
When Select Resume source in Other Details Candidate Page
Given Click proceed button in  Edit Candidate Page
Then Verify the validation message in the Candidate Page

#EditContact

When Click Candidate consent menu  in the Candidate Page
Then Verify Candidate consent in Candidate consent list
Then Verify Edit contact in Edit Candidate Page
Then Verify Edit Page in  Candidate Consent Page
Then Verify Firstname in Edit Candidate Page
Given Enter Firstname "Raj" in Create contact Page
Then Verify Lastname in Edit Candidate Page
Given Enter Lastname "Kumar" in Create contact Page
Then Verify Emailid in Edit Candidate Page
Given Enter Emailid "abhwhd@gmail.com" in Create contact Page
Then Verify Mobile number field in Edit Candidate Page
Given Enter Mobile number "9897223321" in Create contact Page
Then Verify Source in Edit Candidate Page
Given Enter source "Linkedin" in Create contact Page
Then Verify Position in Edit Candidate Page
Given Enter Position "Devops" in Create contact Page
When Click choose file in Create Contact Page
When click edit save button in Edit Candidate Consent Page


