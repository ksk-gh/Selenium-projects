package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC006_Merge Lead";
		testDescription="Merging a Lead";
		testNodes="Merge Leads";
		category="Smoke";
		authors="Sankar";
		browserName="chrome";
		dataSheetName="TC006";
	}
	
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName,String pwd,String vName, String vError) throws InterruptedException
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCrmLink()		
		.clickLeadsLink()
		.clickMergeLeadsLink()
		.clickFromLeadImageButton()
		.getFirstLeadElement()
		.enterLeadIdToMerge()
		.clickFindLeadsBtn()
		.clickFirstLeadElement()
		.switchDafaultWindow()
		.clickToLeadImageButton()
		.getSecondLeadElement()
		.enterToLead()
		.clickFindLeadsBtn()
		.clickFirstLeadElement()
		.switchDafaultWindow()
		.clickMergeButton()
		.clickFindLeadsLink()
		.enterCapturedLeadId()
		.clickFindLeadsBtn()
		.verifyWarningMsg(vError);
		
	}
	
	
	
	
}
