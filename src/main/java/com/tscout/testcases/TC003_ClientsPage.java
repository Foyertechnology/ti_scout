package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC003_ClientsPage extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues_AddClients() {
		testCaseName = "Clients Module";
		testDescription = "Clients Module to Cretae New Clients";
		nodes = "Clients";
		authors = "Testing Team";
		category = "Functional Test";
		dataSheetName = "Clients";
	}

	@Test(dataProvider = "fetchData")
	public void ADD_Clients(String uName, String pwd, String Address
, String PostalCode , String Phone, String TurnOver, String Empcount, String Desc) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage_Clients()
		.click_ClientsMenu()
		.verify_ClientsList()
		.click_Search_CreateClient()
		.enter_Searchvalue_Client("test")
         .click_AddClient()
         //.verify_ClientPopup()
         .enter_clientname_Popup("Maaruti")
         .enter_clientdomain_Popup("maaruti@brandly.com")
         .click_nextbutton_ClientPopup()
         .verify_CreateClient()
		.verify_ClientName_Client()
		.verify_ClientWebsite_Client()
		.Enter_ClientEmailId("goearva@brandly.com")
		.Click_AccountOwner()
		.Select_AccountOwner()
		.Click_BlankPage()
		.Enter_ClientAddress(Address)
		.Client_Status()
		.Client_Country()
		.Client_State()
		.Client_city()
		.Enter_ClientPostal(PostalCode)
		.Client_Code()
		.Enter_ClientPhone(Phone)
		.ClickClient_CloseIcon()
		.verify_Popup()
		.ClickClient_NoBtn()
		.click_Save_Nextbutton()
		.verify_ValidationMsg()
		.verifyClient_InfoPage()
		.Click_ClientIndustries()
		.Select_ClientIndustries()
		.Click_ClientTags()
		.Select_ClientTags()
		.EnterClient_CompanyTurnOver(TurnOver)
		.Click_ClientCurrency()
		.Select_ClientCurrency()
		.EnterClient_EmpCount(Empcount)
		.EnterClient_Description(Desc)
		.ClickClient_InfoCloseIcon()
		.verify_Popup()
		.ClickClient_NoBtn()
		.click_Save_Nextbutton()
		.verify_ValidationMsg()
		.ClickClient_ContactPage()
		.verifyClient_ContactsPage()
		.SelectClient_ContactsSalutation()
		.EnterClient_ContactsFirstName("Gokulraj")
		 .EnterClient_ContactsLastName("Sugumar")
		 .EnterClient_ContactsEmail("thyu@unigeol.com")
		.EnterClient_ContactsPhone("6978546741") 
		 .ClickClient_savecontact()
		.click_Save_Nextbutton()
		.verify_ClientsList()
		.verifyClient_CreatedClients()
		.click_client_Draft()
		.verify_Draft_List_Client();
			
	//String ClientName, String ClientWebsite, String ClientEmail,	
		
		
				
}
	
}