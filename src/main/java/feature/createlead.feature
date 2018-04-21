Feature: Create Leads in leaftaps

Scenario Outline: Create Leads in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And click on crm/sfa
And click on Leads
And click on Create Leads
And enter Company Name as <cName>
And enter the First Name as <fName>
And enter the Last Name as <lName>
When click on Create Lead Button
Then Verify Lead is successfully created for <fName>


Examples:
|uName|pwd|fName|lName|cName|
|DemoSalesManager|crmsfa|Sathish|Kannan|TGS|
|DemoSalesManager|crmsfa|Sankar|Kadirvelan|CTS|