package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC005_EditLead extends ProjectWrappers{

	
	@BeforeClass
	public void setData() {
		testCaseName = "EditLeads";
		testDescription = "Editing Test Lead";
		authors = "Venkat";
		category = "Sanity";
		dataSheetName = "TC005";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void EditingLead(String uName, String pwd,String fNamRep, String cName,String fName, String lName   ) throws InterruptedException{
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead() 
		.enterFirstName(fNamRep)
		.clickFindLeads()
		.selectFirstLeadId()
		.clickEditLead()
		
 		.updateCompanyname(cName)
		.UpdateFirstName(fName)
		.updateSecondName(lName)
 
		.clickSubmitButtion()
		.verifyCompanyName(cName)
		.verifyFirstyName(fName)
		.verifyLastName(lName);
	 
		
	}

}
