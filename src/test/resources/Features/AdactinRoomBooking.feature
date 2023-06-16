
@tag
Feature: This feature is to Booking for room in Adactin website
	
  @tag1
  Scenario: This scenario is to Room booking for the one-Adult
    Given To load the Adactin Browser and Login with credential
    When providing the customer details for room booking
    Then To close the adactin browser
    
    @tag2
  Scenario: This scenario is to Room booking for the two-Adult
    Given To load the Adactin Browser and Login with second credential
    When providing the second customer detail for room booking
    Then To close the adactin browser 
    
    @tag3
  Scenario: This scenario is to Room booking for the third-Adult
    Given To load the Adactin Browser and Login with third credential
    When providing the third customer detail for room booking
    Then To close the adactin browser 
    
  