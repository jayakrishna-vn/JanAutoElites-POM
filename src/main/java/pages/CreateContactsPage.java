package pages;

import wrappers.OpentapsWrappers;

public class CreateContactsPage extends OpentapsWrappers{

	public CreateContactsPage enterFname(){
		
		enterByXpath(prop.getProperty("CreateContacts.enterfname.xpath"), "JK");
		
		return this;
		
	}
	
		
	public CreateContactsPage enterLname(){
			
			enterByXpath(prop.getProperty("CreateContacts.enterlname.xpath"), "VN");
			
			return this;		
		
		
	}
	
	public ViewContactsPage clickCreateContactB(){
		
		clickByXpath(prop.getProperty("CreateContacts.clickcreatecontactbutton.xpath"));
		
		return new ViewContactsPage();		
	
	
}
	
	
	
}
