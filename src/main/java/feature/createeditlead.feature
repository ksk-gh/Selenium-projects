Feature: Create Leads in leaftaps
@Smoke @Sanity
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
|DemoSalesManager|crmsfa|Sankar|Kadhirvelan|CTS|

#
#Scenario Outline: Edit Leads in leaftaps - positive
#
#Given enter the username as <uName>
#And enter the password as <pwd>
#And click on login
#And click on crm/sfa
#And click on Leads
#And click on Find leads link
#And enter the first name to find as <fName>
#And click the Find leads button
#And click the first element
#And click the Edit button
#And enter the company name to update <cmpyName>
#When click the update button
#Then verify the company name as <cmpyName>
#
#Examples:
#|uName|pwd|fName|cmpyName|
#|DemoSalesManager|crmsfa|Sankar|Zoho|
#|DemoCSR|crmsfa|Sankar|Zoho|