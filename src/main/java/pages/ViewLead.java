package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement firstNameVerification;
	
	@Then("Verify Lead is successfully created for (.*)")
	public ViewLead verifyFirstName(String data)
	{

		verifyExactText(firstNameVerification,data);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement editButton;
	
	@And("click the Edit button")
	public OpenTapsCRM clickEditButton()
	{
		click(editButton);
		return new OpenTapsCRM();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement deleteButton;
	@When("click the delete button")
	
	public MyLeads clickDeleteButton()
	{
		click(deleteButton);
		return new MyLeads();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement duplicateButton;
	
	@And("click the duplicate lead button")
	public DuplicateLead clickDuplicateButton()
	{
		click(duplicateButton);
		return new DuplicateLead();
		
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement vCompanyName;
	
	@Then("verify the company name as (.*)")
	public ViewLead verifyCompanyName(String data)
	{
		verifyPartialText(vCompanyName,data);
		return this;
	}
	
	/*@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement visibleDeleteButton;
	
	public ViewLead noVisibleDeleteButton()
	{
		verifyNotDisplayed(visibleDeleteButton);
		return this;
		
	}*/
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement clickFindLeadsLink;
	
	@And("click the find leads button in the View lead page")
	public FindLeads clickFindLeadsLink()
	{
		click(clickFindLeadsLink);
		return new FindLeads();
	}
}
