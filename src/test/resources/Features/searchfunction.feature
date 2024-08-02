Feature: Search functionality

Scenario: Verify the search functionality on amazon website

Given user is on Amazon homepage
When user enters "laptop" into the search box
And user clicks on search button 
Then list of search results should be displayed for "laptop"


