Feature: Clients Module in the ti-scout Application

Background: Login steps for the Client Module in tiscout Application

Given Enter the username as 'kotla@javaji.de'
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Clients
When Click the Client Menu in the Dashboard

#CreateClient
Scenario: Verify Create Client Functionality in the ti-scout User Application
Then Verify the Clients List in the Client page
When Click Search button in the Client list
Given Enter data in search client field 'Test'
When Click the Add Client Button in the Clients List
#Then Verify the Pop up in Client Page
Given Enter New Client Name in the  Client Pop up Page 'yno'
Given Enter New Client domain in the  Client Pop up Page 'ynove@brandly.com'
When Click next button in the client pop up page
Then Verify the Create Client Page in the Clients
Then Verify the Client name in the Create Client
Then Verify the  Client website in the Create Clients
Given Enter New Client EmailId in the Create Client Page 'dcrr8@brandly.com'
When Click the Account Owners in the Create Client Page
When Select the Account Owners in the Create Client Page
#When Select the Account Owners in the Create Client Page
When Select the Status of client in the Create Client Page
Given Enter the client Address in the Create Client Page 'San Francisco, California, United States'
When Select the Country of client in the Create Client Page
When Select the State of client in the Create Client Page
When Select the City of client in the Create Client Page
Given Enter the Postal Code of Client in the Create Client Page '43169'
When Select the Country Code of client in the Create Client Page
Given Enter the Phone Number of Client in the Create Client Page '9091313229'
When Click the Close Icon in the Create Client Page
Then Verify the Displayed Popup
#When Click the Close Icon in the Popup
#When Click Yes Button in  Are you sure popup
When Click No Button in  Are you sure popup
When Click the Save & Next Button in the Create Client Page
Then Get the validation Message in the Create Client Page
#CreateClient_Info
Then Verify the Info Section in the create Client Page
When Click the client Industries in the Create Client Page
When Select the client Industries from List in the Create Client Page
When Click the client Tags in the Create Client Page
When Select the client Tags from List in the Create Client Page
Given Enter the Client Company Turn Over in the Create Client Page '64967677'
When Click the client Currency in the Create Client Page
When Select the client Currency from List in the Create Client Page
Given Enter the Client Employees Count in the Create Client Page '121'
Then Get the  Characters Remaining Count in the Description
Given Enter the Client Description in the Create Client Page 'Victoria Memorial is a large marble building in Central Kolkata'
Then Get the  Characters Remaining Count in the Description
When Click the Close Icon in the Info Client Page
Then Verify the Displayed Popup
#When Click the Close Icon in the Popup
#When Click Yes Button in  Are you sure popup
When Click No Button in  Are you sure popup
#Then Verify the Info Section in the create Client Page
When Click the Save & Next Button in the Create Client Page
Then Get the validation Message in the Create Client Page
#CreateClient_Contacts
When Click the Contact in  Client Page
Then Verify the Contact Section in the create Client Page
When Select the Salutation of client in the Create Client Page
Given Enter the Contacts First Name in the Create Client Page 'Gokulraj'
Given Enter the Contacts Last Name in the Create Client Page 'Sugumar'
Given Enter the Contacts Email in the Create Client Page '63vqfoC53t@kobrandly.com'
Given Enter the Contacts Phone in the Create Client Page '28511493'
When Click save contact button in the Create Client Page
#When Click the Close Icon in the Contacts Client Page
#Then Verify the Displayed Popup
#When Click the Close Icon in the Popup
#When Click Yes Button in  Are you sure popup
#When Click No Button in  Are you sure popup
#Then Verify the Contact Section in the create Client Page
When Click the Save & Next Button in the Create Client Page
Then Verify the Clients List in the Client page
Then Verify the Recently Created Client in the Client List
When Click  client draft button in Client list
Then Verify draft list page in client list

