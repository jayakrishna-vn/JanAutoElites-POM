package pages;

import wrappers.OpentapsWrappers;

public class CreateContactsPage extends OpentapsWrappers{

	public CreateContactsPage enterFname(String fname){
		
		enterByXpath(prop.getProperty("CreateContacts.enterfname.xpath"), fname);
		
		
		return this;
		
	}
	
		
	public CreateContactsPage enterLname(String lname){
			
			enterByXpath(prop.getProperty("CreateContacts.enterlname.xpath"), lname);
			
			return this;		
		
		
	}
	
	public ViewContactsPage clickCreateContactB(){
		
		clickByXpath(prop.getProperty("CreateContacts.clickcreatecontactbutton.xpath"));
		
		return new ViewContactsPage();		
	
	
}
	
	
	
}
