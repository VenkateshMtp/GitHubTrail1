package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class FindLeadPage extends ProjectWrappers {	
	
	public FindLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads | opentaps CRM")) {
			reportStep("This is not Find Leads Page", "Fail");
		}		
	}
 

	public FindLeadPage enterFirstName(String data){
		enterByXpath("(//input[@name ='firstName'])[3]", data);
		return this;
	}
	

	public FindLeadPage enterPhoneNumber(String data){
		enterByXpath("//input[@name='phoneNumber']", data);
		return this;
	}
	

	public FindLeadPage selectPhoneTab() {
		clickByLink("Phone");
		return this;
	}
	
	public FindLeadPage enterLeadId(String data) {
	 
		enterByName("id", data);
 		return this; 
	}
	
	public FindLeadPage enterLeadName(String text){
		enterByXpath("(//div[@class='x-form-element'])[19]", text);
 		return this;
		
	}
	
	public FindLeadPage clickFindLeads(){
 		clickByXpath("//td[@class='x-panel-btn-td']//button[text()='Find Leads']");
		
		return this;
	}
	
	public FindLeadPage verifyDeletedId(String text) {
		verifyTextByXpath("//div[@class='x-paging-info']", text);
		return this;
		
	}
	public ViewLeadPage selectFirstLeadId() throws InterruptedException {
		Thread.sleep(2000);
		firstLeadId =getTextByXpath("(//div[@class='x-grid3-body']//a)[1]");
		System.out.println(firstLeadId);
		clickByXpath("(//div[@class='x-grid3-body']//a)[1]");
		return new ViewLeadPage(driver, test);
		
		 //div[@class='x-grid3-body']//a)[1] 
	}
	
	
	 
	
	public FindLeadPage selectEMailTab() {
		clickByXpath("//span[text()='Email']");
		return this; 
	}

	public FindLeadPage enterEmailID(String data){
		enterByName("emailAddress",data);
		return this;
	}
	

}











