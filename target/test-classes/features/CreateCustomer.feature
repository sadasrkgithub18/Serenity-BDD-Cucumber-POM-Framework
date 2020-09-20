Feature: create customer
  
  As a user
  I would like to check
  create customer feature

  Scenario Outline: Create customer with name OLAM
    Given when user is on open task page
    When when user clicks on link
    And when user clicks on add new cutomer
    And user enterscustomer name to add "<name>"
    And when user clicks on create customer button
    Then new cutomer should be created

    Examples: 
      | name |
      | OLAM |
