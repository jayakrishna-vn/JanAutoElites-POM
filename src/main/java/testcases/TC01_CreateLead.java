package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC01_CreateLead extends OpentapsWrappers{
	
	
	@BeforeClass
	public void startTestCase(){
		
		browserName 	= "chrome";
		dataSheetName 	= "TC01_CreateLead";
		testCaseName 	= "TC01_CreateLead (POM)";
		testDescription = "Creates a New Lead using POM framework";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String username,String password,String Cname,String Fname, String Lname){
				
		new LoginPage().loginToOpenTaps(username, password)
		.clickcrmsfa().clickLeadOption().enterCname(Cname).enterFname(Fname).enterLname(Lname)
		.clickLeadB().verifyCompanyName(Cname).verifyFnm(Fname).verifyLnm(Lname);
		
		
		
	}
	

}
