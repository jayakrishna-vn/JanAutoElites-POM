package pages;

import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	
	// click on Find Lead in My Leads page
	
	public FindLeadsPage clickFindLead(){
		
		clickByLink(prop.getProperty("Myleads.findlead.link"));
		
		return new FindLeadsPage();

	}
	
}
