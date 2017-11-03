package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class HomePage extends ProjectWrappers {	
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("This is not Home Page", "Fail");
		}		
	}
	
	public HomePage verfiyUserName(String text) {
		verifyTextContainsByXpath("//h2[text()[contains(.,'Demo')]]", text);
		return this;
	}	
	
	public LoginPage clickLogOut() {
		clickByClassName("decorativeSubmit");
		return new LoginPage(driver, test);
		
	}
	
	public MyHomePage clickCRMSFA() {
		clickByLink("CRM/SFA");
		return new MyHomePage(driver, test);
		
	}
	
	
	
}










