Feature: Search functionality


Scenario: Verify the search functionality on amazon website


Given user is on Amazon homepage
When user enters "Dell Laptop" into the search box
And user clicks on search button 
Then Search result should be displayed for "Dell Laptop" ;



#Scenario Outline: Verify the search functionality on amazon website


#Given user is on Amazon homepage
#When user enters "<product name>" into the search box
#And user clicks on search button 
#Then list of search results should be displayed for "<product name >"
#Then user clicks on first result and verify the productname
   #
#
#Examples: 
         #|product name|
         #|The money guide|
         #|LIGHT ON YOGA|
         #|Runaways: Teenage Wasteland|
         #
         
         

    
    