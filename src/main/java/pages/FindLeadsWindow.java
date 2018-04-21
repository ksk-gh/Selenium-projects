package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadsWindow extends ProjectMethods{
	public static String fromLeadId;
	public static String toLeadId;
	
	public FindLeadsWindow()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="(//div[contains(@class,'x-grid3-col-partyId')]/a)[1]")
	private WebElement firstLeadElement;
	
	@And("Get the first element of the table")
	public FindLeadsWindow getFirstLeadElement()
	{
		fromLeadId=getText(firstLeadElement);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[contains(@class,'x-grid3-col-partyId')]/a)[2]")
	private WebElement secondLeadElement;
	
	@And("Get the second element of the table")
	public FindLeadsWindow getSecondLeadElement()
	{
		toLeadId=getText(secondLeadElement);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement enterFromLeadId;
	
	@And("Enter the first element in the Lead id")
	public FindLeadsWindow enterLeadIdToMerge()
	{
		type(enterFromLeadId,fromLeadId);
		return this;
	}
	
	@And("Enter the second element in the lead id")
	public FindLeadsWindow enterToLead()
	{
		type(enterFromLeadId,toLeadId);
		return this;
	}

	@And("click the element in the table")
	public FindLeadsWindow clickFirstLeadElement() throws InterruptedException
	{
		click(firstLeadElement);
		
		return this;
	}
	
/*	public FindLeadsWindow clickSecondLeadElement() throws InterruptedException
	{
		click(secondLeadElement);
		
		return this;
	}*/
	
	@And("switch to the default window")
	public MergeLeads switchDafaultWindow()
	{
		switchToWindow(0);
		return new MergeLeads();
	}
	
	
	@FindBy(how=How.XPATH,using="//button[@class='x-btn-text']")
	private WebElement findLeadsButton;
	
	@And("click the find leads button in the window")
	public FindLeadsWindow clickFindLeadsBtn()
	{
		click(findLeadsButton);
		//switchToWindow(0);
		return this;
	}
	
	
	
	
}
