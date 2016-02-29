package pages;

import wrappers.OpentapsWrappers;

public class ViewContactsPage extends OpentapsWrappers{
	
	
	public ViewContactsPage verifyContactName(){
		
		verifyTextById(prop.getProperty("ViewContacts.verifycontactname.id"), "JK VN");
		
		return this;
		
	}
	
	public ViewContactsPage verifycontactFnm(){
		
	verifyTextById(prop.getProperty("ViewContacts.verifycontactfname.id"), "JK");
		
		return this;
	}
	
	public ViewContactsPage verifycontactLnm(){
		
	verifyTextById(prop.getProperty("ViewContacts.verifycontactlname.id"), "VN");
		
		return this;
	}
	
	
}
