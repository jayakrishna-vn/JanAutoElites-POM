package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC02_EditLead extends OpentapsWrappers{

	@BeforeClass
	public void startTestCase(){
	
	browserName 	= "chrome";
	dataSheetName 	= "TC02_EditLead";
	testCaseName 	= "TC02_EditLead (POM)";
	testDescription = "This Test case will edit and existing lead and changes the required values- using POM framework";
	
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String username,String password,String LeadId,String nFnm){
				
		new LoginPage().loginToOpenTaps(username, password)
		.clickcrmsfa().clickLeadsTab().clickFindLead().enterLeadId(LeadId).clickFindLeadbutton().clickSearchResult()
		.clickEditLeadButton().updateLeadDetails(nFnm).clickUpdateLeadButton().verifyFnm(nFnm);
		
			
	}
	
	
	
	
}
