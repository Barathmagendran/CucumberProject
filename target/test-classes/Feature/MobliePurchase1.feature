#Author: your.email@your.domain.com
Feature: Mobile purchase in EBay
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given User Launches the EBay Website.
    When user Will Search the Redmi mobile.
    And user will select the mobile.
    And user will add into the cart.
    And user will select the storage size.
    And user will select the colour
    And user will click the BuyNow option
    And the user will login.
    Then user will make the payments.
    And user will recive the conformation message.

  
  Scenario: Title of your scenario
    Given User Launches the EBay Website.
    When user Will Search by one dim map.
      | phone1 | Redmi Mobiles |
      | phone2 | oneplus       |
      | phone3 | nokia         |
    And user will select the mobile.
    And user will add into the cart.
    And user will select the storage size.
    And user will select the colour
    And user will click the BuyNow option
    And the user will login.
    Then user will make the payments.
    And user will recive the conformation message.
