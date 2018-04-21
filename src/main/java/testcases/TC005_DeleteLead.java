package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Deleting a Lead";
		testNodes="Delete Leads";
		category="Smoke";
		authors="Sankar";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String vName,String fName,String errorMsg) throws InterruptedException {
		
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
		.getFirstElement()
		.clickFirstElement()
		.clickDeleteButton()
		.clickFindLeadsLink()
		.typeActualText()
		.clickFindLeadsBtn()
		.verifyWarningMsg(errorMsg)
		;
		
				
	}

}
