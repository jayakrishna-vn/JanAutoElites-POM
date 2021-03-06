package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{

	public HomePage() {

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			Reporter.reportStep("This is NOT Home page", "FAIL");
		}

	}
	// Verify the username
	public HomePage verifyLoggedinUserName(String userName){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), userName);
		return this;
	}
	
	// click crm/sfa
	public MyHomePage clickcrmsfa(){
		
		clickByLink(prop.getProperty("Home.crmsfalink.link"));
		
		return new MyHomePage();
	}
	
	
	
	
	public LoginPage clickLogout(){
		clickByClassName(prop.getProperty("Home.Logout.Class"));
		return new LoginPage();
	}
	
	
	
	
}
