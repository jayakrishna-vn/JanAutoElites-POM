package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	public MyLeadsPage() {

		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT My Leads page", "FAIL");
		}

	}
	
	
	// click on Find Lead in My Leads page
	
	public FindLeadsPage clickFindLead(){
		
		clickByLink(prop.getProperty("Myleads.findlead.link"));
		
		return new FindLeadsPage();

	}
	
}
