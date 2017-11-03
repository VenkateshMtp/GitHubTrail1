package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class DuplicateLeadPage extends ProjectWrappers {	
	
	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM")) {
			reportStep("This is not Create Lead Page", "Fail");
		}		
	}
	
	
	
	 
	
	public   ViewLeadPage clickSubmitButtion(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);
		
		
	}
	}

	 
 
	
	
	
	











