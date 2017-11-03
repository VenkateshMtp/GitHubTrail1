package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC008_MergeLead extends ProjectWrappers{

	
	@BeforeClass
	public void setData() {
		testCaseName = "Merge Lead";
		testDescription = "Merge  Test Lead";
		authors = "Venkat";
		category = "Sanity";
		dataSheetName = "TC008";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void DeletingLead(String uName, String pwd,String firstID, String secondId ) throws InterruptedException{
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFromLeadId()
		.enterLeadID(firstID)
		.clickFindLeadInWindow()
		.getFirstIdInWindow()
		.selectFirstLeadInWindow()
		.clickToLeadId()
		.enterLeadID(secondId)
		.clickFindLeadInWindow()
		.selectFirstLeadInWindow()
		.mergeLead()
		.clickFindLead()
		.enterLeadId(firstLeadId)
		.clickFindLeads()
 		.verifyDeletedId("No records to display");

		 
		
	}

}
