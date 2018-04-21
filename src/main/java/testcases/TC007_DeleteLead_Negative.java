package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead_Negative extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLeads";
		testDescription="Login and Editing a lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sankar";
		browserName="chrome";
		dataSheetName="TC007";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void deleteLeadNeagtive(String uName,String pwd,String vName,String fName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCrmLink()		
		.clickLeadsLink()
		.clickFindLeadsLink()
		.enterFirstName(fName)
		.clickFindLeadsBtn()
		.clickFirstElement()
		/*.noVisibleDeleteButton()*/
		;

	}
}
