package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC007_DuplicateLead extends ProjectWrappers{

	
	@BeforeClass
	public void setData() {
		testCaseName = "Duplicate";
		testDescription = "Duplicate  Test Lead";
		authors = "Venkat";
		category = "Sanity";
		dataSheetName = "TC007";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void DeletingLead(String uName, String pwd,String eMail ) throws InterruptedException{
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.selectEMailTab()
		.enterEmailID(eMail)
		.clickFindLeads()
		.selectFirstLeadId()
		.clickDuplicateID()
		.clickSubmitButtion();
		
		
		  
	}

}
