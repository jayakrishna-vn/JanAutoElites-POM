package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadsPage extends OpentapsWrappers{

	
	public CreateLeadsPage() {

		if(!verifyTitle("Create Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT Create Contacts page", "FAIL");
		}
	
	}

	public CreateLeadsPage enterCname(String cname){
		
		enterById(prop.getProperty("CreateLeads.entercnm.id"), cname);
			
		return this;
	
	}
	
    public CreateLeadsPage enterFname(String fname){
		
		enterById(prop.getProperty("CreateLeads.enterfnm.id"), fname);
			
		return this;
	
	}

    public CreateLeadsPage enterLname(String lname){
		
		enterById(prop.getProperty("CreateLeads.enterlnm.id"), lname);
			
		return this;
	
	}
	
    
	public ViewLeadsPage clickLeadB(){
		
		clickByXpath(prop.getProperty("CreateLeads.clickCreateLeadB.xpath"));
		
		return new ViewLeadsPage();
    
	} 
    
    
    
    
}
