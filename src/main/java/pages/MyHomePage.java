package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MyHomePage extends ProjectWrappers {	
	
	public MyHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Home | opentaps CRM")) {
			reportStep("This is not My Home Page", "Fail");
		}		
	}
	
	
	
	public MyLeadsPage clickLeads() {
		clickByLink("Leads");
		return new MyLeadsPage(driver, test);
		
	}
	
	
	
}










