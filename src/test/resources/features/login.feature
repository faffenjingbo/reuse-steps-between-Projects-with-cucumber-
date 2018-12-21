Feature: login boss

Scenario: current user must login success

Given I'm authentified with user appUser and password appPass on the url http://localhost:8080/appname/api/authenticate
When I ask for the current user calling "http://localhost:8080/appname/api/users/current"
Then I get OK response