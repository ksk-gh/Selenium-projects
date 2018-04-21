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
And get the first element
And click the first element
And click the delete button
And click on Find leads link
And Enter the captured text
When click the Find leads button
Then Verify the error message <vError>

Examples:
|uName|pwd|fName|vError|
|DemoSalesManager|crmsfa|Sankar|No records to display|
|DemoSalesManager|crmsfa|Rajesh|No records to display|