#Please Do not change Feature Templet
Feature: To test the application to calculate college fee for different type of student
#Please Do not change Scenario Outline Templet
Scenario Outline: To calculate college fee for different type of student
#Please Do not change Given Templet
Given Browser is launched and user is on application page
When User Enters student name,"<Type>", "<No>"
And User clicks on the calculate fee  button
Then "<collegefee>","<hostelfee>","<additionalfee>","<totalfee>" should be correctly displayed

|collegefee|hostelfee|additionalfee|totalfee|
|Rs.120000.0|--|--|Rs.120000.0|
|Rs.120000.0|Rs.75750.0|--|Rs.195750.0|
|Rs.120000.0|Rs.75750.0|Rs.15150.0|Rs.210900.0|
|Rs.120000.0|Rs.75750.0|--|Rs.195750.0|

Examples:
|Name|Type|No|
|Keerthi|2|0|
|Keerthi|1|0|
|Keerthi|1|2|
|Keerthi|1|3|