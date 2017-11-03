package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class ViewLeadPage extends ProjectWrappers {	
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("This is not View Lead Page", "Fail");
		}		
	}
	
	
	public ViewLeadPage verifyCompanyName(String data){
 		verifyTextContainsById("viewLead_companyName_sp", data);
		return this;
	}
	
	public ViewLeadPage verifyFirstyName(String data){
		verifyTextById("viewLead_firstName_sp", data);
		return this;
	}
	
	public ViewLeadPage verifyLastName(String data){
		verifyTextById("viewLead_lastName_sp", data);
		return this;
	}
	
	public ViewLeadPage verifyViewPage(String data){
		verifyTextByXpath("//div[@class ='x-panel-tc']/div [text()='View Lead']", data);
		return this;
	}
	

	public EditLeadPage clickEditLead(){
		clickByLink("Edit");
		return  new EditLeadPage(driver, test);
		
	}

 
	public MyLeadsPage clickDeleteLead(){ 
		clickByLink("Delete");
		return new MyLeadsPage(driver, test);
	}
	 
	 
	public DuplicateLeadPage clickDuplicateID() {
		clickByLink("Duplicate Lead");
		return new DuplicateLeadPage(driver, test);
	}

	public FindLeadPage clickFindLead(){
		clickByLink("Find Leads");
		return new FindLeadPage(driver, test);
		
	}
	
	}

	
 
	
	
	
	











