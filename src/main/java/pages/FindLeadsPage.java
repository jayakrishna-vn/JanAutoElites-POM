package pages;

import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{

	
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
			
			clickByXpath(prop.getProperty("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a"));
			
			return new ViewLeadsPage();
			
		}
		
		
		// Verify of the lead id get deleted or not
		public FindLeadsPage verifyresulttext(){
			
			verifyTextByXpath(prop.getProperty("Findleads.verifyleadsearch.xpath"), "No records to display");
			return this;
			
			
		}
		
		
}
