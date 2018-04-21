package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;
public class OpenTapsCRM extends ProjectMethods {
	public OpenTapsCRM()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement companyName;
	@And("enter the company name to update (.*)")
	
	public OpenTapsCRM enterCompany(String data)
	{
		type(companyName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement updateButton;
	@When("click the update button")
	public ViewLead clickUpdateButton()
	{
		click(updateButton);
		return new ViewLead();
	}


}
