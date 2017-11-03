package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC006_DeleteLead extends ProjectWrappers{

	
	@BeforeClass
	public void setData() {
		testCaseName = "DeleteLeads";
		testDescription = "Deleting  Test Lead";
		authors = "Venkat";
		category = "Sanity";
		dataSheetName = "TC006";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void DeletingLead(String uName, String pwd,String phNumber ) throws InterruptedException{
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead() 
		.selectPhoneTab() 
		 
		.enterPhoneNumber(phNumber)
		.clickFindLeads()
		.selectFirstLeadId()
		.clickDeleteLead()
		
		// to verify the deleted id
		.clickFindLead()
		.enterLeadId(firstLeadId)
		.clickFindLeads()
		
		.verifyDeletedId("No records to display");
				
		
 
	}

}
