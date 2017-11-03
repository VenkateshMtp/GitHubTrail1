package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC003_CreateLead extends ProjectWrappers{

	
	@BeforeClass
	public void setData() {
		testCaseName = "CreateLeads";
		testDescription = "Creating Leads in Leaftap";
		authors = "Venkat";
		category = "Sanit";
		dataSheetName = "TC003";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void CreatingLead(String uName, String pwd, String cName, String fName, String lName ){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyname(cName)
		.enterFirstName(fName)
		.enterSecondName(lName)
		.clickSubmitButtion()
		.verifyCompanyName(cName) 
		.verifyFirstyName(fName)
		.verifyLastName(lName);
		
		
	}

}
