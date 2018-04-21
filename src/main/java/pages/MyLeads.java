package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createLeadLink;
	@And("click on Create Leads")
	public CreateLead clickCreateLeadLink()
	{
		click(createLeadLink);
		return new CreateLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement mergeLeadsLink;
	
	@And("click on the merge leads link")
	public MergeLeads clickMergeLeadsLink()
	{
		click(mergeLeadsLink);
		return new MergeLeads();
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findLeads;
	@And("click on Find leads link")
	
	public FindLeads clickFindLeadsLink()
	{
		click(findLeads);
		return new FindLeads();
	}
}
