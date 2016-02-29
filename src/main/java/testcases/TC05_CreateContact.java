package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.OpentapsWrappers;

public class TC05_CreateContact extends OpentapsWrappers{
	
	@Test
	public void createContact(){
		
		new HomePage().clickcrmsfa().clickContactsTab().clickCreationContactOption().enterFname().enterLname().clickCreateContactB()
		.verifyContactName().verifycontactFnm().verifycontactLnm();
		
	}
	
	

}
