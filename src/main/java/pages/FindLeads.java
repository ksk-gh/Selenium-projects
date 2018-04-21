package pages;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindLeads extends ProjectMethods {
	public static String verifyText;
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//span[text()='Name and ID']/following::input[2]")
	private WebElement firstName;
	
	@And("enter the first name to find as (.*)")
	public FindLeads enterFirstName(String data)
	{
		type(firstName,data);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Name and ID']/following::input[1]")
	private WebElement leadId;
	
	@And("Enter the Lead id to find")
	public FindLeads enterLeadId(String data)
	{
		type(leadId, data);
		return this;
	}
	

	@And("enter the captured value")
	public FindLeads enterCapturedLeadId()
	{
		type(leadId, FindLeadsWindow.fromLeadId);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='x-btn-text'][text()='Find Leads']")
	private WebElement clickFindLeadsBtn;
	
	@And("click the Find leads button")
	public FindLeads clickFindLeadsBtn()
	{
		click(clickFindLeadsBtn);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement firstTableElement;
	
	@And("click the first element")
	public ViewLead clickFirstElement()
	{
		click(firstTableElement);
		return new ViewLead();
	}
	
	@And("get the first element")
	public FindLeads getFirstElement()
	{
		
		verifyText=getText(firstTableElement);
		return this;
	}
	
	@And("Enter the captured text")
	public FindLeads typeActualText()
	{
		type(leadId,verifyText);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	private WebElement verifyWarningText;
	
	@Then("Verify the error message (.*)")
	public FindLeads verifyWarningMsg(String data) throws InterruptedException
	{
		Thread.sleep(4000);
		verifyExactText(verifyWarningText, data);
		return this;
	}
	
}
