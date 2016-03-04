package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class OPCRMPage extends OpentapsWrappers{
	
	public OPCRMPage() {

		if(!verifyTitle("opentaps CRM")){
			Reporter.reportStep("This is NOT  opentaps CRM page", "FAIL");
		}

	}
	
	
	public OPCRMPage updateContactDetails(String fname){
		
		enterByXpath(prop.getProperty("OPCRM.editfname.xpath"), fname);
		
		return this;
		
	}
	
	public ViewContactsPage clickUpdateContactButton(){
		
		
		clickByXpath(prop.getProperty("OPCRM.updatecontactbutton.xpath"));
		return new ViewContactsPage();
	}


	
	
	
	
}
