package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC08_DeleteContact extends OpentapsWrappers{
	
	
	@BeforeClass
	public void startTestCase(){
		
		browserName 	= "chrome";
		dataSheetName 	= "TC08_DeleteContact";
		testCaseName 	= "TC08_DeleteContact (POM)";
		testDescription = "Deleting an existing Contact using POM framework";
	}
	
    @Test(dataProvider="fetchData")
	public void deleteContact(String username,String password,String contactId){
    	
    	
    	new LoginPage().loginToOpenTaps(username, password).clickcrmsfa().clickContactsTab().clickFindContactOption().enterContactId(contactId)
    	.clickFindConactButton().clickReqContactListResult().clickDeactivateContact().acceptAlert();
    	
    	
    	
    	
    }


}
