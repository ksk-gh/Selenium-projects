package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {
public DuplicateLead()
{
	PageFactory.initElements(driver,this);
}

@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
private WebElement createDuplicateLead;

@And("click the create lead button")
public ViewLead clickCreateDuplicateButton()
{
	click(createDuplicateLead);
	return new ViewLead();
}



}
