
Feature: succesfful booking of flight ticket

Scenario: validate the user is able to book the flight successfully 

Given user is on makemytripHomePage
When user selects from location "Bangalore"
And user Selects To location "Singapore"
And user selects "2" adults and "1" children
When user selects "travel class economy"
Then user must be able to book the flight ticket