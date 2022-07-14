Feature: login functionality of ti-scout User Application

Scenario: Login_Using positive data
Given Enter the username as 'consdemo@gmail.com'
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed


Scenario: Login_Using negative username data
Given Enter the username as 'consdemo1@gmail.com'
And Enter the Password as 'test123'
When Click on the Login


Scenario: Login_Using negative password data
Given Enter the username as 'consdemo@gmail.com'
And Enter the Password as '****'
When Click on the Login