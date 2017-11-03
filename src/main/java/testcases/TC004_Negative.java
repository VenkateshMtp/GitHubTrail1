package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC004_Negative extends ProjectWrappers{

	
	@BeforeClass
	public void setData() {
		testCaseName = "CreateLeads";
		testDescription = "Login and LogOut in LeafTaps";
		authors = "Venkat";
		category = "Sanit";
		dataSheetName = "TC004";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String cName, String fName, String lName ){
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
