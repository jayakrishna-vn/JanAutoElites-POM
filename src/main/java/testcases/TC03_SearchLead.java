package testcases;

import org.eclipse.jetty.util.preventers.LoginConfigurationLeakPreventer;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_SearchLead extends OpentapsWrappers{

	
	
	@Test(dataProvider="")
	public void searchLeadId(){
		new LoginPage().loginToOpenTaps("", "").clickcrmsfa().
		clickLeadsTab().clickFindLead().enterLeadId(10003).clickFindLeadbutton()
		.verifySearchResult("10003");
		
//		new HomePage()
//		.clickcrmsfa().clickLeadsTab().clickFindLead().enterLeadId("10003").clickFindLeadbutton()
//		.verifySearchResult("10003");
		

	}
}
