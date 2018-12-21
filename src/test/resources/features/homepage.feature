Feature: go to home page

Scenario: after login success then should be redirected to the home page

Given I'm authentified with user appUser and password appPass on the url http://localhost:8080/appname/api/authenticate
When I ask for the current user calling "http://localhost:8080/appname/api/users/current"
Then I get OK response

When login success
Then i should be redirected to the home page
And i should be greeted