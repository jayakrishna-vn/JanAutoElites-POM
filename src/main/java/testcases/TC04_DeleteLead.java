package testcases;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ViewLeadsPage;
import wrappers.OpentapsWrappers;

public class TC04_DeleteLead extends OpentapsWrappers{

	
	@BeforeClass
	public void startTestCase(){
		
		browserName 	= "chrome";
		dataSheetName 	= "TC03_DeleteLead";
		testCaseName 	= "TC03_DeleteLead (POM)";
		testDescription = "Delete an existing Lead using POM framework";
	}

	
	@Test(dataProvider="fetchData")
	public void deleteLeadId(String username,String password,String LeadIDtoDel){
		
		
		new LoginPage().loginToOpenTaps(username, password).clickcrmsfa().clickLeadsTab().clickFindLead().enterLeadId(LeadIDtoDel)
		.clickFindLeadbutton().clickSearchResult().clickDeleteLeadButton().clickFindLead().enterLeadId(LeadIDtoDel)
		.clickFindLeadbutton().verifyresulttext();
		
		
	
		
	}
	
	
}
