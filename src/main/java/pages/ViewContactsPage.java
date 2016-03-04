package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewContactsPage extends OpentapsWrappers{
	
	
	public ViewContactsPage() {

		if(!verifyTitle("View Contact | opentaps CRM")){
			Reporter.reportStep("This is NOT View Contacts page", "FAIL");
		}

	}
	
	
	
	public ViewContactsPage verifyContactName(String fullname){
		
		verifyTextById(prop.getProperty("ViewContacts.verifycontactname.id"), fullname);
		
		return this;
		
	}
	
	public ViewContactsPage verifycontactFnm(String fname) {
	
		
	verifyTextById(prop.getProperty("ViewContacts.verifycontactfname.id"), fname);
		
		return this;
		
	}

	public ViewContactsPage verifycontactLnm(String lname){
		
	verifyTextById(prop.getProperty("ViewContacts.verifycontactlname.id"), lname);
		
		return this;
	}


	public OPCRMPage editContactButton(){
		
		clickByLink(prop.getProperty("ViewContacts.editcontact.link"));
		
		return new OPCRMPage();
	}
	
	
}
