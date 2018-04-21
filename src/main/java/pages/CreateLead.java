package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {
public CreateLead(){
	PageFactory.initElements(driver,this);
}
@FindBy(how=How.ID,using="createLeadForm_companyName")
private WebElement companyName;
@And("enter Company Name as (.*)")
public CreateLead enterCompanyName(String data)
{
	 type(companyName,data);
	 return this;
}

@FindBy(how=How.ID,using="createLeadForm_firstName")
private WebElement firstName;
@And("enter the First Name as (.*)")
 public CreateLead enterFirstName(String data)
 {
	 type(firstName,data);
	 return this;
 }
 
 @FindBy(how=How.ID,using="createLeadForm_lastName")
 private WebElement lastName;
 @And("enter the Last Name as (.*)")
 public CreateLead enterLastName(String data)
 {
	 type(lastName,data);
	 return this;
 }
 
 
 @FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
 private WebElement phoneNumber;
 
 public CreateLead enterPhoneNumber(String data)
 {
	 type(phoneNumber,data);
	 return this;
 }
 
 @FindBy(how=How.NAME,using="submitButton")
 private WebElement createLeadButton;
 @When("click on Create Lead Button")
 public ViewLead clickCreateLeadButton()
 {
	 click(createLeadButton);
	 return new ViewLead();
 }



}
