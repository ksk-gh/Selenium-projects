package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.CreateLead;
import pages.MyLeads;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="login to LeafTaps And Create a new lead";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName,String cmpyName, String fName,String lName,String phNo,String vFName){		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCrmLink()		
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cmpyName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhoneNumber(phNo)
		.clickCreateLeadButton()
		.verifyFirstName(vFName)
		;
				
				
	}

}
