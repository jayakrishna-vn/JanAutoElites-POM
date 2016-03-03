package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC06_SearchContact extends OpentapsWrappers{
	
	
	
	@BeforeClass
	public void startTestCase(){
		
		browserName 	= "chrome";
		dataSheetName 	= "TC05_SearchContact";
		testCaseName 	= "TC05_SearchContact (POM)";
		testDescription = "Search an existing Contact using POM framework";
	}
	
		
	@Test(dataProvider="fetchData")
	public void searchContact(String username,String password,String contactId,String fullname,String fname,String lname){
		
		
		new LoginPage().loginToOpenTaps(username, password)
		.clickcrmsfa().clickContactsTab().clickFindContactOption().enterContactId(contactId).clickFindConactButton()
		.clickReqContactListResult().verifyContactName(fullname).verifycontactFnm(fname).verifycontactLnm(lname);
	}
	
	
	

}
