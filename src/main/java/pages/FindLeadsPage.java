package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{

	
	public FindLeadsPage() {

		if(!verifyTitle("Find Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT Find Leads page", "FAIL");
		}

	}
	
	
	// Enter Lead Id to search for
	public FindLeadsPage enterLeadId(String leadIDtoDel){
		

		enterByXpath(prop.getProperty("Findleads.enterleadId.xpath"), leadIDtoDel);
		return this;
	}
	
	
	// click on Find Lead Button
		public FindLeadsPage clickFindLeadbutton(){
			
			clickByXpath(prop.getProperty("Findleads.findleadbutton.xpath"));
			
			return this;
		}
		
	
		
		// Verify Search Lead Result
		public FindLeadsPage verifySearchResult(String leadid){
			
			verifyTextByXpath(prop.getProperty("Findleads.findleadresult.xpath"), leadid);
				
			return this;
		}
		
		public ViewLeadsPage clickSearchResult(){
			
			clickByXpath(prop.getProperty("Findleads.clicksearchres.xpath"));
			
			return new ViewLeadsPage();
			
		}
		
		
		// Verify of the lead id get deleted or not
		public FindLeadsPage verifyresulttext(){
			
			verifyTextByXpath(prop.getProperty("Findleads.verifyleadsearch.xpath"), "No records to display");
			return this;
			
			
		}
		
		
}
