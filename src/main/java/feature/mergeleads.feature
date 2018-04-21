Feature: Merge Leads in leaftaps

Scenario Outline: Merging two Lead in leaftaps - positive

Given enter the username as <uName>
And enter the password as <pwd>
And click on login
And verify the login name <vUName>
And click on crm/sfa
And click on Leads
And click on the merge leads link
And click the from lead image icon
And Get the first element of the table
And Enter the first element in the Lead id
And click the find leads button in the window
And click the element in the table
And switch to the default window
And click the to lead image icon
And Get the second element of the table
And Enter the second element in the lead id
And click the find leads button in the window
And click the element in the table
And switch to the default window
And click the merge button to merge the lead
And click the find leads button in the View lead page
And enter the captured value
When click the Find leads button
Then Verify the error message <vError>

Examples:
|uName|pwd|vUName|vError|
|DemoSalesManager|crmsfa|Demo Sales Manager|No records to display|
|DemoSalesManager|crmsfa|Demo Sales Manager|No records to display|