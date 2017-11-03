package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MergeLeadPage extends ProjectWrappers {	
	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")) {
			reportStep("This is not Merge Lead Page", "Fail");
		}		
	}
	
	public FindLeadWindowPage clickFromLeadId() throws InterruptedException {
		
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		return new FindLeadWindowPage(driver, test);
		
	}
	
 
	
	public FindLeadWindowPage clickToLeadId() {
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new FindLeadWindowPage(driver, test);
		
	}
	
	public ViewLeadPage mergeLead(){
		clickByLinkNoSnap("Merge");	
		acceptAlert();
		return new ViewLeadPage(driver, test);


	}
	
		
	
	
	
	 
	}

	 
 
	
	
	
	











