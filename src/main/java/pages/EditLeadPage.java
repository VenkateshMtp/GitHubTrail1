package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class EditLeadPage extends ProjectWrappers {	
	
	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("opentaps CRM")) {
			reportStep("This is not Create Lead Page", "Fail");
		}		
	}
		
	
	
	public EditLeadPage updateCompanyname(String data){
		enterById("updateLeadForm_companyName", "");
		enterById("updateLeadForm_companyName", data);
		return this;
	}
 
	
	public EditLeadPage UpdateFirstName(String data){
		enterById("updateLeadForm_firstName", data);
		return this;
	}
 
	public EditLeadPage updateSecondName(String data){
		enterById("updateLeadForm_lastName", data);
		return this;
	}
		
	
	public   ViewLeadPage clickSubmitButtion(){
		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);
		
		
	}
	
	
	
	}

	 
 
	
	
	
	











