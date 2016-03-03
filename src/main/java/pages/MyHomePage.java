package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyHomePage extends OpentapsWrappers{

	
	public MyHomePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT My Home page", "FAIL");
		}

	}
	
	
	
	// click Leads tab
		public MyLeadsPage clickLeadsTab(){
			
			clickByLink(prop.getProperty("Myhome.leadstab.link"));
			
			return new MyLeadsPage();
		}
		
		
	// Create Leads side option
		
		public CreateLeadsPage clickLeadOption(){

		    clickByLink(prop.getProperty("Myhome.createLeadoption.link"));
			
			return new CreateLeadsPage();
			
		}
		
		
	// Click on Contacts Tab
		
		public MyContactsPage clickContactsTab(){
			
			
		clickByLink(prop.getProperty("Myhome.contactstab.link"));
			
		return new MyContactsPage();
			
			
			
		}
		
		
		
		
		}
		
	

