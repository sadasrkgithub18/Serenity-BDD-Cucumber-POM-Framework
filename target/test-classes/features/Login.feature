Feature: Login validation
  
  As a Registered user
  I want to verify login status
  is successful or not

  Scenario Outline: Login with valid redentials
    Given when user naviates to login pae
    When user enters <userName>
    And when user enters <password>
    And when user clicks on login button
    Given when user is on open task page
    When when user clicks on link
    And when user clicks on add new cutomer
    And user enterscustomer name to add "<name>"
    And when user clicks on create customer button
    Then new cutomer should be created
    Given when user is on Proj and customers Page
    When user click on customer link to delete
    Then user clicks on delete the cutomer button
    Then user should be deleted sucessfully

    Examples: 
      | userName | password | name |
      | admin    | manager  | OLAM |
      | admin    | manager  | OLAM |
      | admin    | manager  | OLAM |
