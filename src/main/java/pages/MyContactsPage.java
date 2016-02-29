package pages;

import wrappers.OpentapsWrappers;

public class MyContactsPage extends OpentapsWrappers{
	
	public CreateContactsPage clickCreationContactOption(){
		
		
		clickByLink(prop.getProperty("MyContacts.createcontactoption.link"));
		
		return new CreateContactsPage();
		
		
	}
	

}
