package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLeads";
		testDescription="Login and Editing a lead";
		testNodes="Edit Leads";
		category="Smoke";
		authors="Sankar";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void editLeads(String uName,String pwd,String vName,String fName, String companyName,String vCompanyName) {
		
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
		.clickEditButton()
		.enterCompany(companyName)
		.clickUpdateButton()
		.verifyCompanyName(vCompanyName)
		;
		
	}

}
