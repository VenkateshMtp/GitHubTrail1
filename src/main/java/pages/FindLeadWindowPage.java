package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class FindLeadWindowPage extends ProjectWrappers {	
	
	public FindLeadWindowPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads")) {
			reportStep("This is not Find Leads Page", "Fail");
		}		
	}
 
	public FindLeadWindowPage enterLeadID(String data){
		 
		enterByName("id", data);
		return this;

	}
	
	 public FindLeadWindowPage getFirstIdInWindow() {
		 firstLeadId = getTextByXpath("(//table[@class='x-grid3-row-table']//a[@class='linktext'])[1]");
		 return this;
	 }
	
	public FindLeadWindowPage clickFindLeadInWindow() {
		clickByXpath("//button[text()='Find Leads']");
		return this;

	}
	
	
	public MergeLeadPage selectFirstLeadInWindow(){
		clickByXpathNoSnap( "(//table[@class ='x-grid3-row-table']//a)[1]");
		switchToParentWindow();

		return new MergeLeadPage(driver, test);

	}
 

	 
	
	 
 

 
	

}











