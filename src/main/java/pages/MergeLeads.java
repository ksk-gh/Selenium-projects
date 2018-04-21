package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods {

	public MergeLeads()
	{
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement fromLeadImageButton;
	
	@And("click the from lead image icon")
	public FindLeadsWindow clickFromLeadImageButton()
	{
		click(fromLeadImageButton);
		switchToWindow(1);
		return new FindLeadsWindow();
	}
	
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement toLeadImageButton;
	
	@And("click the to lead image icon")
	public FindLeadsWindow clickToLeadImageButton()
	{
		click(toLeadImageButton);
		switchToWindow(1);
		return new FindLeadsWindow();
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement mergeButton;
	
	@And("click the merge button to merge the lead")
	public ViewLead clickMergeButton()
	{
		click(mergeButton);
		acceptAlert();
		return new ViewLead();
	}
	
	
	
	
}
