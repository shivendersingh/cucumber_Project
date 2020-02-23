Feature: Create User 
Scenario Outline: Verification of create user 
	Given goto signup page 
	When Enter the details as "<name>" and "<phone>" and "<email>" and "<password>"
	And user is created
	Then user is created 
Examples:	
| name | phone | email | password |  
|shivender|12213223|a@gmail.com|sadass| 
|shivender|12213223|a@gmail.com|sadass| 
|shivender|12213223|a@gmail.com|sadass| 
	