package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_DuplicateLeads";
		testDescription="Login and creating a duplicate lead";
		testNodes="Duplicate Leads";
		category="Smoke";
		authors="Sankar";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName,String pwd,String vName,String fName,String vFName) {
		
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
		.clickDuplicateButton()
		.clickCreateDuplicateButton()
		.verifyFirstName(vFName);
		
	}
	
}
