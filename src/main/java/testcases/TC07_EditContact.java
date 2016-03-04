package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC07_EditContact extends OpentapsWrappers{
	
	
	@BeforeClass
	public void startTestCase(){
		
		browserName 	= "chrome";
		dataSheetName 	= "TC07_EditContact";
		testCaseName 	= "TC07_EditContact (POM)";
		testDescription = "Updating an existing Contact using POM framework";
	}
	
    @Test(dataProvider="fetchData")
	public void editContact(String username,String password,String contactId,String fname){
		
		new LoginPage().loginToOpenTaps(username, password).clickcrmsfa().clickContactsTab().clickFindContactOption()
		.enterContactId(contactId).clickFindConactButton().clickReqContactListResult().editContactButton()
		.updateContactDetails(fname).clickUpdateContactButton().verifycontactFnm(fname);
		
		
		
		
		
	}
	
	
}
