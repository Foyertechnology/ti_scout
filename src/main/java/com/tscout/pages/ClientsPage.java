package com.tscout.pages;

import com.tscout.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClientsPage extends ProjectSpecificMethods {

	@When("Click the Client Menu in the Dashboard")
	public ClientsPage click_ClientsMenu() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Dashboard.Clients.Xpath")));
		return this;
	}

	@Then("Verify the Clients List in the Client page")
	public ClientsPage verify_ClientsList() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("ClientList.Xpath")));
		return this;

	}
	@When("Click Search button in the Client list")
	public ClientsPage click_Search_CreateClient() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Client.click.search.Xpath")));
		return this;
	}
	@When("Click filter icon in the Client list")
	public ClientsPage click_Filtericon_Client() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Client.click.filtericon.Xpath")));
		return this;
	}
	@When("click clientname in search field")
	public ClientsPage click_clientname_filter() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Client.click.clientname.filter.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("Client.select.clientname.filter.Xpath")));
		return this;
	}
	
	@Given("Enter data in search client field {string}")
	public ClientsPage enter_Searchvalue_Client(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("Client.enter.search.Xpath")), data);
		return this;
	}
	@When("Click the Add Client Button in the Clients List")
	public ClientsPage click_AddClient() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Clients.AddClient.Xpath")));
		return this;
	}

	/*
	 * @Then("Verify the Pop up in Client Page") public ClientsPage
	 * verify_ClientPopup() throws InterruptedException { Thread.sleep(4000);
	 * verifyDisplayed(locateElement("XPath",
	 * prop.getProperty("client.verify.popup.Xpath"))); return this;
	 * 
	 * }
	 */
	@Given("Enter New Client Name in the  Client Pop up Page {string}")
	public ClientsPage enter_clientname_Popup(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.Popup.Name.Xpath")), data);
		return this;
	}
	@Given("Enter New Client domain in the  Client Pop up Page {string}")
	public ClientsPage enter_clientdomain_Popup(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.Popup.domain.Xpath")), data);
		return this;
	}
	@When("Click next button in the client pop up page")
	public ClientsPage click_nextbutton_ClientPopup() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("CreateClient.Popup.nextbutton.Xpath")));
		return this;
	}
	@Then("Verify the Create Client Page in the Clients")
	public ClientsPage verify_CreateClient() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("AddClient.CreateClient.Xpath")));
		return this;

	}

	/*
	 * @Given("Enter New Client Name in the Create Client Page {string}") public
	 * ClientsPage Enter_ClientName(String data) {
	 * clearAndType(locateElement("XPath",
	 * prop.getProperty("CreateClient.Name.Xpath")), data); return this; }
	 */

	/*
	 * @Given("Enter New Client Website in the Create Client Page {string}") public
	 * ClientsPage Enter_ClientWebsite(String data) {
	 * clearAndType(locateElement("XPath",
	 * prop.getProperty("CreateClient.Website.Xpath")), data); return this; }
	 */
	@Then("Verify the Client name in the Create Client")
	public ClientsPage verify_ClientName_Client()  {
		verifyDisplayed(locateElement("XPath", prop.getProperty("AddClient.verify.clientname.CreateClient.Xpath")));
		return this;

	}
	@Then("Verify the  Client website in the Create Clients")
	public ClientsPage verify_ClientWebsite_Client()  {
		verifyDisplayed(locateElement("XPath", prop.getProperty("AddClient.verify.clientwebsite.CreateClient.Xpath")));
		return this;

	}
	@Given("Enter New Client EmailId in the Create Client Page {string}")
	public ClientsPage Enter_ClientEmailId(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.Email.Xpath")), data);
		return this;
	}

	@When("Click the Account Owners in the Create Client Page")
	public ClientsPage Click_AccountOwner() {
		click(locateElement("XPath", prop.getProperty("CreateClient.ClickAccountOwner.Xpath")));
		return this;
	}

	@When("Select the Account Owners in the Create Client Page")
	public ClientsPage Select_AccountOwner() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectAccountOwner.Xpath")));
		Thread.sleep(4000);
		return this;
		
	}
	@When("Click the BlankPage in the Create Client Page")
	public ClientsPage Click_BlankPage() {
		click(locateElement("XPath", prop.getProperty("CreateClient.ClickBlankPage.Xpath")));
		return this;
	}
	
	@Given("Enter the client Address in the Create Client Page {string}")
	public ClientsPage Enter_ClientAddress(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.ClientAddress.Xpath")), data);
		return this;
	}

	@When("Select the Status of client in the Create Client Page")
	public ClientsPage Client_Status() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.ClientStatus.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectClient.Xpath")));
		return this;
	}

	@When("Select the Country of client in the Create Client Page")
	public ClientsPage Client_Country() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.ClientCountry.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectClient.Xpath")));
		return this;
	}

	@When("Select the State of client in the Create Client Page")
	public ClientsPage Client_State() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.ClientState.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectClient.Xpath")));
		return this;
	}

	@When("Select the City of client in the Create Client Page")
	public ClientsPage Client_city() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.ClientCity.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectClient.Xpath")));
		return this;
	}

	@Given("Enter the Postal Code of Client in the Create Client Page {string}")
	public ClientsPage Enter_ClientPostal(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.ClientPostal.Xpath")), data);
		return this;
	}

	@When("Select the Country Code of client in the Create Client Page")
	public ClientsPage Client_Code() {
		click(locateElement("XPath", prop.getProperty("CreateClient.ClientCode.Xpath")));
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectClient.Xpath")));
		return this;
	}

	@Given("Enter the Phone Number of Client in the Create Client Page {string}")
	public ClientsPage Enter_ClientPhone(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.ClientPhone.Xpath")), data);
		return this;
	}

	@When("Click the Close Icon in the Create Client Page")
	public ClientsPage ClickClient_CloseIcon() {
		click(locateElement("XPath", prop.getProperty("CreateClient.Client.CloseIcon.Xpath")));
		return this;
	}

	@When("Click the Close Icon in the Popup")
	public ClientsPage ClickClient_popupCloseIcon() {
		click(locateElement("XPath", prop.getProperty("CreateClient.PopupCloseIcon.Xpath")));
		return this;
	}

	@Then("Verify the Displayed Popup")
	public ClientsPage verify_Popup() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("CreateClient.verifyPopup.Xpath")));
		return this;
	}

	@When("Click Yes Button in  Are you sure popup")
	public ClientsPage ClickClient_YesBtn() {
		click(locateElement("XPath", prop.getProperty("CreateClient.Popup.YesBtn.Xpath")));
		return this;
	}

	@When("Click No Button in  Are you sure popup")
	public ClientsPage ClickClient_NoBtn() {
		click(locateElement("XPath", prop.getProperty("CreateClient.Popup.NoBtn.Xpath")));
		return this;
	}

	@When("Click the Save & Next Button in the Create Client Page")
	public ClientsPage click_Save_Nextbutton() {
		click(locateElement("XPath", prop.getProperty("CreateClient.saveandnext.Xpath")));
		return this;
	}

	@Then("Get the validation Message in the Create Client Page")
	public ClientsPage verify_ValidationMsg() throws InterruptedException {
		Thread.sleep(4000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("CreateClient.Validation.Xpath")));
		return this;

	}

// Info Page in Create Client	
	@Then("Verify the Info Section in the create Client Page")
	public ClientsPage verifyClient_InfoPage() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("CreateClient.verifyInfoPage.Xpath")));
		return this;

	}

	@When("Click the client Tags in the Create Client Page")
	public ClientsPage Click_ClientTags() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("CreateClient.ClickTag.Xpath")));
		return this;
	}

	@When("Select the client Tags from List in the Create Client Page")
	public ClientsPage Select_ClientTags() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectClient.Xpath")));
		return this;
	}

	@When("Click the client Industries in the Create Client Page")
	public ClientsPage Click_ClientIndustries() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("CreateClient.ClickIndustries.Xpath")));
		return this;
	}

	@When("Select the client Industries from List in the Create Client Page")
	public ClientsPage Select_ClientIndustries() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectIndustries.Xpath")));
		return this;
	}

	@Given("Enter the Client Company Turn Over in the Create Client Page {string}")
	public ClientsPage EnterClient_CompanyTurnOver(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.TurnOver.Xpath")), data);
		return this;
	}

	@When("Click the client Currency in the Create Client Page")
	public ClientsPage Click_ClientCurrency() {
		click(locateElement("XPath", prop.getProperty("CreateClient.ClickCurrency.Xpath")));
		return this;
	}

	@When("Select the client Currency from List in the Create Client Page")
	public ClientsPage Select_ClientCurrency() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("CreateClient.SelectCurrency.Xpath")));
		return this;
	}

	@Given("Enter the Client Employees Count in the Create Client Page {string}")
	public ClientsPage EnterClient_EmpCount(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.Empcount.Xpath")), data);
		return this;
	}

	@Given("Enter the Client Description in the Create Client Page {string}")
	public ClientsPage EnterClient_Description(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.Description.Xpath")), data);
		return this;
	}

	@Then("Get the  Characters Remaining Count in the Description")
	public ClientsPage verifyDesc_Charcount() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("CreateClient.Charcount.Xpath")));
		return this;

	}

	@When("Click the Close Icon in the Info Client Page")
	public ClientsPage ClickClient_InfoCloseIcon() {
		click(locateElement("XPath", prop.getProperty("CreateClient.info.CloseIcon.Xpath")));
		return this;
	}

	// Contacts Page in Create Client
	
	@When("Click the Contact in  Client Page")
	public ClientsPage ClickClient_ContactPage() {
		click(locateElement("XPath", prop.getProperty("CreateClient.clickContactPage.Xpath")));
		return this;
	}
	@Then("Verify the Contact Section in the create Client Page")
	public ClientsPage verifyClient_ContactsPage() throws InterruptedException {
		Thread.sleep(3000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("CreateClient.verifyContactsPage.Xpath")));
		return this;

	}
	 
	 
	
	@When("Select the Salutation of client in the Create Client Page")
	public ClientsPage SelectClient_ContactsSalutation() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.click.Salutation.Xpath")));
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("CreateClient.Select.Salutation.Xpath")));
		return this;
	}

	@Given("Enter the Contacts First Name in the Create Client Page {string}")
	public ClientsPage EnterClient_ContactsFirstName(String data) throws InterruptedException {
		Thread.sleep(3000);
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.FirstName.Xpath")), data);
		return this;
	}

	@Given("Enter the Contacts Last Name in the Create Client Page {string}")
	public ClientsPage EnterClient_ContactsLastName(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.LastName.Xpath")), data);
		return this;
	}

	

	@Given("Enter the Contacts Email in the Create Client Page {string}")
	public ClientsPage EnterClient_ContactsEmail(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.email.Xpath")), data);
		return this;
	}

	@Given("Enter the Contacts Phone in the Create Client Page {string}")
	public ClientsPage EnterClient_ContactsPhone(String data) {
		clearAndType(locateElement("XPath", prop.getProperty("CreateClient.phone.Xpath")), data);
		return this;
	}

	@When("Click save contact button in the Create Client Page")
	public ClientsPage ClickClient_savecontact() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("CreateClient.click.savecontact.Xpath")));
		return this;
	}

	@When("Click the Close Icon in the Contacts Client Page")
	public ClientsPage ClickClient_ContactsCloseIcon() {
		click(locateElement("XPath", prop.getProperty("CreateClient.info.CloseIcon.Xpath")));
		return this;
	}
	@Then("Verify the Recently Created Client in the Client List")
	public ClientsPage verifyClient_CreatedClients() throws InterruptedException {
		Thread.sleep(3000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("CreateClient.Verify.CreatedClient.Xpath")));
		return this;

		
	}

	public ClientsPage clickClient_ContactsPage() {
		// TODO Auto-generated method stub
		return null;
	}
	@When("Click  client draft button in Client list")
	public ClientsPage click_client_Draft() throws InterruptedException {
		Thread.sleep(2000);
		click(locateElement("XPath", prop.getProperty("Client.click.draftbutton.Xpath")));
		return this;
	}
	@Then("Verify draft list page")
	public ClientsPage verify_Draft_List_Client() throws InterruptedException {
		Thread.sleep(3000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("Client.verify.draftlist.Xpath")));
		return this;

	}
	//Edit Client
	/*
	 * @When("Click Edit client in Client list") public ClientsPage
	 * Click_EditClient() throws InterruptedException { Thread.sleep(2000);
	 * click(locateElement("XPath",
	 * prop.getProperty("EditClient.click.Edit.Xpath"))); return this; }
	 */
	@When("Click Edit Icon in Client list")
	public ClientsPage Click_EditIcon() throws InterruptedException {
		Thread.sleep(1000);
		click(locateElement("XPath", prop.getProperty("EditClient.click.EditIcon.Xpath")));
		return this;
	}
	
	
	
@Then("Verify the Edit Client Page")
	public ClientsPage verifyClient_EditClients() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.EditClient.Xpath")));
		return this;

	}
	
	@Then("Verify the Client name in  Edit Client Page")
	public ClientsPage verifyClientname_EditClient() throws InterruptedException {
	verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Clientname.Xpath")));
		return this;

	}
	
	@Then("Verify the Client Website in  Edit Client Page")
	public ClientsPage verify_ClientWebsite_EditClient() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Clientwebsite.Xpath")));
		return this;

	}
	@Then("Verify the Client Emailid in  Edit Client Page")
	public ClientsPage verify_ClientEmailid_EditClient() throws InterruptedException {
		Thread.sleep(1000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.ClientEmailid.Xpath")));
		return this;

	}
	@Then("Verify the Client Address in  Edit Client Page")
	public ClientsPage verify_ClientAddress_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.ClientAddress.Xpath")));
		return this;

	}
	
	
	@Then("Verify the Client Status in  Edit Client Page")
	public ClientsPage verify_clientStatus_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.ClientStatus.Xpath")));
		return this;

	}
	
	@Then("Verify the Country in  Edit Client Page")
	public ClientsPage verify_Country_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Country.Xpath")));
		return this;

	}
	@Then("Verify the State in  Edit Client Page")
	public ClientsPage verify_state_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.State.Xpath")));
		return this;

	}@Then("Verify the City in  Edit Client Page")
	public ClientsPage verify_City_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.City.Xpath")));
		return this;

	}@Then("Verify the Client Postal code in  Edit Client Page")
	public ClientsPage verify_clientPostal_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Postalcode.Xpath")));
		return this;

	}
	@Then("Verify the Country code in  Edit Client Page")
	public ClientsPage verify_CountryCode_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Countrycode.Xpath")));
		return this;

	}
	@Then("Verify the Client Phone number in  Edit Client Page")
	public ClientsPage verify_ClientPhone_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Phonenumber.Xpath")));
		return this;

	}
	@When("Click Edit and next button in Client Page")
	public ClientsPage click_Edit_Nextbutton() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("EditClient.click.Editnextbutton.Xpath")));
		return this;
	}

	@Then("Verify the Client Industries in  Edit Client Page")
	public ClientsPage verify_ClientIndustries() throws InterruptedException {
		Thread.sleep(3000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Industries.Xpath")));
		return this;

	}
	@Then("Verify the Client Tags in  Edit Client Page")
	public ClientsPage verify_ClientTags() throws InterruptedException {
		Thread.sleep(2000);
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Tags.Xpath")));
		return this;

	}
	@Then("Verify the Client Turnover in  Edit Client Page")
	public ClientsPage verify_Turnover_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.turnover.Xpath")));
		return this;

	}
	@Then("Verify the Client Currency in  Edit Client Page")
	public ClientsPage verify_ClientCurrency() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.currency.Xpath")));
		return this;

	}
	@Then("Verify the Employee count in  Edit Client Page")
	public ClientsPage verify_Empcount_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.EmployeeCount.Xpath")));
		return this;

	}
	@Then("Verify the description in  Edit Client Page")
	public ClientsPage verify_Description_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Description.Xpath")));
		return this;

	}
	@When("Click Edit Icon in Edit Contact Page")
	public ClientsPage click_Contacticon_EditClient() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("EditClient.click.Contactediticon.Xpath")));
		return this;
	}
	@Then("Verify Contact salutation in  Edit Client Page")
	public ClientsPage verifycontactSalutation_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Salutation.Xpath")));
		return this;

	}
	@Then("Verify Contact Firstname in  Edit Client Page")
	public ClientsPage verifyContactFirstname_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Firstname.Xpath")));
		return this;

	}
	@Then("Verify Contact Lastname in  Edit Client Page")
	public ClientsPage verifyContactLastname_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Lastname.Xpath")));
		return this;

	}
	@Then("Verify Contact Designation in  Edit Client Page")
	public ClientsPage verifyContact_Designation_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Designation.Xpath")));
		return this;

	}
	@Then("Verify Contact Email in  Edit Client Page")
	public ClientsPage verifycontact_Email_EditClient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Email.Xpath")));
		return this;

	}
	@Then("Verify Contact Phone in  Edit Client Page")
	public ClientsPage verifyContact_Phone_editclient() throws InterruptedException {
		verifyDisplayed(locateElement("XPath", prop.getProperty("EditClient.Verify.Phone.Xpath")));
		return this;

	}
	@When("Click Save button in Edit Contact Page")
	public ClientsPage click_save_EditContact() throws InterruptedException {
		click(locateElement("XPath", prop.getProperty("EditClient.click.Savebutton.Xpath")));
		return this;
	}

	
	
}
