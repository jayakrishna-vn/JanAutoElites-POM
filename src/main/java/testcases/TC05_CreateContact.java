package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC05_CreateContact extends OpentapsWrappers{
	
	
	@BeforeClass
	public void startTestCase(){
		
		browserName 	= "chrome";
		dataSheetName 	= "TC04_CreateContact";
		testCaseName 	= "TC04_CreateContact (POM)";
		testDescription = "Create a New Contact using POM framework";
	}
	
		
	@Test(dataProvider="fetchData")
	public void createContact(String username,String password,String Fname, String Lname,String fullname){
		
		
		new LoginPage().loginToOpenTaps(username, password)
		.clickcrmsfa().clickContactsTab().clickCreationContactOption().enterFname(Fname).enterLname(Lname).clickCreateContactB()
		.verifyContactName(fullname).verifycontactFnm(Fname).verifycontactLnm(Lname);
		
	}
	
	

}
