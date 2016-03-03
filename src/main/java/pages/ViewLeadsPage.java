package pages;

import utils.Reporter;

public class ViewLeadsPage extends FindLeadsPage {

	
	public ViewLeadsPage() {

		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT View Leads page", "FAIL");
		}

	}
	
	
	public MyLeadsPage clickDeleteLeadButton(){
		
		clickByXpath(prop.getProperty("ViewLeads.clickdeletebutton.xpath"));
		
		return new MyLeadsPage();
		
		
	}
	
	
	
	
}
