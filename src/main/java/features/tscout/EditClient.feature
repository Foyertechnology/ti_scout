Feature: Clients Module in the ti-scout Application

Background: Login steps for the Client Module in tiscout Application

Given Enter the username as 'consdemo@gmail.com'
And Enter the Password as 'test123'
When Click on the Login
Then tiscout Dashboard page should be displayed for Clients
When Click the Client Menu in the Dashboard

#EditClient
Scenario: Verify Edit Client Functionality in the ti-scout User Application
Then Verify the Clients List in the Client page
When Click Edit client in Client list
When Click Edit Icon in Client list
Then Verify the Edit Client Page
Then Verify the Client name in  Edit Client Page
Given Enter New Client Name in the Create Client Page 'Ocean'
Then Verify the Client Website in  Edit Client Page
Given Enter New Client Website in the Create Client Page 'www.ocean.com'
Then Verify the Client Emailid in  Edit Client Page
Given Enter New Client EmailId in the Create Client Page 'v6h2cvskvt@th323ejoker5.com'
When Click the Account Owners in the Create Client Page
When Select the Account Owners in the Create Client Page
When Click the BlankPage in the Create Client Page
Then Verify the Client Address in  Edit Client Page
Given Enter the client Address in the Create Client Page 'San Francisco, California, United States'
Then Verify the Client Status in  Edit Client Page
When Select the Status of client in the Create Client Page
Then Verify the Country in  Edit Client Page
When Select the Country of client in the Create Client Page
Then Verify the State in  Edit Client Page
When Select the State of client in the Create Client Page
Then Verify the City in  Edit Client Page
When Select the City of client in the Create Client Page
Then Verify the Client Postal code in  Edit Client Page
Given Enter the Postal Code of Client in the Create Client Page '67890'
Then Verify the Country code in  Edit Client Page 
When Select the Country Code of client in the Create Client Page
Then Verify the Client Phone number in  Edit Client Page
Given Enter the Phone Number of Client in the Create Client Page '9091313229'
#When Click the Close Icon in the Create Client Page
#Then Verify the Displayed Popup
#When Click the Close Icon in the Popup
#When Click Yes Button in  Are you sure popup
#When Click No Button in  Are you sure popup
#Then Verify the Create Client Page in the Clients
When Click Edit and next button in Client Page
Then Get the validation Message in the Create Client Page


#EditClient_Info

Then Verify the Info Section in the create Client Page
Then Verify the Client Industries in  Edit Client Page
When Click the client Industries in the Create Client Page
When Select the client Industries from List in the Create Client Page
Then Verify the Client Tags in  Edit Client Page
When Click the client Tags in the Create Client Page
When Select the client Tags from List in the Create Client Page
Then Verify the Client Turnover in  Edit Client Page
Given Enter the Client Company Turn Over in the Create Client Page '64967677'
Then Verify the Client Currency in  Edit Client Page
When Click the client Currency in the Create Client Page
When Select the client Currency from List in the Create Client Page
Then Verify the Employee count in  Edit Client Page
Given Enter the Client Employees Count in the Create Client Page '121'
Then Get the  Characters Remaining Count in the Description
Then Verify the description in  Edit Client Page
Given Enter the Client Description in the Create Client Page 'Victoria Memorial is a large marble building in Central Kolkata'
Then Get the  Characters Remaining Count in the Description
#When Click the Close Icon in the Info Client Page
#Then Verify the Displayed Popup
#When Click the Close Icon in the Popup
#When Click Yes Button in  Are you sure popup
#When Click No Button in  Are you sure popup
#Then Verify the Info Section in the create Client Page
When Click Edit and next button in Client Page

#EditClient_Contacts

When Click Edit Icon in Edit Contact Page
Then Verify the Contact Section in the create Client Page
Then Verify Contact salutation in  Edit Client Page
When Select the Contacts Salutation in the Create Client Page
Then Verify Contact Firstname in  Edit Client Page
Given Enter the Contacts First Name in the Create Client Page 'Gokulraj'
Then Verify Contact Lastname in  Edit Client Page
Given Enter the Contacts Last Name in the Create Client Page 'Sugumar'
Then Verify Contact Email in  Edit Client Page
Given Enter the Contacts Email in the Create Client Page '63vqfoC53t@kobrandly.com'
Then Verify Contact Designation in  Edit Client Page
Given Enter the Contacts Designation in the Create Client Page 'Software Test Engineer'
Then Verify Contact Phone in  Edit Client Page
Given Enter the Contacts Phone in the Create Client Page '04428511493 '
#When Click the Close Icon in the Contacts Client Page
#Then Verify the Displayed Popup
#When Click the Close Icon in the Popup
#When Click Yes Button in  Are you sure popup
#When Click No Button in  Are you sure popup
#Then Verify the Contact Section in the create Client Page
When Click Save button in Edit Contact Page
Then Verify the Clients List in the Client page
Then Verify the Recently Created Client in the Client List

