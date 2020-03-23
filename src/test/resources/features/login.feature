  @endtoend
  Feature: The Login Page should allow someone to login
	As a returning customer (role) 
	I want to login to the application(feature)
	So that I can view my account balance (business value)
	
	@goodlogin
	Scenario: The user should be able to login with valid credentials
		Given the user is on the login page
		When the user enters valid credentials
		Then the user should be able to view account balance
		
	Scenario: The user should not be able to login with bad credentials
			Given the user is on the login page
			When the user enters bad credentials
			Then the user should not be able to login
	
	Scenario Outline: the user should be able to login
			Given the user is on the login page
			When the user enters "<username>" and "<password>"
			Then the user should be able to view account balance
			
	
	Examples:
	| username | password |
	| tim@testemail.com | trpass |
	| lisa@testemail.com | Cfail |