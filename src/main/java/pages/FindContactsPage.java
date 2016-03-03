package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindContactsPage extends OpentapsWrappers{
	
	
	public FindContactsPage() {

		if(!verifyTitle("Find Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT Find Contacts page", "FAIL");
		}

	}
	

	public FindContactsPage enterContactId(String contactId){
		
		
		enterByXpath(prop.getProperty("FindConacts.entercontactId.xpath"), contactId);
		
		return this;
	}
	
	
	public FindContactsPage clickFindConactButton(){
		
		clickByXpath(prop.getProperty("FindContacts.clickFindContactButton.xpath"));
		
		return this;
		
	}
	
	public ViewContactsPage clickReqContactListResult(){
		
		clickByXpath(prop.getProperty("FindContacts.clickReqcontactlist.xpath"));
		
		return new ViewContactsPage();
		
		
	}
	

}
