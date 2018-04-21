Feature: Delete Lead in leaftaps

Scenario Outline: Deleting a Lead in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And click on crm/sfa
And click on Leads
And click on Find leads link
And enter the first name to find as <fName>
And click the Find leads button
And click the first element
And click the duplicate lead button
When click the create lead button
Then Verify Lead is successfully created for <vName>  

Examples:
|uName|pwd|fName|vName|
|DemoSalesManager|crmsfa|Sankar|Sankar|
|DemoSalesManager|crmsfa|Rajesh|Rajesh|