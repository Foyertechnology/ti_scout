package com.tscout.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tscout.pages.LoginPage;
import com.tscout.testng.api.base.ProjectSpecificMethods;

public class TC006_EditClientsPage extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues_EditClients() {
		testCaseName = "Clients Module";
		testDescription = "Clients Module to Cretae New Clients";
		nodes = "Clients";
		authors = "Testing Team";
		category = "Functional Test";
		dataSheetName = "Clients";
	}

	@Test(dataProvider = "fetchData")
	public void Edit_Clients(String uName, String pwd, String Address
, String PostalCode , String Phone, String TurnOver, String Empcount, String Desc) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyHomepage_Clients()
		.click_ClientsMenu()
		.verify_ClientsList()
		.click_Search_CreateClient()	
		.click_Filtericon_Client() 
			
.click_clientname_filter() 
//.selectlist_filter()
				 
        .Click_EditIcon()
		.verifyClient_EditClients()
		.verifyClientname_EditClient()
		//.Enter_ClientName("Oxymoron")
		.verify_ClientWebsite_EditClient()
		//.Enter_ClientWebsite("www.oxymoron.com")
		.verify_ClientEmailid_EditClient()
		.Enter_ClientEmailId("gowtham@brandly.com")
		.Click_AccountOwner()
		.Select_AccountOwner()
		.Click_BlankPage()
		.verify_ClientAddress_EditClient()
		.Enter_ClientAddress(Address)
		.verify_clientStatus_EditClient()
		.Client_Status()
		.verify_Country_EditClient()
		.Client_Country()
		.verify_state_EditClient()
		.Client_State()
		.verify_City_EditClient()
		.Client_city()
		.verify_clientPostal_EditClient()
		.Enter_ClientPostal(PostalCode)
		.verify_CountryCode_EditClient()
		.Client_Code()
		.verify_ClientPhone_EditClient()
		.Enter_ClientPhone(Phone)
		.ClickClient_CloseIcon()
		.verify_Popup()
		.ClickClient_NoBtn()
		.click_Edit_Nextbutton()
		//verify_ValidationMsg()
		.verifyClient_InfoPage()
		.verify_ClientIndustries()
		//.Select_ClientIndustries()
		.verify_ClientTags()
		//.Select_ClientTags()
		.verify_Turnover_EditClient()
		.EnterClient_CompanyTurnOver(TurnOver)
		.verify_ClientCurrency()
		//.Select_ClientCurrency()
		.verify_Empcount_EditClient()
		.EnterClient_EmpCount(Empcount)
		.verify_Description_EditClient()
		.EnterClient_Description(Desc)
		.ClickClient_InfoCloseIcon()
		.verify_Popup()
		.ClickClient_NoBtn()
		.click_Edit_Nextbutton()
		//verify_ValidationMsg()
		.click_Contacticon_EditClient()
	    .verifyClient_ContactsPage()
	    .verifycontactSalutation_EditClient()
		.SelectClient_ContactsSalutation()
		.verifyContactFirstname_EditClient()
		.EnterClient_ContactsFirstName("Roshan")
		.verifyContactLastname_EditClient()
		 .EnterClient_ContactsLastName("Sugumar")
		 .verifyContact_Designation_EditClient()
		//.EnterClient_ContactsDesignation("Testing Engineer")
		.verifycontact_Email_EditClient()
		.EnterClient_ContactsEmail("pavi34@unigeol.com")
		.verifyContact_Phone_editclient()
		 .EnterClient_ContactsPhone("6973476712")
		 //ClickClient_ContactsAddMore()
		.click_save_EditContact();
				 
		//.verify_ClientsList()
		//.verifyClient_CreatedClients();
		
		
		
		
		
		
	//String ClientName, String ClientWebsite, String ClientEmail ,	
		
		
		
		
		
		
		
		
		
		
		
}

	
}