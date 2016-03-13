package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadsPage extends OpentapsWrappers {

	
	public ViewLeadsPage() {

		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT View Leads page", "FAIL");
		}

	}
	
   public ViewLeadsPage verifyCompanyName(String Cname){
		
		verifyTextById(prop.getProperty("ViewLeads.verifyCnm.id"), Cname);
		
		return this;
		
	}
	
	public ViewLeadsPage verifyFnm(String fname) {
	
		
	     verifyTextById(prop.getProperty("ViewLeads.verifyFnm.id"), fname);
		
		return this;
		
	}

	public ViewLeadsPage verifyLnm(String lname){
		
	verifyTextById(prop.getProperty("ViewLeads.verifyLnm.id"), lname);
		
		return this;
	}

  public MyLeadsPage clickDeleteLeadButton(){
		
		clickByXpath(prop.getProperty("ViewLeads.clickdeletebutton.xpath"));
		
		return new MyLeadsPage();
		
		
	}
	
	
	
	
}
