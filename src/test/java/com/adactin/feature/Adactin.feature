Feature: Booking Hotel Functionality

Background: User want to login the app
      Given user launching the adactin application
      When User enter the "vinovicky" in username field
      And User enter the "Jan@2020" in password field
      And user clicks login button
      Then User validate the username and password
   

Scenario Outline:: User want to login the app
      Given user launching the adactin application
      When User enter the "<username>" in username field
      And User enter the "<password>" in password field
      And user clicks login button
      Then User validate the username and password
      
      Examples:

         |username|password|      
         |Thiya|66666|
         |saran|171717|
         |vinovicky|Jan@2020|
      

Scenario: User want to search hotel
       When user enters the location
       And User enters the hotel
       And User enters the room type
       And User enters the number of rooms
       And User enters the check in date
       And User enters the check out date
       And User enters the Adults per room
       And User enters the children per room
       And User clicks the search button
       Then Validate the details of search hotel
       
       
Scenario: User confirms their selection
       When User selects the hotel
       When User clicks the submit button
       Then Validate the selection
       
       
       
Scenario: User entering personal and payment details for booking confirmation 
	When User enter "THIYA" the first name 
	And User enter "V" the second name 
	And User enter "Thanjavur" the Address 
	And User enter "6666666666666666" the credit card number 
	And User enter the cardtype 
	And User enter the month and year 
	And User enter "123" the cvv number 
	Then user Booking the hotel 
	
	
Scenario: user want to logout
     When User clicks the logout

