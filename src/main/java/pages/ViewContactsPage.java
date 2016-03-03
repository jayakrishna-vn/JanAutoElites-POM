package pages;

import wrappers.OpentapsWrappers;

public class ViewContactsPage extends OpentapsWrappers{
	
	
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


	
	
}
