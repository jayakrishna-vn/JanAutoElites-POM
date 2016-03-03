package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyContactsPage extends OpentapsWrappers{
	
	public MyContactsPage() {

		if(!verifyTitle("My Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT MY Contacts page", "FAIL");
		}

	}
	
	
	
	
	public CreateContactsPage clickCreationContactOption(){
		
		clickByLink(prop.getProperty("MyContacts.createcontactoption.link"));
		
		return new CreateContactsPage();
		
		
	}
	
    public FindContactsPage clickFindContactOption(){
    	
    	
    	clickByLink(prop.getProperty("MyContact.findcontactoption.link"));
    	
    	return new FindContactsPage();
    	
    }
	
	
}
