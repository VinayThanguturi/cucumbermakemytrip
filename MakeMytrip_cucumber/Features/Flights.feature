Feature: Flight Search on MakeMyTrip

  Scenario: Search for round trip flights
    Given user navigate the flight page
    When user select flight module
    And user select round trip
    And user select from location
    And user enter From Location
    And user select entered from text
    And user select to location
    And user enter To Location
    And user select entered to text
    Then clcik on search button
