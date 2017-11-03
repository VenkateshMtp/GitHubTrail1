package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import pages.HomePage;
import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC002_LoginNegative extends ProjectWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName = "Login(Negative)";
		testDescription = "Login for Failure";
		authors = "Babu";
		category = "Sanity";
		dataSheetName = "TC002";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String errMsg) {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginForFailure()
		.verifyErrorMsg(errMsg);
	}

}



																																		








