Feature: Login to Orange HRM web page 

@tc01_PositiveTC 
Scenario Outline: To verify whether user able to login the Orange HRM 

	Given the user launch the web browser 
	When the user gives username "<username>" 
	And  the user gives password "<password>" 
	And the user clicks the login button
	Then Orange HRM home page should be displayed 
	
Examples: 
	| username|password|
	|Admin|admin123|
	|John|john123|